#Name: Inuk Baik
#SBU ID: 112493042

def count(s, target):
    if len(s) == 0: #base case
        return 0
    elif s[:len(target)] == target: #recursive case, when target is found
        return 1 + count(s[1:], target)
    else: return count(s[1:], target) #recursive case, when target is not found

#base case is when the string is empty. It is base case because if len(s) == 0, whatever the target is, it would not be in string so it will always return 0. Also, if the string is empty, there will be no more search after returning 0, so it is the base case.
#Recursive case: There are two cases for the recursive case.
#If the target is found in the string, from the start, if the string's substring which has same length as the target is same as the target, it will count 1 and call another count function which starts from the index 1 of the string that used.
#If the target is not found from the start to the index of len(target) - 1, it will not count anything and just call another count function which starts from index 1 of the string that used.
#These two cases are recursive cases since it will call the functions recursively until it reach to the base case (When string is empty).

s = 'aaabbb'
target = 'aa'
print(count(s, target))