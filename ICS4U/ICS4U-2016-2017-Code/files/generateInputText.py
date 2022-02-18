#-------------------------------------------------------------------------------
# Name:        Circle and Sphere Generator
# Purpose:     Generates a file with circles and spheres for an assignment
#
# Author:      Mr. Seidel
#
# Created:     08/10/2015
# Copyright:   (c) Mr. Andrew Seidel 2015
# Licence:     GPL 3.0
#-------------------------------------------------------------------------------

import random
random.seed()

numberOfObjects = int(random.random() * 1000) + 1000
outputString = str(numberOfObjects) + "\n"

for i in range(numberOfObjects):
    x = int(random.random() * 1000) - 500
    y = int(random.random() * 500) - 250
    z = int(random.random() * 250) - 125
    radius = int(random.random() * 50) + 25

    if (int(random.random() * 100) % 2 == 0):
        outputString += "Sphere:" + str(radius) + ":" + str(x) + "," + str(y) + "," + str(z) + "\n"
    else:
        outputString += "Circle:" + str(radius) + ":" + str(x) + "," + str(y) + ",0" + "\n"

outputString += "*"

file = open("input.txt", "w")
file.writelines(outputString)
file.close()