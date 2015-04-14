'''
Created on Apr 7, 2015

@author: Sulekha
'''
import requests
from bs4 import BeautifulSoup
from test.test_iterlen import len

def wordCounter(url):
    word_list = []
    source_code = requests.get(url)
    text = source_code.text
    soup = BeautifulSoup(text)
    for post_text in soup.findAll('a' ,{'class':'post-title'}):
        content = post_text.string
        words = content.lower().split()
        for word in words:
           # print(word)
            word_list.append(word)
    list_clean(word_list)
        
def list_clean(word_list):
    clean_List = []
    symbols = "!@#$%^&*()_+{}:\"?><|';/.,"
    for word in word_list:
        for i in range(0,len(symbols)):
            word = word.replace(symbols[i] , "")
        if len(word) > 0:
            clean_List.append(word)
            print(word)
wordCounter('https://www.thenewboston.com/forum/')
        