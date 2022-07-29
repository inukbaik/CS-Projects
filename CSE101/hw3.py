# Name: Inuk Baik
# SBUID: 112493042
# Remove the ellipses (...) when writing your solutions.
# ---------------------------- Q1 ---------------------------------------
def reverse_print(lst):
    for i in range(len(lst)):
        print(lst[len(lst) - 1 - i])

#For this code, the given list 'lst' has the index of 0 to len(lst) - 1.
#So if I use a for loop whose 'i' increases from 0 to len(lst) - 1, since we use range(len(lst)),
#the print statement in the for loop will print out the lst reversely.
#If i is 0, lst[len(lst) - 1 - 0] which is the last value of the lst will be printed out.
#and the loop will printout the values iterately to the first value of the lst.

# ---------------------------- Q2 ---------------------------------------
def cross_sum(l1, l2):
    for a in l1:
        for b in l2:
            print(a + b)

#I used two for loops. the first loop will bring 'a' from the l1, and then the second loop will choose all the values as 'b' iterately.
#After sum of first 'a' and every 'b's were printed out, then the first loop will bring the next 'a', and second loop will bring all the values as 'b' again.
#It will iterately print out all the possible sums.

# ---------------------------- Test -------------------------------------
# The following lines are for testing purposes, and will not be part of
# your grade. You may freely modify the following codes.
lst = [5, 2, -1, 100]
reverse_print(lst) # Should print out 100, -1, 2, 5 (vertical printout allowed)

print() #to separate two answers

lst2 = [1, 2, 3]
cross_sum(lst, lst2) # Should print out 6, 7, 8, 3, 4, 5, 0, 1, 2, 101, 102, 103 (vertical allowed)
