'''
Created on Apr 15, 2015

'''
def celsius_to_fahr(tc):
    tf = (9/5)*tc+32
    print("Fahr temp "+str(tf))
def fahr_to_celsius(tf):
    tc = (5/9)(tf-32)
    print("Celsius temp "+str(tc))

t = input("Enter the temperature")
c = input("Convert to (F)aherenheit or (C)elsius")
if c is 'F':
    fahr_to_celsius(t)
else:
    celsius_to_fahr(t)