# from nltk import download
# download("stopwords")
# download("punkt")
import string
from collections import defaultdict
import pickle
import time
from turtle import st
from nltk.corpus import stopwords
from nltk.tokenize import word_tokenize


def tokenize(text):
    return word_tokenize(text)


def filter_stop_words(words):
    stop_words = set(stopwords.words("english"))
    filtered_list = []
    for word in words:
        if word.casefold() not in stop_words and word.casefold() not in string.punctuation:
            filtered_list.append(word)
    return set(filtered_list)


def index_base_documents():
    start = time.time()
    word_dict = defaultdict(list)

    for i in range(1, 7):
        with open(f"elastic-space/documents/Text{i}.txt", "r") as text:
            text = text.read()
            words = tokenize(text)
            words = filter_stop_words(words)
            for word in words:
                word_dict[word].append(i)


    with open("elastic-space/documents/index.plk", "wb") as index:
        pickle.dump(word_dict, index)
    end = time.time()
    print(f"Document indexing time: {end-start} sec")


def run_search_base_documents():
    with open("elastic-space/documents/index.plk", "rb") as index:
        word_dict = pickle.load(index)
    
    for q in ["claim", "claim*", "claims of duty"]:
        start = time.time()
        match = word_dict[q]
        end = time.time()
        print(f"Query: '{q}'  Matches: {match}  Time: {end-start} sec")
        

index_base_documents()
run_search_base_documents()

