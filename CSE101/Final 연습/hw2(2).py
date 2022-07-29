# Name:
# SBUID: 
# Remove the ellipses (...) when writing your solutions.
import math
# ---------------------------- Q1 ---------------------------------------
# TODO: Implement quad(a,b,c) that returns the solution in human-readable form.
#       Unlike the quiz, the square roots should be computed explicitly using 
#       math.sqrt(). 
#       You MUST use a try-except block to handle imaginary units.
def quad(a, b, c):
    inTheSqrt = b ** 2 - 4 * a * c

    if inTheSqrt == 0:
        square = 'sqrt(0)'
    
    else:
        try:
            if math.sqrt(inTheSqrt) % 1 == 0:
                square = str(int(math.sqrt(b ** 2 - 4 * a * c)))
            else:
                square = str(math.sqrt(b ** 2 - 4 * a * c))
        except:
            inTheSqrt = - inTheSqrt
            if math.sqrt(inTheSqrt) % 1 == 0:
                square = 'i*' + str(int(math.sqrt(-(b ** 2 - 4 * a * c))))
            else:
                square = 'i*' + str(math.sqrt(-(b ** 2 - 4 * a * c)))

    x1 = str(-b) + '+' + square + ' OVER ' + str(2 * a)
    x2 = str(-b) + '-' + square + ' OVER ' + str(2 * a)
    return x1 + ', ' + x2

# ---------------------------- Q2 ---------------------------------------
# TODO: Implement get_negatives() that returns the string containing all the
#       negative numbers in the list. The negative numbers should be separated
#       by commas. E.g., "-4, -5, -6, -7"
def get_negatives(lst):
    result = []
    for num in lst:
        if num < 0:
            result = result + [0]
            result[len(result) - 1] = num
    rs = ''
    for num in result:
        if rs == '':
            rs = rs + str(num)
        else:
            rs = rs + ', ' + str(num)
    return rs


# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
a = 1
b = 4
c = 5
print("Q1: " + quad(a, b, c)) # Should print out "Q1: -4+i*2 OVER 2, -4-i*2 OVER 2"

lst = [1, 2, 3, -4, -5, -6, -7]
print("Q2: " + get_negatives(lst)) # Should print out "Q2: -4, -5, -6, -7"
