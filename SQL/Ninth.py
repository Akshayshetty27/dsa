# tuple in python 
my_tuple = (1, 2, 3, 4, 5)
print(my_tuple)
print(type(my_tuple))
print("tuple is immutable")
for i in range(0, len(my_tuple)):
    if my_tuple[i] % 2 == 0:
        print(my_tuple[i], "is even")
    else:
        print(my_tuple[i], "is odd")
    

list = list(my_tuple)
list.append(6)
my_tuple = tuple(list)
print("tuple after adding an item:", my_tuple)