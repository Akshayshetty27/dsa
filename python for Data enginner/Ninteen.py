# inheritence in python 
class Company :
    def __init__(self,company_name):
        self.company_name = company_name
    def display(self):
        print(f"company name is {self.company_name}")

class Employee(Company):
    def __init__(self, emp_name, emp_dept, company_name):
        super().__init__(company_name) 
        self.emp_name = emp_name
        self.emp_dept = emp_dept
    def display(self):
        super().display()  
        print(f"Employee Name: {self.emp_name}, Department: {self.emp_dept}")
emp1 = Employee("EMP 1", "IT", "ABC Corp")
emp1.display()
        