'''
Created on Apr 1, 2015

@author: sulekha
'''
import urllib.request
import random

web_url = ' '

def download_web(url):
    response = urllib.request.urlopen(url)
    text = str(response.read())
    new_text = text.split('\\n')
    fw = open(r'/Users/aharyadi/Downloads/heapsort.txt','w')
    for line in new_text:
        fw.write(line)
        fw.write('\n')
    fw.close()
def download(url):
    name = random.randrange(1,1000)
    full_name = str(name)+".txt"
    urllib.request.urlretrieve(url, full_name)
    
download(web_url)