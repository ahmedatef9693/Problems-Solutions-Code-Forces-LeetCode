# Given an Integer n return a string with n charcters such that each charcter in such string occurs an odd number of times
# returned String must contain only lowercase english letters if there is multiple valid Strings return any of them
import string

#Entering String number of chars
InputChars = int(input())
lowercase_alphabet = list(string.ascii_lowercase)
returnedString = ""


mylist = []
def getMeNumbertoString(res):

    print('res = '+str(res))
    for i in range(res):
        mylist.append(lowercase_alphabet[0])
    lowercase_alphabet.pop(0)
    return mylist


res = 0

if InputChars == 1:
    returnedString = lowercase_alphabet[0]
else:
    savedNumberofchars = InputChars
    #odd
    if InputChars %2 !=0:
        mylist = getMeNumbertoString(InputChars)
    else:
        while InputChars >= 1:
            InputChars = int(InputChars / 2)
            print('savedNumberofchars = ' + str(savedNumberofchars))
            if InputChars % 2 != 0:
                mylist = getMeNumbertoString(InputChars)
                res = savedNumberofchars - len(mylist)
                print('res = ' + str(res))
                if res % 2 != 0:
                    mylist = getMeNumbertoString(res)
                    restTocomplete = savedNumberofchars - len(mylist)
                    print('rest to complete : ' + str(restTocomplete))
                    InputChars = restTocomplete




    print('input chars = ' + str(InputChars))

print(mylist)

    # even
    #























