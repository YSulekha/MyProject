'''
Created on Apr 21, 2015

'''
import random

def user_input():
    print("Welcome to Rock, Paper, Scissors!")
    max_points = input("How many points are required for a win?")
    score = 0
    while score >int(max_points):
        user_selection = input("Choose (R)ock, (P)aper, or (S)cissors?")
        score = compute(user_selection)

def compute(user_selection):
    items = ['R','S','P']
    rand_item = random.choice(items)
    print("Human: "+user_selection+"Computer: "+rand_item)
    user_score = 0
    if user_selection == 'R' and rand_item == 'S':
        user_score = user_score+1