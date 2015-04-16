'''
Created on Apr 15, 2015

'''
def celsius_to_fahr(tc):
    tf = (9/5)*tc+32
    print("Fahr temp "+str(tf))
def fahr_to_celsius(tf):
    tc = (5/9)(tf-32)
celsius_to_fahr(5)