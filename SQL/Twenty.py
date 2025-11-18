# hiearchical inheritance
class A:
    def feature1(self):
        print("feature 1 is working")
    def feature2(self):
        print("feature 2 is working")
        
class B(A):
    def feature3(self):
        print("feature 3 is working")
    def feature4(self):
        print("feature 4 is working")
class C(A):
    def feature5(self):
        print("feature 5 is working")
    def feature6(self):
        print("feature 6 is working")
class D(A):
    def feature7(self):
        print("feature 7 is working")
    def feature8(self):
        print("feature 8 is working")

a1 = A()
a1.feature1()
a1.feature2()
b1 = B()
b1.feature3()
b1.feature4()
b1.feature1()

d1 = D()
d1.feature7()
d1.feature8()
d1.feature2()
d1.feature1()