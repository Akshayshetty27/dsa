# conditional statements in python
a = 10
b = 20
if a < b:
    print("a is less than b")
elif a == b:
    print("a is equal to b")
else:
    print("a is greater than b")
    
# loops in python
for i in range(5):
    print("Iteration:", i)
count = 0
while count < 5:
    print("Count:", count)
    count += 1



# functions in python
def greet(name):
    return "Hello, " + name + "!"

print(greet("Akshay"))

# simple add function
def add(x, y):
    return x + y
print("Sum:", add(5, 10))

# file reading and writing
# Writing to a file
file = open("One.py", "r") 
content = file.read()
print(content)
file.close()


# classes and objects in python
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        return f"Hi, I'm {self.name} and I'm {self.age} years old."

person1 = Person("Akshay", 24)
print(person1.introduce())

