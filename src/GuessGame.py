'''
Created on Apr 20, 2015

'''
import random
def user_input():
    print("Time to guess game")
    user_num = int(input("Enter the number between 1 and 100: "))
    guess_num = random.randrange(1,100)
    guess = 0
    while(1):
        if user_num == guess_num:
            print("Congratulations! you got in "+str(guess)+" guesses")
            break
        elif user_num > guess_num:
            guess = guess+1
            user_num=int(input("Too high.Try again: "))
        else:
            guess = guess+1
            user_num=int(input("Too Low.Try again: "))
            
user_input() 