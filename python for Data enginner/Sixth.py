#  Data structures  in python
# 1) list
my_list=[10 , 20.5 , 'hello' ,[1,2,3,4], True , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100]

print(my_list)
print(type(my_list))


for i in range( 0 , len(my_list)):
    print(my_list[i] )
    if type(my_list[i]) == list:
     print("nested list found")
     for j in range(0 , len(my_list[i]) ):
        print(my_list[i][j] )   
        

list2= my_list[3:6]
print("sliced list:", list2)

print(list2 [2::3] )

print(my_list[::2])

list2.append(200)
list2.insert(1 , 15)
print("list after append and insert:", list2)

list2.pop();
print("list after pop:", list2)


mylist2= [ i * i for i in range(1 , 11) if i%2 == 0     ]

print("list using list comprehension:", mylist2)