#  sample project 

file = open("sample.txt", "r");
content = file.read();

numbers = [];

for line in content.splitlines():
    numbers.append(int(line));
file.close();   

print("Numbers:", numbers);
def calculate_sum(nums):
    total = 0
    for num in nums:
        total += num
    return total        

print("Sum of Numbers:", calculate_sum(numbers));

