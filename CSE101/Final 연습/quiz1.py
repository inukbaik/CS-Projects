#First, calculate the value in the square root. 
#Then, determine whether the number in the square root is positive or negative.
#At this time, use "if" statement, if the value in the square root is negative, it is converted to a positive number and i is printed before the root.
#Now put value separately in quad1 and quad2 and use string "OVER" when it should use division.
#The situation where b is 0 is determined by the if conditional statement, and at this time, print from the square root part.
#if inTheSqrt = 0, quad1 and quad2 is same. Find it by if statement.

def quad(a, b, c):
    inTheSqrt = b ** 2 - 4 * a * c
    square = "sqrt(" + str(inTheSqrt) + ")"
    if inTheSqrt < 0:
        inTheSqrt = -inTheSqrt
        square = "i*sqrt(" + str(inTheSqrt) + ")"
    
    quad1 = str(b) + "+" + square + " OVER " + str(2 * a)
    quad2 = str(b) + "-" + square + " OVER " + str(2 * a)

    if b == 0:
        quad1 = square + " OVER " + str(2 * a)
        quad2 = "-" + square + " OVER " + str(2 * a)
    
    value = quad1 + ", " + quad2

    if inTheSqrt == 0:
        value = quad1
    
    return print(value)


quad(1, 4, 5)
quad(2, 5, 1)
quad(1, 2, 1)
quad(-1, -1, 1)
quad(1, 0, 5)