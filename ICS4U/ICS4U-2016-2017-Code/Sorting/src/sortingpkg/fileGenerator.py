#-------------------------------------------------------------------------------
# Name:        Circle and Sphere Generator
# Purpose:     Generates a file with circles and spheres for an assignment
#
# Author:      Mr. Seidel
#
# Created:     08/10/2015
# Updated:     18/04/2016 - added progress bar and uses GUI
# Copyright:   (c) Mr. Andrew Seidel 2015
# Licence:     The MIT License (MIT)
#-------------------------------------------------------------------------------

import random
import tkinter as tk
from tkinter import ttk
from tkinter import Label
from tkinter import StringVar
from math import trunc
random.seed()

numberOfObjects = int((random.random() + 50) * 10000) + 100000

def MAIN():
    global outputString
    global textValue
    try:
        file = open("G:\\SortingAssignment.txt", "w")
        file.write(str(numberOfObjects) + "\n")
        for i in range(numberOfObjects):
            if (i % 10 == 0):
                progress.step(10)
                progress.update()
        
            x = int(random.random() * 1000) - 500
            y = int(random.random() * 500) - 250
            z = int(random.random() * 250) - 125
            radius = int(random.random() * 50) + 25
        
            if (int(random.random() * 100) % 2 == 0):
                file.write("Sphere:" + str(radius) + ":" + str(x) + "," + str(y) + "," + str(z) + "\n")
            else:
                file.write("Circle:" + str(radius) + ":" + str(x) + "," + str(y) + ",0" + "\n")
        file.write("*")
        file.close()
    except:
        file.write("*")
        file.close()
    textValue.set("Done! G:\SortingAssignment.txt file created!")

root = tk.Tk()
root.wm_title("Generator for Sorting Assignment")

textValue = StringVar()
label = Label(root, textvariable=textValue)
textValue.set("Generating file...")
label.pack()

progress = ttk.Progressbar(root, length=1000, maximum=numberOfObjects)
progress.pack()

progress.after(1, MAIN)
root.mainloop()
