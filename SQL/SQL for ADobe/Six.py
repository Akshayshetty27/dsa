#  reading excel file using pandas
import pandas as pd
df = pd.read_excel('sample.xlsx', sheet_name='Sheet1');

print(df.head());


#  read json file using pandas
json_df = pd.read_json('sample.json');
print(json_df.head());

#  reading specific sheet from excel file
sheet2_df = pd.read_excel('sample.xlsx', sheet_name='Sheet2');
print(sheet2_df.head());


# cleaning data using pandas
import pandas as pd
df = pd.read_csv('sample.csv');

df.isna().sum()
df_cleaned = df.dropna();
print(df_cleaned.head());



df_clean =df.dropna(subset=['Column1', 'Column2']);


# filling missing values
df["age"] =df["age"].fillna(df["age"].mean());



#  replace
df["status"] = df["status"].replace({"single": "unmarried", "married": "wed"});

# renaming columns
df = df.rename(columns={"First Name": "First_Name", "Last Name": "Last_Name"});
print(df.head());

# querying data
filtered_df = df[df["age"] > 30];
print(filtered_df.head());
