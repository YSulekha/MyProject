'''
Created on Apr 7, 2015

@author: Sulekha
'''
import requests
from bs4 import BeautifulSoup

def wordCounter(url):
    source_code = requests.get(url)
    text = source_code.text
    soup = BeautifulSoup(text)