''' Modules used :---

Random module
If-elif
Lists Description :--- In this project a simple rock, paper , scissor game is created using if-elif , lists ,random module and print functions using python grogram .
In this program , 2 players can play at once in which one player is the computer and the 2nd player is anyone who wants to play.

First the program asks for the name of the player who wants to play and the player have to choose among rock, paper and scissor . the computer’s choice is choosed using the random.choice(seq) module.

And the winner is selected as per the traditional rock, paper , scissor game rule.'''

import random

player=input("Enter your name\t")

print("\n")

game=['rock','paper','scissor']    

c1= random.choice(game)    # for storing the computer's choice

c2=input("Choose anyone :- rock, paper ,scissor\t")   # for storing the player's choice

print("Computer"," = ",c1)
print(player," = ",c2)

if((c1=='rock')&(c2=='paper')):
  print("\n","Computer"," is the Winner")
elif((c1=='rock')&(c2=='scissor')) :
  print("\n","Computer"," is the Winner")  
elif((c1=='rock')&(c2=='rock')):
  print("\n It's a Tie ")
elif((c1=='paper')&(c2=='rock')):
  print("\n",player," is the Winner")
elif((c1=='paper')&(c2=='paper')):
  print("\n It's a Tie ") 
elif((c1=='paper')&(c2=='scissor')):
  print("\n",player," is the Winner")
elif((c1=='scissor')&(c2=='rock')):
  print("\n",player," is the Winner")
elif((c1=='scissor')&(c2=='paper')):
  print("\n","Computer"," is the Winner")
elif((c1=='scissor')&(c2=='scissor')):
  print("\nThis is a Tie")