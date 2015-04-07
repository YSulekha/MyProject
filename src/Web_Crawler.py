'''
Created on Apr 2, 2015

@author: Sulekha
'''
import requests
from bs4 import BeautifulSoup
import code
#https://www.thenewboston.com/forum/topic.php?id=1610

def web_crawler(max_pages):
    pages=100
    while pages <= max_pages:
      #  from locale import str
        url = 'https://www.thenewboston.com/forum/recent_activity.php?page='+ str(pages)
        source_code = requests.get(url)
        text = source_code.text
        soup = BeautifulSoup(text)
       # print(soup.text())
       # print(soup.prettify())
        for link in soup.findAll('a' , {'class':'post-title'}):
            href = "https://www.thenewboston.com"+link.get('href')
            title = link.string
            if "[source code] Python Programming Tutorial - 44" in link.string:
                get_source_code(href)
                print(title)
                print(href)
        pages+=1
      #  print(url)

def get_source_code(href):
    source_code = requests.get(href)
    text = source_code.text
    soup = BeautifulSoup(text)
  #  print(soup.get_text())
    for header in soup.findAll('div' , {'class':'buckys-bbcode-content'}):
       for pre in soup.findAll('pre'):
           print('instring')
           print(pre)
          # print(BeautifulSoup(pre).get_text())
         #  for codess in soup.findAll('code'):
          #     print(codess.string)
          #     for line in soup.findAll('br'):
           #        print(line.string)      
web_crawler(100)