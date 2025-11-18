#  import time 
import time

import random 
from concurrent.futures import ThreadPoolExecutor


list = ["order" , "payment" , "delivery" , "feedback" , "support" , "refund" , "cancellation" , "inquiry"];

def fun(i):
    wait = random.randint(1,5)
    time.sleep(wait)
    print(f"Task {i} completed after {wait} seconds")
    
    
    
with ThreadPoolExecutor(max_workers=3) as executor:
    executor.map(fun, list)
    
print("All tasks completed")
