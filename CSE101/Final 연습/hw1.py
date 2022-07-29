# Name:
# SBUID: 
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
# TODO: Complete the implementation of heron() and perimeter(). You
#       *MUST* use perimeter() in the body of heron().
def heron(a, b, c): # Should declare at least two variables
    p = perimeter(a, b, c) / 2
    size = (p * (p - a) * (p - b) * (p - c)) ** 0.5
    return size

def perimeter(a, b, c):
    return a + b + c
# ---------------------------- Q2 ---------------------------------------
# TODO: Complete the final_score() implementation. final_score() should use
#       another function called avg(), which you should define. avg() computes
#       the average of three numbers.
def final_score(hw1, hw2, hw3, q1, q2, q3, final, hw_weight, qz_weight, fin_weight):
    avg_hw = avg(hw1, hw2, hw3)
    avg_q = avg(q1, q2, q3)
    return avg_hw * hw_weight + avg_q * qz_weight + final * fin_weight

def avg(a, b, c):
    return (a + b + c) / 3
# ---------------------------- Q3 ---------------------------------------
def det3x3(a, b, c, d, e, f, g, h, i):
    return a * det2x2(e, f, h, i) - b * det2x2(d, f, g, i) + c * det2x2(d, e, g, h)

def det2x2(a, b, c, d): # You must use this function in det3x3 as often as possible.
    return a * d - b * c

# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
a = 5
b = 2
c = 5
print("Q1: " + str(heron(a, b, c))) 

hw1, hw2, hw3, q1, q2, q3, final = 100, 50, 70, 90, 50, 80, 80 # 73.333 * 0.3 + 73.333 * 0.3 + 80 * 0.4
print("Q2: " + str(final_score(hw1, hw2, hw3, q1, q2, q3, final, 0.3, 0.3, 0.4))) # should be 76.0

a, b, c, d, e, f, g, h, i = 1, 2, 3, 3, 2, 1, 2, 1, 3
print("Q3: " + str(det3x3(a, b, c, d, e, f, g, h, i))) # should be -12