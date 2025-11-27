import pandas as pd

customers = pd.DataFrame({
    "id": [1, 2, 3, 4],
    "name": ["Alice", "Bob", "Charlie", "David"]
})

orders = pd.DataFrame({
    "order_id": [101, 102, 103, 104],
    "customer_id": [1, 2, 2, 3],
    "amount": [250, 150, 300, 400]
})

# Inner join 
inner_join_data = pd.merge(
    customers,
    orders,
    left_on='id',       
    right_on='customer_id',
    how='inner'
)

print("Inner Join:\n", inner_join_data)



# Left Join
left_join_data = pd.merge(
    customers,
    orders,
    left_on='id',
    right_on='customer_id',
    how='left'
)   

print("Left Join:\n", left_join_data)

# Right Join
right_join_data = pd.merge(
    customers,
    orders,
    left_on='id',
    right_on='customer_id',
    how='right'
)

print("Right Join:\n", right_join_data)

# Full Outer Join
full_outer_join_data = pd.merge(
    customers,
    orders,
    left_on='id',
    right_on='customer_id',
    how='outer'
)   

print("Full Outer Join:\n", full_outer_join_data)

