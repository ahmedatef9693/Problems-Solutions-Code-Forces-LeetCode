
#Given input String Find the minimum distance between w1 and w2
#the distance is the number of steps or words between the first and the second word
inputString = 'the quick the brown quick brown the frog'
inputString = inputString.split(sep=' ')
w1 = 'quick'
w2 = 'frog'
mydictionary = {}
for i in range(len(inputString)):
    if inputString[i] == w1:
        mydictionary[i] = w1
    elif inputString[i] == w2:
        mydictionary[i] = w2


res = 0
mylist = []
for key,value in mydictionary.items():

    if value == w2:
        res = key
    else:
        mylist.append(key)

for k in range(len(mylist)):
    temp = res - mylist[k]
    mylist[k] = temp - 1

minimumRoute = min(mylist)
print(minimumRoute)




