'''
Created on Apr 2, 2015

@author: Sulekha
'''
import requests
from bs4 import BeautifulSoup


def web_crawler(max_pages):
    pages=1
    while pages <= max_pages:
        from locale import str
        url = 'https://www.thenewboston.com/forum/recent_activity.php?page='+ str(pages)
        source_code = requests.get(url)
        text = source_code.text
        soup = BeautifulSoup(text)
        for link in soup.findAll('a' , {'class':'post-title'}):
            href = "https://www.thenewboston.com"+link.get('href')
            print(href)
        pages+=1
        print(url)
        
web_crawler(1)