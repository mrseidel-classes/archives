#Functions

#1. Explain the purpose of functions

#2. What is a parameter?

#3. What is the purpose of the return statement?

#4. Explain what this function does

def randomFunction(firstNumber, secondNumber):
    if (firstNumber > secondNumber):
        return firstNumber - secondNumber
    elif (secondNumber > firstNumber):
        return firstNumber + secondNumber
    else:
        return firstNumber ** 2