#Name: Inuk Baik
#SBU ID: 112493042
def selection_sort(lst, order):
    if order == 'a':
        for i in range(len(lst) - 1):
            least_i = i
            for k in range(i + 1, len(lst)):
                if lst[k] < lst[least_i]:
                    least_i = k
            lst[least_i], lst[i] = lst[i], lst[least_i]
    else:
        for i in range(len(lst) - 1):
            most_i = i
            for k in range(i + 1, len(lst)):
                if lst[k] > lst[most_i]:
                    most_i = k
            lst[most_i], lst[i] = lst[i], lst[most_i]
    return lst

#From the given selection sort function in the class, I had to add if, else statement to decide whether the function should sort the lst in ascending or descending order.
#So, if given string 'order' is 'a' it is same from the lecture's function, otherwise, it has to pick most_i which is the biggeest number's index.
#It will go through almost same amount of iterations as the ascending selection sort, since after distinguishing the 'order' the code has similar structure.
#The function will have N-1 comparisons for the fisrt for loop and the second for loop will have (N-1)/2 comparisons.
#So it will have (N-1)*(N-1)/2 comparisons, and the big O of the function should be O(n^2) big oh of n-squared.

lst = [4, 3, 5, 6]
print(selection_sort(lst, 'd'))
