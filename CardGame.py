''' 
    Modules Used :-

    Random module
    If-elif
    Lists
    for loop Description :-- Computer chouses some random cards of some random type and the user makes the 
        guessing of the cards choosen. If the user's guessing are correct then the user wins else the computer wins.
        
'''
import random

name=input("Enter you name\t")
ctype=['spade','heart','club','diamond']
element=['king','queen','knight','ace',1,2,3,4,5,6,7,8,9,10]

c = random.choice(ctype)                    # type of card choosen by computer
e = random.choice(element)                  # element of card choosen by computer

#type of card  choosen by user

utype=input("\nEnter the type of card -> spade,heart,club or diamond\t")

#element of card choosen by the user

uelement=input("\nEnter the element of the card -> 'king','queen','knight','ace',1,2,3,4,5,6,7,8,9,10\t")

# printing cards choosen by computer and user

print(" \n  Cards choosen by Computer -> ",c,"\t",e)
print(" \n  Cards choosen by ",name,"->\t",utype,"\t",uelement)

# comparing the card type and element choosen by user and   computer

if(c==utype)&(e==uelement):
  print("\n        **********  ",name, " is the WINNER **********")
else:
  print("\n        **********  Computer is the WINNER  ***********") 