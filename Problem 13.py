#George and Accomomdation
#print('Enter Number Of Rooms ')
n = int(input())
p = 0
q = 0
AvailableRooms = 0
count = 0
for i in range(n):
    #print('Enter People Who Live in The Room ')
    #p = int(input())
    #print('Enter The Room Capacity')
    #q = int(input())
    p, q = list(map(int, input().split()))
    AvailableRooms = q - p
    if AvailableRooms >= 2:
        count +=1


#print('Available Rooms is')
print(count)


