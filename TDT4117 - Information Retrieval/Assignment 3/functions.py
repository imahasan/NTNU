import string
import gensim
from nltk.stem.porter import PorterStemmer


class Function():

    # initiator for translator, punctuation and stammer
    def __init__(self):
        self.translator = str.maketrans(
            '',
            '',
            string.punctuation + "\n\r\t")
        self.stemmer = PorterStemmer()

	# Below function splited parragraphs
    def split_into_paragraphs(self, text):
        text = text.split('\r\n\r\n')
        return [p for p in text if p] 

	# Below function removed gutenberg paragraphs
    def remove_gutenberg_word(self, paragraphs, word):
        return [p for p in paragraphs if word not in p.lower()] 

	# Below function spits paragraphs in words
    def split_into_words(self, paragraphs):
        for i, j in enumerate(paragraphs):
            paragraphs[i] = j.split(" ")
        return paragraphs

	# Below two functions eliminates stopwords from words
	#Function 1
    def eliminate_punctuations_in_words(self, words):
        for j, word in enumerate(words):
            words[j] = word.lower().translate(self.translator)
        return [pun for pun in words if pun]

	#Function 2
    def eliminate_punctuations(self, paragraphs):
        return [self.eliminate_punctuations_in_words(wrd) for wrd in paragraphs]

	#Below 2 functions used from stemming
	#Stemming words
    def stemmed_list(self, words):
        print(words)
        for i, word in enumerate(words):
            words[i] = self.stemmer.stem(word)
        return words

	#Stemming paragraphs
    def stemmed_lists(self, paragraphs):
        for i, paragraph in enumerate(paragraphs):
            for j, word in enumerate(paragraph):
                paragraphs[i][j] = self.stemmer.stem(word)
        return paragraphs

	# This function is used for converting into bag-of-words
    def bag_of_words(self, words, dic):
        bagW = []
        for wrd in words:
            bagW.append(dic.doc2bow(wrd))
        return bagW

	# This function is used for tokenization of stopwords from file
    def stopwords(self):
        f = open("stopWords.txt")
        stopwords = f.read()
        stopwords = stopwords.split(",")
        return stopwords

	# Thhis function is used to search stopwords in dictionary
    def stopword_locations(self, dic):
        stopwords = self.stopwords()
        stopword_indx = []
        for i in stopwords:
            try:
                stopword_indx.append(dic.token2id[i])
            except:
                pass
        return stopword_indx



