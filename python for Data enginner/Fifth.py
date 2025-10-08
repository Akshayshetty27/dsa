# loops in python

# 1) for loop 
my_list = [10, 25, 30, 40, 50]

for i in  my_list:
    print(i)    
    if i % 10 == 0 & i% 20 == 0 :
        print(i , "is multiple of 10 and 20")
    elif i % 10 == 0:
        print(i , "is multiple of 10")  
    elif i % 20 == 0:
        print(i , "is multiple of 20")
    else:
        print(i , "is not multiple of 10 or 20")
print ("loop ended")


for i in range(0 , len(my_list), 2):
    print((i+1) ,"element is ", my_list[i])
    
    
str_list = ["hello" , "world" , "Python" , "java" , "c++"]

for j in range(0 , len(str_list)):
    if str_list[j].lower() == "python":
        print(str_list[j] , "found at index ", j+ 1);break;
    else:
        print(str_list[j] ,"at index ", j);
        
        
        
        
# 2) while loop
print ("while loop")
count = 0   
while count < 5:
    print( count + 1);
    count += 1

print("while loop ended")

# break and continue statements
print("break and continue statements")
num = 0
while num < 10:
    num += 1
    if num == 5:
        print("breaking the loop at num =", num)
        break
    if num % 2 == 0:
        print("skipping even number", num)
        continue
    print("current number is", num)
    
print("loop ended")
# nested loops
# do while loop
print("do while loop")
count = 0
while True:
    print("count is", count)
    count += 1
    if count >= 5:
        break
print("do while loop ended")

