
#  sets in python

my_list = [1, 2, 2, 3, 4, 4, 5]
my_set = {1, 2, 3, 4, 5}
print(my_set)
my_set.add(6)
print("set after adding an item:", my_set)

print("my list ", my_list)
my_set_from_list = set(my_list)
print("set 2", my_set_from_list)  

a={1, 2, 3, 4}
b={3, 4, 5, 6}
print("union of a and b", a.union(b))
print("intersection of a and b", a.intersection(b)) 