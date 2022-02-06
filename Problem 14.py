# Raising Bacteria

DesiredNumber = 0
NumberOfBacterias = 0
# Temp = 1
print('Please Enter Desired Number')
DesiredNumber = int(input())

# while( DesiredNumber > Temp):
#     Temp = Temp * 2
#     if Temp * 2 == DesiredNumber:
#         break
#     elif ((Temp + 1) * 2) <= DesiredNumber:
#         Temp+=1
#         NumberOfBacterias+=1
#     elif(Temp + 1) == DesiredNumber:
#         NumberOfBacterias+=1



while(DesiredNumber > 0):
    print(DesiredNumber)
    if DesiredNumber %2 ==1 :
        NumberOfBacterias += 1
    DesiredNumber //= 2







print('Result')
print(NumberOfBacterias)
