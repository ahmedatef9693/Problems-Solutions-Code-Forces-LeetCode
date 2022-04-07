#Bit Manipulation Problem
arr = [12,1,12,3,12,1,1,2,3,3]
hashMap = {}

#initializing each key with count (value)
for num in range(len(arr)):
    hashMap[arr[num]] = 0;

for i in range(len(arr)):
    hashMap[arr[i]] +=1;

for key , value in hashMap.items():
    if value == 1:
        print('Number which occurs once = '+str(key))
        break



