#  conditional statements in python

x= 10;

if x> 10:
    print("x is greater than 10")

for i in range(0 , x):
    if i%2 == 0:
        print(i , "is even")
    else:
        print(i , "is odd")
        
        
x= 159

if x> 100:
    print("x is greater than 100")
    if ((x> 150) & (x < 200)):
        print("x is greater than 150 and less than 200")
    else:
        print("x is not greater than 150")  
else:
    print("x is not greater than 100")