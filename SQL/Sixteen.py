# class method in python
class Car:
    wheels = 4
    def __init__(self, make, model):
        self.make = make
        self.model = model

    def display(self):
        print(f"Car Make: {self.make}, Model: {self.model}, Wheels: {Car.wheels}")

    @classmethod
    def change_wheels(cls, new_wheel_count):
        cls.wheels = new_wheel_count

car1 = Car("Toyota", "Camry")
car2 = Car("Honda", "Civic")
car1.display()
car2.display()
Car.change_wheels(6)
car1.display()
car2.display()
car3 = Car("Ford", "Mustang")
car3.display()
