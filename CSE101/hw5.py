# Name: Inuk Baik
# SBUID: 112493042
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
# TODO: Given a list 'lst', perform a movement of item at index 'from_index'
#       to the index 'to_index'.
def move(lst, from_index, to_index):
    if from_index > to_index:
        for i in range(from_index, to_index, -1):
            temp = lst[i]
            lst[i] = lst[i - 1]
            lst[i - 1] = temp
    elif from_index < to_index:
        for i in range(from_index, to_index):
            temp = lst[i]
            lst[i] = lst[i + 1]
            lst[i + 1] = temp
    return lst

#This function has to be divided into two cases. 1. from_index > to_index and 2. from_index < to_index.
#For the first case, existing sequence should be pused to the right.
#So start from the from_index, it will swap itself with the previous element iterately to the left (index decreasing).
#Since I cannot use pop and insert, using temp to store lst[i], make lst[i] as lst[i - 1] and make lst[i - 1] as temp.
#Similarly, second case is about pushing existing sequence to the left.
#Start from the from_index, it will swap itself with the next element iterately to the right (index increasing).

# ---------------------------- Q2 ---------------------------------------
# TODO: Provide a run-time analysis of your implementation of move().
# That is, try to express the number of iterations in terms of N, which is 
# the number of items in 'lst'. You don't have to write the big-O, though.

#The function is about swapping itself with the previous or the next element until it finds the correct place (to_index).
#So it will be iterate at least 0 time (when from_index == to_index), at most N times (when from_index and to_index is placed at the very first and end).
#If len(lst) gets bigger, for example twice, the run-time will be at most 2N. When len(lst) gets 10,000 times bigger, it will have at most 10,000N times of comparisons.
#Average case scenario, it will roughly have N / 2 number of iterations.
#The graph of len(lst) and number of comparison will be the shape of a straight line.

# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
lst = [3, 2, 1, 5, 9, 2]
print(move(lst, 3, 1)) # Should print out [3, 5, 2, 1, 9, 2]
lst = [1, 2, 3, 4, 5]
print(move(lst, 2, 4)) # [1, 2, 4, 5, 3] 
lst = [1, 2, 3, 4, 5]
print(move(lst, 1, 3)) 
lst = [1, 2, 3, 4, 5]
print(move(lst, 2, 0)) 
lst = [1, 2, 3, 4, 5]
print(move(lst, 3, 4)) 