# Lucky Matrix Problem

import numpy as np
myMapElements = {}
Elements = set()
myMatrix = np.array([[3,7,1],
                     [9,11,3],
                     [15,16,2]
                     ])
def minElementInRowIndex(myArray):
    min = myArray[0]
    minIndex = 0
    for i in range(len(myArray)):
        k = i + 1
        if k < len(myArray):
            if myArray[k] < min:
                min = myArray[k]
                minIndex = k
    myMapElements[minIndex] = min
    return minIndex
def IsItMaxElementInColumn(minIndexInRow,myMatrix):
    myList = []
    myList = myMatrix[:,minIndexInRow]
    maxIndex = 0
    maxElement = myList[0]
    for i in range(len(myList)):
        k = i+1
        if k<len(myList):
            if myList[k] > maxElement:
                maxElement = myList[k]
                maxIndex = k

    if myMapElements[minIndexInRow] == maxElement:
        Elements.add(maxElement)

for row in range(myMatrix.shape[0]):
    MinIndexInRow = minElementInRowIndex(myMatrix[row])
    maxElement = IsItMaxElementInColumn(MinIndexInRow, myMatrix)

print('Elementssssssssssssss')
print(Elements)





