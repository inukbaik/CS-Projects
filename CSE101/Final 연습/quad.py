#--------------------------------------------------Task 1---------------------------------------------------
# You're free to change these values, but some combinations won't work.
a = 1
b = -3
c = 1

x1 = (-b + (b ** 2 - 4 * a * c) ** 0.5) / (2 * a)  # TODO: write a code to compute the first root of the quadratic equation
x2 = (-b - (b ** 2 - 4 * a * c) ** 0.5) / (2 * a)  # TODO: then do the same for the second root
# Note: Make sure to remove the ellipsis (...) when you're writing your code

print("First root:" + str(x1))
print("Second root:" + str(x2))

#--------------------------------------------------Task 2---------------------------------------------------
# TODO: Declare two variables x and y, and initialize them to whatever positive values you like
x = 10
y = 3
# TODO: Write a code that displays the result of division x / y
#       The output should consist of two lines: the first line is the quotient, the second line is the remainder
#       ex) The above combination should print out the following:
#            3
#            1
# You can declare as many variables as you need.
print(x // y)
print(x % y)