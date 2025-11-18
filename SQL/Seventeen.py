# getter and setter for a property in a class python
class Student:
    def __init__(self, name, age):
        self._name = name  
        self._age = age    

    @property  # getter
    def name(self):
        return self._name

    @name.setter # setter
    def name(self, new_name):
        self._name = new_name

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, new_age):
        if new_age > 0:
            self._age = new_age
        else:
            print("Please enter a valid age.")

student = Student("John", 21)
print(student.name)
print(student.age)  
student.name = "Doe"
student.age = 22
print(student.name)
print(student.age)
