# -------------------------------------- Task 1 -----------------------------------
def add(x, y):
    return x + y

# TODO: Add definitions of sub(), div(), mult(), exp(), as well as neg() and sqrt().
#       neg() should return the negation of the given number, and sqrt() should
#       return the square root of the given number. 
def sub(x, y):
    return x - y

def div(x, y):
    return x / y

def mult(x, y):
    return x * y

def exp(x, y):
    return x ** y

def neg(x):
    return 0-x

def sqrt(x):
    return x ** 0.5


# -------------------------------------- Task 2 -----------------------------------

# TODO: Implement the quadratic formula using *only* the functions defined here.
#       Do not use arithmetic operators directly. 
#       You're allowed to define other functions.
a = 1
b = -3
c = 1

x1 = (add(neg(b), sqrt(sub(exp(b, 2), mult(4, mult(a, c))))))/mult(a, 2)
x2 = (sub(neg(b), sqrt(sub(exp(b, 2), mult(4, mult(a, c))))))/mult(a, 2)

print("First root:" + str(x1))
print("Second root:" + str(x2))
