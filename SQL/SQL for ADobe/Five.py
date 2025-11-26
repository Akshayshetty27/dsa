#  Pandas Library in Python

import pandas as pd
df = pd.read_csv('sample.csv');
# if csv separated by other than comma
#  example for semicolon separated values
data = pd.read_csv('sample.csv',sep=';');



print(df.head());
# Display first 5 rows

print(df.tail());
# Display last 5 rows

print(df.describe());
# Summary statistics


print(df.shape)
# Number of rows and columns

print(df.info())
# Data types and non-null counts

print(df.columns)
# Column names



# if we want to select specific columns
df = pd.read_csv('sample.csv', usecols=['First Name', 'Last Name', 'Company']);

print(df.head());


#  if want to limit noumber of rows to read
df = pd.read_csv('sample.csv', nrows=10);