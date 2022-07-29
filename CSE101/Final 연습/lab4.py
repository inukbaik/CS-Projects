# Name:
# SBUID:

# TODO: Complete this function for task 1
def find_max(lst):
    ind = 0
    max_val = lst[0]
    # TODO: Fill here
    for i in range(1, len(lst)):
        if lst[i] > max_val:
            max_val = lst[i]
            ind = i
    return ind, max_val

# TODO: Complete this function for task 2
def print_sums(lst):
    for i in lst:
        for j in lst:
            print(i + j)


lst = [1, 2, 3]
print(find_max(lst)) # Should print out (2, 3)

print_sums(lst) # See the slides for a printout
