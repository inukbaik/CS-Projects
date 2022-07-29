#Name: Inuk Baik
#SBU ID: 112493042

def what_order(lst):
    i = 1
    count = 0
    while i < len(lst):
        if lst[i - 1] <= lst[i]:
            count += 1
        elif lst[i - 1] > lst[i]:
            count -= 1
            if i == len(lst) - 2 and count == len(lst) - 1:
                return 2
        i += 1
    if count == len(lst) - 1:
        return 0
    elif count == (len(lst) - 1) * -1:
        return 1
    else: return 2

#I made the function to count 1 if it finds the element is bigger than the previous one, and count -1 if it finds the element is smaller than the previous one.
#In the while loop, the i starts from 1 since I one to compare the element with previous one.
#So in the while loop, it counts 1 and -1 in (len(lst) -1) times.
#If the given lst is asdcending order, it will only count +1 so the count will be len(lst) - 1 after the loop,
#if the given lst is descending order, it will only count -1 so the count will be -(len(lst) - 1) after the loop.
#However, if the given lst is not ordered, the function counts 1 and -1 depends on the situation, so the result will be something rather than len(lst) -1 or -(len(lst) - 1)
#So according to the 'count' the function will return 0, 1, 2.

#To test the code
example = [4, 3, 6, 2]
print(what_order(example))
        