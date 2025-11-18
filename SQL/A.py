 # multiple inheritance
class Company:
    def company_name(self, name):  
        self.company = name
        
class Employee:
    def emp_name(self, name):
        self.employee = name
    
class Freelancer:
    def freelancer_name(self, name):
        self.freelancer = name    

class Person(Company, Employee, Freelancer):
    def person_name(self, name):
        self.person = name
        print("person name is " + self.person)
    
    def all_details(self):
        print("person name is " + self.person)
        print("employee name is " + self.employee)
        print("company name is " + self.company)
        print("freelancer name is " + self.freelancer)

p1 = Person()
p1.person_name("John")       
p1.emp_name("Doe")          
p1.company_name("ABC Corp")  
p1.freelancer_name("Jane")  

p1.all_details()