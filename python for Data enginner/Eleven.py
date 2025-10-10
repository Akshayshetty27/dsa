def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
def lcm(a, b):
    return a * b // gcd(a, b)
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

print(gcd(48, 18))
print(lcm(4, 5))    

def is_palindrome_and_anagram(s):
    def is_palindrome(s):
        return s == s[::-1]
    
    def is_anagram(str1, str2):
        return sorted(str1) == sorted(str2)
    
    return is_palindrome(s), is_anagram(s, s[::-1])

print(is_palindrome_and_anagram("racecar"))
print(is_palindrome_and_anagram("hello"))