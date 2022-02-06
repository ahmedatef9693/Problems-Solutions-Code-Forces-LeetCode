#Polo The Pinguin Segments



Result = 0
print('Please Enter Number Of Segments (n)')
n = int(input())
print('Enter Divisible By Number (k) ')
k = int(input())
start = 0
end = 0
Segments = []
MySet = set()
for i in range(n):
    print('Enter Start Of '+str(i)+' Segment')
    start = int(input())
    print('Enter End Of ' + str(i) + ' Segment')
    end = int(input())
    Segments.append([start,end])
    MySet.add(start)
    MySet.add(end+1)


print(MySet)

mylen = len(MySet)
if (mylen%k) != 0:
    minus = abs(mylen - k)
    print('Minus')
    print(minus)

print(minus)













