# Name: Inuk Baik
# SBUID: 112493042
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
# TODO: Return the Euclidean distance between two points x and y using a 'while' loop.
# Do not assume that x and y are 2-dimensional.
def dist(x, y):
    i = 0
    n = len(x)
    inside = 0
    while i < n:
        inside += (x[i] - y[i]) ** 2
        i += 1
    result = inside ** 0.5
    return result

#The function takes two coordinates. Since this coordinate may not be a two-dimensional coordinate, len(x) is used to determine which dimension the coordinates exist, and store it to 'n'.
#Make 'inside' to store the result of comparing and squaring each coordinate. Since the coordinate of the n-dimensional has n numbers in it, while i is less than n, execute a while loop and add the inside together.
#Finally result will sqrt inside to show the result of Euclidean distance.

# ---------------------------- Q2 ---------------------------------------
# TODO: Implement the nearest neighbor search algorithm using dist() above.
# i.e., find and return the closest point in 'lst' to 'q'.
def nearest_neighbor(lst, q):
    i = 0
    distance = dist(lst[0], q)
    nearest = lst[0]
    while i < len(lst):
        if dist(lst[i], q) == 0:
            return lst[i]
        elif dist(lst[i], q) < distance:
            nearest = lst[i]
            distance = dist(lst[i], q)
        i += 1
    return nearest

#First make 'distance' as the distance between first coordinate in the list from q. 'distance' will be used to store the distance from q to the nearest coordinate. 
#And the 'nearest' will store the nearest coordinate.
#Until i is the last index of the 'lst', using dist() function to compare if the 'i'th coordinate is closer to the 'q'.
#If 'i'th function is closer, make it as new 'nearest' and its distance as 'distance'.
#The function will make the comparison by the number of elements in lst in most cases. Since, the given list is not sorted and we don't know if there is the same coordinate as q.
#The function has to look if there is closer coordinate until the end of the lst, unless it has the same coordinate as q.
#So it has to make len(lst) times of comparisons.




# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
db = [[2, 3], [0, 0], [1, 6], [5, 2], [9, 10]]
q = [0.5, 0.1]
print(dist(db[0], db[1])) # Should print out the square root of 13

print(nearest_neighbor(db, q)) # Should print out [0, 0]
