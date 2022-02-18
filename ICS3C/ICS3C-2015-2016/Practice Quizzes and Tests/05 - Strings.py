#Strings

#1. How can we use a for loop and indexing to go through and count vowels?

#2. What is slicing?

#3. Given the following program, what would be the output if the input
#   was 'Mr. Seidel'

origSentence = raw_input("Enter a sentence: ")

sentence = origSentence.lower()

value = 0
for i in range(0, len(sentence), 1):
    if (sentence[i] == ' ' or sentence[i] == '.'
                           or sentence[i] == ','
                           or sentence[i] == "'"):
        value = value + 0
    elif (sentence[i] < 'b'):
        value = value + 1
    elif(sentence[i] < 'd'):
        value = value + 2
    elif(sentence[i] < 'f'):
        value = value + 3
    else:
        value = value - 1

print 'The value of the sentence: ' + origSentence +  ' is: ' + str(value)
