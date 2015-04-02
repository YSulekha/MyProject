'''
Created on Apr 1, 2015

@author: sulekha
'''
import urllib.request
import random

image_url = 'https://s-media-cache-ak0.pinimg.com/236x/ce/da/e5/cedae5d81c72dd96686c47ab91f7c8ce.jpg'

def image_download(url):
    name = random.randrange(1,1000)
    full_name = str(name)+".jpg"
    urllib.request.urlretrieve(url, full_name)

image_download(image_url)