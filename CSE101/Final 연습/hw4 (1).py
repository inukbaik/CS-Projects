# Name:
# SBUID: 
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
# TODO: Return the Euclidean distance between two points x and y using a 'while' loop.
# Do not assume that x and y are 2-dimensional.
def dist(x, y):
    i = 0
    inner = 0
    while i < len(x):
        inner += (x[i] - y[i]) ** 2
        i += 1
    
    return inner ** 0.5

# ---------------------------- Q2 ---------------------------------------
# TODO: Implement the nearest neighbor search algorithm using dist() above.
# i.e., find and return the closest point in 'lst' to 'q'.
def nearest_neighbor(lst, q):
    distance = dist(lst[0], q)
    i = 1
    point = lst[0]
    while i < len(lst):
        if dist(lst[i], q) < distance:
            distance = dist(lst[i], q)
            point = lst[i]
        i += 1
    return point


# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
db = [[2, 3], [0, 0], [1, 6], [5, 2], [9, 10]]
q = [0.5, 0.1]
print(dist(db[0], db[1])) # Should print out the square root of 13

print(nearest_neighbor(db, q)) # Should print out [0, 0]
