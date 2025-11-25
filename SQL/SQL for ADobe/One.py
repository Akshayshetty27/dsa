# Python basic 

name ="Akshay"
age = 24
price = 2500.50
is_student = True

# basic int , str , float , bool

print("Name:", name)
print("Age:", age)
print("Price:", price)
print("Is Student:", is_student)

#  List 
# mutable , ordered , allows duplicates
fruits = ["apple", "banana", "cherry"]
print("Fruits:", fruits)
print( "First :", fruits[0]);
print( "Last :", fruits[-1]);

#  Tuple  
#  immutable , ordered , allows duplicates
# best for defining constant values
tuple1 = (1, 2, 3, 4, 5)
print("Tuple:", tuple1)
print( "Second :", tuple1[1]);


# Dectionary
# mutable , unordered , key-value pairs
student = {
    "name": "Alice",
    "age": 22,
    "is_enrolled": True
}
print("Student:", student)
print("Student Name:", student["name"])
print("Student Age:", student["age"])

# Set
# mutable , unordered , no duplicates]
colors = {"red", "green", "blue"}
print("Colors:", colors)
colors.add("yellow")
print("Updated Colors:", colors)
colors.remove("green")
print("After Removal:", colors)
print("Is 'blue' in colors?", "blue" in colors)

