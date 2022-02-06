# A night at museum
import string

#Getting String From User
#list of alphabets
lowercase_alphabet = list(string.ascii_lowercase)
InputString = input()
InputString = 'a' + InputString

summation = 0



for i in range(1,len(InputString)):
    diff = abs(ord(InputString[i]) - ord(InputString[i-1]))
    summation += min(abs(diff) , 26-diff)

print(summation)














