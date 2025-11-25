# list methods in Python
my_list = [10, 20, 30, 40, 50]
print("Original List:", my_list)
# list.append(60)
# print("After Append:", my_list)
my_list.remove(30)
print("After Remove:", my_list)
print("Length of List:", len(my_list))
print("Index of 40:", my_list.index(40))
my_list.sort(reverse=True)
print("Sorted List (Descending):", my_list)

# string methods in Python
my_string = "  Hello, World! Welcome to Python programming.  "
print("Original String:", my_string)
print("Uppercase:", my_string.upper())
print("Lowercase:", my_string.lower())
print("Stripped String:", my_string.strip())


print( max(my_list));
print( min(my_list));
print( sum(my_list));