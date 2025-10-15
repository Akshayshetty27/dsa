#  inheritence in python 
class Animal:
    def __init__(self , name , species):
        self.name = name
        self.species = species
    def display(self):  
        print(f"animal name is {self.name} and species is {self.species} ")
    # single level inheritence
class Dog(Animal):
    def __init__(self, name, species, breed):
        super().__init__(name, species) 
        self.breed = breed

    def display(self):
        super().display()  
        print(f"Breed: {self.breed}")
    
    
dog = Dog("Buddy", "Canine", "Golden Retriever")
dog.display()


# multilevel inheritence
class Puppy(Dog):
    def __init__(self, name, species, breed, age):
        super().__init__(name, species, breed)
        self.age = age

    def display(self):
        super().display()
        print(f"Age: {self.age} months")
puppy = Puppy("Max", "Canine", "Labrador", 6)
puppy.display()
