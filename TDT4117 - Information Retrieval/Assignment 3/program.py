import random
import codecs
import re
import gensim

# Custom class for support
from functions import Function

# functions for help
funct = Function()

# 1.0. Fix random numbers generator
random.seed(123)

# 1.1 Open and load the file
f = codecs.open("pg3300.txt", "r", "utf-8")
parText = f.read()
f.close()

# 1.2. Partition file into separate paragraphs
paragraphs = funct.split_into_paragraphs(parText)

# 1.3. Remove (filter out) paragraphs containing the word “Gutenberg”
paragraphs = funct.remove_gutenberg_word(paragraphs, "Gutenberg".lower())

# 1.4. Tokenize paragraphs (split them into words)
words = funct.split_into_words(paragraphs[:])

# 1.5. Remember to remove from the text punctuation
processed_words = funct.eliminate_punctuations(words)

# 1.6. Using PorterStemmer stem words
stemmed_words = funct.stemmed_lists(processed_words)


# 2.1 Building dictionary
dictionary = gensim.corpora.Dictionary(stemmed_words)

# 2.1 Filter out stopwords 
stop_word_ids = funct.stopword_locations(dictionary)
dictionary.filter_tokens(stop_word_ids)

# 2.2 Map paragraphs into Bags-of-Words using the dictionary
bagOfWords = funct.bag_of_words(stemmed_words, dictionary)


# 3.1 Build TF-IDF model using corpus
tfidfModel = gensim.models.TfidfModel(bagOfWords)

# 3.2 Map Bags-of-Words into TF-IDF weights
tfidfCorpus = tfidfModel[bagOfWords]

# 3.3 Construct MatrixSimilarity object
tfidfSimilarityMat = gensim.similarities.MatrixSimilarity(tfidfCorpus)

# 3.4 Repeat 3.1, 3.2 and 3.3 for LSI model using as an input the corpus with TF-IDF weights
lsiModel = gensim.models.LsiModel(tfidfCorpus, id2word=dictionary, num_topics=100)
lsiCorpus = lsiModel[bagOfWords]
lsiSimilarityMat = gensim.similarities.MatrixSimilarity(lsiCorpus)

# 3.5 Report and try to interpret first 3 LSI topics
print(lsiModel.show_topics(3))

# 4.1 For the query applying all the necessary transformation
givenQuery = "What is the function of money?"
givenQuery = givenQuery.split(" ")
givenQuery = funct.eliminate_punctuations_in_words(givenQuery)
givenQuery = funct.stemmed_list(givenQuery)

givenQuery = dictionary.doc2bow(givenQuery)

# 4.2 Convert BOW to TF-IDF representation
tfidfQuery = tfidfModel[givenQuery]


# To find the top 3 according to TF-IDF
theDocs = enumerate(tfidfSimilarityMat[tfidfQuery])
docs = sorted(theDocs, key=lambda kv: -kv[1])[:3]
for j, (k, theScore) in enumerate(docs):
    print("[paragraph: %d]" % (k))
    for lin, line in enumerate(paragraphs[k].split('\n')):
        if lin == 5:
            print("...")
            break
        print(line)
    print()


#To find the top 3 according to LSI

lsiQuery = lsiModel[tfidfQuery]
doc2similarity = enumerate(lsiSimilarityMat[lsiQuery])
docs = sorted(doc2similarity, key=lambda kv: -kv[1])[:3]
for j, (k, theScore) in enumerate(docs):
    print("[paragraph: %d]" % (k))
    for lin, line in enumerate(paragraphs[k].split('\n')):
        if lin == 5:
            print("...")
            break
        print(line)
    print()
