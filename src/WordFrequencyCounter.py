'''
Created on Apr 7, 2015

@author: Sulekha
'''
import requests
from bs4 import BeautifulSoup

def wordCounter(url):
    word_list = []
    source_code = requests.get(url)
    text = source_code.text
    soup = BeautifulSoup(text)
    for post_text in soup.findAll('a' ,{'class':'post-title'}):
        content = post_text.string
        words = content.split()
        for word in words:
            print(word)
            word_list.append(word)
    
wordCounter('https://www.thenewboston.com/forum/')
        