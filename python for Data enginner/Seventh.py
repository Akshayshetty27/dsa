# dictionary in  python 

my_dict = {1: 'apple', 2: 'banana', 3: 'cherry', 4: 'date'}
print(my_dict)


for key in my_dict:
    if key % 2 == 0:
        print(key, "is even key with value", my_dict[key])  
    else:
        print(key, "is odd key with value", my_dict[key])   


my_dict[5] = 'elderberry'
print("dictionary after adding an item:", my_dict)


