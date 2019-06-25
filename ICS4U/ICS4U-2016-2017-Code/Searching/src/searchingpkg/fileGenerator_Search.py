#-------------------------------------------------------------------------------
# Name:        Circle and Sphere Generator
# Purpose:     Generates a file with circles and spheres for an assignment (Searching)
#
# Author:      Mr. Seidel
#
# Created:     08/10/2015
# Updated:     18/04/2016 - added progress bar and uses GUI
# Copyright:   (c) Mr. Andrew Seidel 2015
# Licence:     The MIT License (MIT)
#-------------------------------------------------------------------------------

import random
import gzip
import tkinter as tk
from tkinter import ttk
from tkinter import Label
from tkinter import StringVar
from math import trunc
random.seed()

numberOfObjects = int((random.random() + 50) * 10000) + 1500000

def MAIN():
    global outputString
    global textValue
    try:
        file = gzip.open("G:\\SearchingAssignment.txt.gz", "wb", compresslevel=9)
        string = str(numberOfObjects) + "\n"
        file.write(bytes(string, 'UTF-8'))
        for i in range(numberOfObjects):
            if (i % 10 == 0):
                progress.step(10)
                progress.update()
        
            x = int(random.random() * 1000) - 500
            y = int(random.random() * 500) - 250
            z = int(random.random() * 250) - 125
            radius = int(random.random() * 50) + 25
        
            if (int(random.random() * 100) % 2 == 0):
                string = "Sphere:" + str(radius) + ":" + str(x) + "," + str(y) + "," + str(z) + "\n"
                file.write(bytes(string, 'UTF-8'))
            else:
                string = "Circle:" + str(radius) + ":" + str(x) + "," + str(y) + ",0" + "\n"
                file.write(bytes(string, 'UTF-8'))
        string = "*"
        file.write(bytes(string, 'UTF-8'))
        file.close()
    except:
        string = "*"
        file.write(bytes(string, 'UTF-8'))
        file.close()
    textValue.set("Done! G:\SearchingAssignment.txt.gz file created!")

root = tk.Tk()
root.wm_title("Generator for Searching Assignment")

textValue = StringVar()
label = Label(root, textvariable=textValue)
textValue.set("Generating file...")
label.pack()

progress = ttk.Progressbar(root, length=1000, maximum=numberOfObjects)
progress.pack()

progress.after(1, MAIN)
root.mainloop()
