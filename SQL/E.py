# threaing concept in python using ThreadPoolExecutor
import concurrent.futures
import time
import random

def task(name):
    sleep_time = random.randint(1, 5)
    time.sleep(sleep_time)
    print(f"Task {name} completed after {sleep_time} seconds")
task_names = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']

# here we create a ThreadPoolExecutor with a maximum of 3 worker threads

with concurrent.futures.ThreadPoolExecutor(max_workers=3) as executor:
    executor.map(task, task_names)
print("All tasks are completed.")


#  threading in python 
import threading
import time 
def print_hello():
    for _ in range(5):
        print("Hello")
        time.sleep(1)
def print_world():
    for _ in range(5):
        print("World")
        time.sleep(1)
    
thread1 = threading.Thread(target=print_hello)
thread2 = threading.Thread(target=print_world)

