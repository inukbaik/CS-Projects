# Name:
# SBUID: 
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
def reverse_print(lst):
    for i in range(len(lst) - 1, -1, -1):
        print(lst[i])

# ---------------------------- Q2 ---------------------------------------
def cross_sum(l1, l2):
    for i in range(len(l1)):
        for j in range(len(l2)):
            print(l1[i] + l2[j])

# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
lst = [5, 2, -1, 100]
reverse_print(lst) # Should print out 100, -1, 2, 5 (vertical printout allowed)

lst2 = [1, 2, 3]
cross_sum(lst, lst2) # Should print out 6, 7, 8, 3, 4, 6, 0, 1, 2, 101, 102, 103 (vertical allowed)
