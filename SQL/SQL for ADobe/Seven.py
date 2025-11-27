#  Group BY in Pandas Library in Python
import pandas as pd
df = pd.read_csv('sample.csv');
grouped_df = df.groupby('city')['Salary'].mean();
print(grouped_df);

# Aggregation functions in Pandas

agg_df = df.groupby('city').agg({'Salary': ['mean', 'sum', 'max'], 'age': 'min'});
print(agg_df);

#  group by multiple columns
multi_grouped_df = df.groupby(['city', 'department'])['Salary'].mean();
print(multi_grouped_df);

# get count of records in each group
df.groupby('city').size();
print(df.groupby('city').size());


# value counts for a specific column
city_counts = df['city'].value_counts();
print(city_counts);

# iinclude Nan values 
city_counts_nan = df['city'].value_counts(dropna=False);
print(city_counts_nan);

# get percentage distribution of values
city_per = df['city'].value_counts(normalize=True) * 100;
print(city_per);

# sort by count 
sorted_city_counts = df['city'].value_counts().sort_values(ascending=False);
print(sorted_city_counts);

