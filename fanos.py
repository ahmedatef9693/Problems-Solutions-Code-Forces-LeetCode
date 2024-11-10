
"""
drawing simple shape
        * 
      * * * 
    * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
"""


k = 1
spaces = 4
for i in range(1,5):
    for s in range(spaces,0,-1):
        print(' ',end=" ")
        
    for j in range(k):
        print('*',end=" ")
    print()
    spaces-=1
    k += 2
spaces = 2
k=5
for i in range(1,4):
    for s in range(spaces):
        print(' ',end=" ")
        
    for j in range(k):
        print('*',end=" ")
    print()
    spaces+=1
    k -= 2

