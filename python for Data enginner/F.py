# Requests moules in Python

#  it is acts as a middle ware to send   API requests and handle responses

import requests
response = requests.get("https://jsonplaceholder.typicode.com/posts/1") # sending a GET request to the specified URL ( example API endpoint) 

data = response.json();

print(data)
print("Title:", data['title'])


# numphy module in python
import numpy as np
array = np.array([1, 2, 3, 4, 5])
print("Numpy Array:", array)
print("Mean:", np.mean(array))
print("Standard Deviation:", np.std(array))
print("Sum:", np.sum(array))

# Pandas module in Python
import pandas as pd
data = {
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [25, 30, 35],
    'City': ['New York', 'Los Angeles', 'Chicago']
}
df = pd.DataFrame(data)
print("DataFrame:")
print(df)
print("Average Age:", df['Age'].mean())
print("Cities:", df['City'].tolist())
