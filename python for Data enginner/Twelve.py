#  sum of digits 

def sum_of_digits(n):
    sum =0
    while  n > 0 :
        rem = n % 10 
        sum += rem
        n = n // 10 ;
    return sum;

print(sum_of_digits(120))

def palindrome(num):
    rev = 0
    temp = num

    while temp > 0:
        rem = temp % 10
        rev = rev * 10 + rem  
        temp = temp // 10

    return rev == num

if palindrome(121):
    print("121 is a palindrome")
else:
    print("121 is not a palindrome")
