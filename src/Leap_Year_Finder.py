'''
Created on Apr 16, 2015

@author: aharyadi
'''
def Leapyear_finder(year):
    if year%4 == 0 and year%100 != 0:
        print(str(year)+" is a Leap year")
    elif year%400 == 0:
        print(str(year)+" is a Leap year")
    else:
        print(str(year)+" is not a Leap year")
        
Leapyear_finder(2000)