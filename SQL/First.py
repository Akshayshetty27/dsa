# //Python fundamental concepts
# what  happens in the background 
#  step1
    # when we run .py file  , python  first  compiles the entire script into an intermediate form called bytecode  (i.e  .pyc file ).
    # this happens all at once not  line by line  

    # it is not machine code lowerlevel code that python interpreter can understand 

# step2 : Execution by python virtual machine (PVM)
    # bytecode is  executed by python virtual machine (PVM) line by line
    # this is why python is called interpreted language
    
# step3 : platform independence
    # bytecode is platform independent  , it can run on any platform that has a compatible python interpreter 
    # this makes python a portable language
    
    
print("hello from python ", 1 , 'ILP' ,sep='---')  

print(''' go to next line
    and next line using Single Quote ''')

print(""" go to next line
    and next line  using Double Quote """)



#  Variables in python
#  variables are used to store data values
#  no need to declare variable type
#  variable name should start with a letter or underscore (_)   

My_var = 10 # integer variable
my_var2 = 20.5 # float variable
my_var3 = "Hello" # string variable
_myVar4 = 'A' # character variable
myVar5 = True # boolean variable
print("integer variable:", My_var)
print("float variable:", my_var2)
print("string variable:", my_var3)
print("character variable:", _myVar4)
print("boolean variable:", myVar5)

total_sum = 10 +20\
            +30 + 40 +50
print(total_sum)


#  indentation in python
#  indentation is used to define blocks of code
#  python uses whitespace (spaces or tabs) to indicate indentation level
#  consistent indentation is important to avoid syntax errors

if total_sum > 50:
    print("total_sum is greater than 50")
    if total_sum > 100:
        print("total_sum is also greater than 100")
    else:
        print("total_sum is not greater than 100")
else:
    print("total_sum is not greater than 50")   