def is_even(n):
    return n % 2 == 0

def sum_even(lst):
    result = 0
    for num in lst:
        if is_even(num) == True:
            result += num
    return result

list = [1,2,3,4,5,6]
print(sum_even(list))