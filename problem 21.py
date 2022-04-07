# Moore's Voting Algorithm


inputArray = [2,2,2,1,1]
votes = 0
candidate = -1
savedIndex = -1
count = 0
for i in range(len(inputArray)):
    if votes == 0:
        savedIndex = i
        candidate = inputArray[i]
        votes = 1
    else:
        if candidate == inputArray[i]:
            votes += 1
        else:
            votes -= 1
for i in range(len(inputArray)):
    if inputArray[i] == inputArray[savedIndex]:
        count += 1
if count > len(inputArray)/2:
    print('Majority Element = '+str(inputArray[savedIndex]))








