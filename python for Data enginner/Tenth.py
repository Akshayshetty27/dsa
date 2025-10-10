#   Functions in  Python
def  is_even(n):
        if n % 2 == 0:
            return True
        else:
            return False
    
print(is_even(4))
print(is_even(5))

def factorial(n):
    if n==0  or n ==1 :
        return 1
    else: 
        return factorial( n-1) * n

print(factorial(5))
print(factorial(11))

def  is_anagram(str1 ,str2):
    if sorted(str1) == sorted(str2):
        return True
    else:
        return False
print(is_anagram("listen" , "silent"))
print(is_anagram("hello" , "world"))


def fib( n):
    fib1 =0 
    fib2 =1
    if n==0 :
        return fib1
    elif n==1:
        return fib2
    else:
        for i in range(2 , n+1):
            fib_n = fib1 + fib2
            fib1 = fib2
            fib2 = fib_n
        return fib_n

print(fib(10))
print(fib(1))