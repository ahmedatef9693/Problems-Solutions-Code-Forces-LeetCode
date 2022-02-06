#A. Shaass and Oskols

#initializations
NumberOfBoxes = 0
NumberOfBirdsPerBox = 0
BirdPerBoxes = []
NumberOfBirdsToBeKilled = 0
BoxAndBirdNumber = []
BoxesOfBirdsWithNumbers = []
#Getting number of boxes
print('Enter Number Of Boxes')
NumberOfBoxes = int(input())

#Number of birds in each box
print('Enter Number of birds per a box')
for i in range(1):
    BirdPerBoxes = list(map(int,(input().split())))

#NumberOfBirdsToBeKilled
print('Enter Number Of Birds To Be Killed')
NumberOfBirdsToBeKilled = int(input())

#Box Position then bird number to be killed
print('Enter Position Then BirdNumber')
for i in range(NumberOfBirdsToBeKilled):
    BoxAndBirdNumber.append(list(map(int,(input().split()))))

#Algorithm Of Killing

#Generating numbers for each box
for b in range(len(BirdPerBoxes)):
    birdsInCurrentBox = BirdPerBoxes[b]
    BoxesOfBirdsWithNumbers.append([element+1 for element in range(birdsInCurrentBox)])



beforelist = []
afterlist = []
middlelist = []
for query in range(len(BoxAndBirdNumber)):
    BoxPos = BoxAndBirdNumber[query][0]
    BirdNum = BoxAndBirdNumber[query][1]
    BoxPos -= 1
    BirdNum -= 1
    if BoxPos == 0 :
        BoxesOfBirdsWithNumbers[BoxPos + 1] .extend(BoxesOfBirdsWithNumbers[BoxPos][BirdNum+1:len(BoxesOfBirdsWithNumbers[BoxPos])])
        BoxesOfBirdsWithNumbers[BoxPos] = []
    elif BoxPos == NumberOfBoxes - 1 :
        BoxesOfBirdsWithNumbers[BoxPos - 1].extend(BoxesOfBirdsWithNumbers[BoxPos][0:BirdNum])
        BoxesOfBirdsWithNumbers[BoxPos] = []
    else:
        BoxesOfBirdsWithNumbers[BoxPos-1].extend(BoxesOfBirdsWithNumbers[BoxPos][0:BirdNum])
        BoxesOfBirdsWithNumbers[BoxPos + 1].extend(BoxesOfBirdsWithNumbers[BoxPos][BirdNum + 1:])
        BoxesOfBirdsWithNumbers[BoxPos] = []




print('--------------------------------Answers-----------------------------------------------')
for i in range(len(BoxesOfBirdsWithNumbers)):
    print(len(BoxesOfBirdsWithNumbers[i]))

















# beforelist = 0
# afterlist = 0
# middlelist = 0
#
# for query in range(len(BoxAndBirdNumber)):
#     BoxPos = BoxAndBirdNumber[query][0]
#     BirdNum = BoxAndBirdNumber[query][1]
#     for birdlist in range(len(BoxesOfBirdsWithNumbers)):
#         if BoxPos == 1:
#             afterlist = BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum:len(BoxesOfBirdsWithNumbers[BoxPos - 1])]
#             afterlist.extend(BoxesOfBirdsWithNumbers[BoxPos])
#             del BoxesOfBirdsWithNumbers[BoxPos - 1][0:BirdNum]
#         elif BoxPos == NumberOfBoxes - 1:
#             beforelist = BoxesOfBirdsWithNumbers[BoxPos - 1][0:BirdNum - 1]
#             beforelist.extend(BoxesOfBirdsWithNumbers[BoxPos - 2])
#             del BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum:len(BoxesOfBirdsWithNumbers[BoxPos - 1])]
#         else:
#             # elements before number
#             beforelist = BoxesOfBirdsWithNumbers[BoxPos - 1][:BirdNum - 1]
#             afterlist = BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum:len(BoxesOfBirdsWithNumbers[BoxPos - 1])]
#             beforelist.extend(BoxesOfBirdsWithNumbers[BoxPos - 2])
#             middlelist = [BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum - 1]]
#             afterlist.extend(BoxesOfBirdsWithNumbers[BoxPos])
#             print(BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum - 1])
#             del BoxesOfBirdsWithNumbers[BoxPos - 1][BirdNum - 1]
#             print(len(beforelist))
#             print(len(afterlist))
#             del middlelist[0]













# print(len(beforelist))
# # print(len(middlelist))
# print(len(afterlist))





































