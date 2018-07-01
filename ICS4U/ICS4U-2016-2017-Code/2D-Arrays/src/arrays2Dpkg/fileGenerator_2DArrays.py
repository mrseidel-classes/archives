#-------------------------------------------------------------------------------
# Name:        Magic Square Generator
# Purpose:     Generates a file with random sized 2D Arrays
#
# Author:      Miss Strong - Modified by Mr. Seidel
#
# Created:     02/05/2016
# Updated:     03/05/2016 - added progress bar, GUI, and prepped for Python 3
# Copyright:   (c) Miss Sarah Strong 2016
# Licence:     MIT License
#-------------------------------------------------------------------------------

import tkinter as tk
from tkinter import ttk
from tkinter import Label
from tkinter import StringVar

#from random import shuffle
from random import *

#custom shuffle function
def shuffle(listToShuffle):
  ret = []
  while (len(listToShuffle) > 1):
    rand = randint(0, len(listToShuffle) - 1)
    ret.append(listToShuffle.pop(rand))
  ret.append(listToShuffle[0])
  return ret

#converts a list of lists into a string
def prettyPrint(lol): #lol stands for "list of lists"
  s = ""    
  for l in lol:
    s = s + "[" + ",".join([str(x) for x in l]) + "] "
  return s


''' #old version of prettyPrint
def prettyPrint(lol): #lol stands for "list of lists"
  s = "["
  for l in lol:
    s = s + "[" + ", ".join([str(x) for x in l]) + "], "
  s = s[: len(s) - 2] + "]"
  return s
'''

#generates a (likely incorrect) magic square of a desired size >= 1
#the magic square is written (appended) onto a file
def genMagicSquare(size): 
  x = range(1, size ** 2 + 1)
  x = [x for x in x]
  z = shuffle(x)
  x = [i for i in z]
  square = [[] for y in range(size)]
  for i in range(0, size ** 2):
    square[i % size].append(x[i])
  f = open("G:\\magicSquares.txt", "a") 
  f.writelines(prettyPrint(square) + "\n")
  f.close()


numberOfObjects = int((random() + 50) * 10) + 100

def MAIN():
  f = open("G:\\magicSquares.txt", "w")
  f.writelines(str(numberOfObjects) + "\n")
  f.close()
  #geneates 100 3x3, 100 4x4, and 100 5x5 (likely incorrect) magic squares
  for i in range(numberOfObjects):
    progress.step(1)
    progress.update()
    genMagicSquare(randint(3,5))
  f = open("G:\\magicSquares.txt", "a") 
  f.writelines("*")
  f.close()
  textValue.set("Done! G:\magicSquares.txt file created!")

root = tk.Tk()
root.wm_title("Generator for 2D Arrays Assignment")

textValue = StringVar()
label = Label(root, textvariable=textValue)
textValue.set("Generating file...")
label.pack()

progress = ttk.Progressbar(root, length=1000, maximum=numberOfObjects)
progress.pack()

progress.after(1, MAIN)
root.mainloop()



    
