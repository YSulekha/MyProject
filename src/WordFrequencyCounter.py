'''
Created on Apr 7, 2015

Practice program
'''
import requests
from bs4 import BeautifulSoup
from test.test_iterlen import len
from lib2to3.pgen2.tokenize import Operator
import operator

def wordCounter(url):
    word_list = []
    source_code = requests.get(url)
    text = source_code.text
    soup = BeautifulSoup(text)
    for post_text in soup.findAll('a' ,{'class':'post-title'}):
        content = post_text.string
        words = content.lower().split()
        for word in words:
            word_list.append(word)
    list_clean(word_list)
        
def list_clean(word_list):
    clean_List = []
    symbols = "!@#$%^&*()_+{}:\"?><|';/.,1234567890"
    for word in word_list:
        for i in range(0,len(symbols)):
            word = word.replace(symbols[i] , "")
        if len(word) > 0:
            clean_List.append(word)
    create_dic(clean_List)
           
def create_dic(clean_List):
    wordCount = {}
    for word in clean_List:
        if word in wordCount:
            wordCount[word]+=1
        else:
            wordCount[word] = 1
    for key,value in sorted(wordCount.items(),key=operator.itemgetter(1)):
        print(key,value)
        
wordCounter('https://www.thenewboston.com/forum/')
        