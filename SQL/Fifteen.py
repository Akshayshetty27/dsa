# class and object continue
class Student:
    # constructor method
    def __init__(self, name, age, roll_no):
        self.name = name
        self.age = age
        self.roll_no = roll_no

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}, Roll No: {self.roll_no}")
        
#    instance method to change name
    def change_name(self, new_name):
        self.name = new_name
    
    @staticmethod
    def school_info():
        print("This is a static method. School Name: ABC High School")
       
student1 = Student("Alice", 20, 101)
student2 = Student("Bob", 22, 102)
student1.display()
student2.display()

student1.change_name("Charlie")
student1.display()  

student1.school_info()