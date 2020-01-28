import random
import time
a=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
b=random.choice(a)
print("Welcome to letter guessing game|")
time.sleep(1)
print("you have 15 chances to guess the letter.\ntype'quit' to quit the game.lets get started...")
for i in range(1,15):
    l=input("enter a letter:")
    if(b==l):
        print("you guessed correct!")        
    elif(l=="quit"):
        print("Thankyou!")
        break

    else:
        print("wrong!")
        print("you have ",15-i," chances left!")
        
            

