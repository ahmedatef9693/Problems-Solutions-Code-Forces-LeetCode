# hash map problem
arr = [3,6,7,3]
target = 9
hashMap = {}
for i in range(len(arr)):
    hashMap[arr[i]] = arr[i]
myIndices = []
for key,value in hashMap.items():
    curr = target - value
    print('curr = '+str(curr))
    secondValue = hashMap.get(curr)
    if secondValue is not None:
        print('second value = ' + str(secondValue))
        if value + secondValue == target:
            myIndices.append([value, secondValue])
    else:
        continue




print(myIndices)





