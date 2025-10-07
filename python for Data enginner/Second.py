# typecasting in python
a = 10  
b= 10.2
c= a + int(b) 
print(c)
print(type(c))
d= a + float(b)     
print(d)
print(type(d))

x= "shetty";

print(x + str(a))
print(x[::-1]  , x[::3] , x[0:len(x):2])
for i in range(0, len(x)):
    print(x[i])