# learning inheritance with family members

class Family:
    def __init__(self, family_name):
        self.family_name = family_name

    def display(self):
        print(f"Family Name: {self.family_name}")


# Single-level inheritance
class Parent(Family):
    def __init__(self, family_name, parent_name):
        super().__init__(family_name)  # Calls Family.__init__
        self.parent_name = parent_name

    def display(self):
        super().display()  # Calls Family.display
        print(f"Parent Name: {self.parent_name}")


parent = Parent("Smith", "John")
print("--- Single Level Inheritance ---\n")
parent.display()


# Multilevel inheritance
class Child(Parent):
    def __init__(self, family_name, parent_name, child_name):
        super().__init__(family_name, parent_name)  
        self.child_name = child_name

    def display(self):
        super().display() 
        print(f"Child Name: {self.child_name}")


child = Child("Smith", "John", "Alice")
print("\n --- Multilevel Inheritance --- \n ")
child.display()


