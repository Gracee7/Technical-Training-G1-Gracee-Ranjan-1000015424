'''
    Modules used :-- 1.User defined functions ( def():)

2.Lists

3.if-elif

4.while loop

Discription :-- In this code a list board is defined which will store the X or O at different positions .

Initially player is set to 1 , so automatically the player 1 will get first chance to move .

The UDF drawboard() , will help to draw the bord .

The UDF CheckPosition will help to know if any place in the bord is free or not.

The UDF CheckWin will help to know if the player is won after each move.

In this first we have loop , which will run till game == running , or till game == 0

than we will call function DrawBoard , which will print our array

now we will check that ,which player turn it is , i.e, if player = 1,3,5,... than it is player 1 turn (X) , otherwise player 2 turn(O)

Now we will take input of the position where the player wants to mark O or X,

and we will use CheckPosition function to see if the that position is occupied or not ,

if it is not occupied than we will place that players mark O or X at that position,

and now we will use CheckWin function to see if that player win or not , or the game will still continue.

We will use Game variable , which is our loop control variable ,

Our loop will run till game == running i.e, game == 0 bcz running = 0, in checkwin function , 
we will update game variable , if any player won , than game = win i.e, game = 1, 
so the loop will break or if the game was draw in checkwin function , than game = draw or game = -1 and loop will break

'''

board = [' ',' ',' ',' ',' ',' ',' ',' ',' ',' ']    
player = 1    
   
########win Flags##########    
Win = 1    
Draw = -1    
Running = 0    
Stop = 1    
  
Game = Running    
Mark = 'X'    
   
#This Function Draws Game Board    
def DrawBoard():    
    print(" %c | %c | %c " % (board[1],board[2],board[3]))    
    print("___|___|___")    
    print(" %c | %c | %c " % (board[4],board[5],board[6]))    
    print("___|___|___")    
    print(" %c | %c | %c " % (board[7],board[8],board[9]))    
    print("   |   |   ")    
   
#This Function Checks position is empty or not    
def CheckPosition(x):    
    if(board[x] == ' '):    
        return True    
    else:    
        return False    
   
#This Function Checks player has won or not    
def CheckWin():    
    global Game    
    #Horizontal winning condition    
    if(board[1] == board[2] and board[2] == board[3] and board[1] != ' '):    
        Game = Win    
    elif(board[4] == board[5] and board[5] == board[6] and board[4] != ' '):    
        Game = Win    
    elif(board[7] == board[8] and board[8] == board[9] and board[7] != ' '):    
        Game = Win    
    #Vertical Winning Condition    
    elif(board[1] == board[4] and board[4] == board[7] and board[1] != ' '):    
        Game = Win    
    elif(board[2] == board[5] and board[5] == board[8] and board[2] != ' '):    
        Game = Win    
    elif(board[3] == board[6] and board[6] == board[9] and board[3] != ' '):    
        Game=Win    
    #Diagonal Winning Condition    
    elif(board[1] == board[5] and board[5] == board[9] and board[5] != ' '):    
        Game = Win    
    elif(board[3] == board[5] and board[5] == board[7] and board[5] != ' '):    
        Game=Win    
    #Match Tie or Draw Condition    
    elif(board[1]!=' ' and board[2]!=' ' and board[3]!=' ' and board[4]!=' ' and board[5]!=' ' and board[6]!=' ' and board[7]!=' ' and board[8]!=' ' and board[9]!=' '):    
        Game=Draw    
    else:            
        Game=Running    
    
   
print("Player 1 [X] --- Player 2 [O]\n")    
print()    # just giving some space 
print()    
   
  
while(Game == Running):    
      
    DrawBoard()    
    if(player % 2 != 0):    
        print("Player 1's chance")    
        Mark = 'X'    
    else:    
        print("Player 2's chance")    
        Mark = 'O'    
    choice = int(input("Enter the position between [1-9] where you want to mark : "))    
    if(CheckPosition(choice)):    
        board[choice] = Mark    
        player+=1    
        CheckWin()    
    
    
DrawBoard()    
if(Game==Draw):    
    print("Game Draw")    
elif(Game==Win):    
    player-=1    
    if(player%2!=0):    
        print("Player 1 Won")    
    else:    
        print("Player 2 Won")
