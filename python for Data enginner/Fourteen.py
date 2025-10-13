class Employee:
    def __init__(self, emp_name, emp_dept):
        self.emp_name = emp_name
        self.emp_dept = emp_dept

    def display(self):
        print(f"Employee Name: {self.emp_name}, Department: {self.emp_dept}")

# self is important to access instance variables and methods

#  init method is a constructor in python

emp1 = Employee("EMP 1", "IT")
emp2 = Employee("EMP 2", "HR")

emp1.display()
emp2.display()
