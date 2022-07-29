import re

num = int(input())
count = 0
for i in range(num):
    realBreak = True
    string = input()
    if len(string) == 1:
        count += 1
    else:
        for letter in string:
            indices = [i.start() for i in re.finditer(letter, string)]
            if len(indices) == 1:
                continue
            else:
                n = indices[0]
                for index in indices:
                    if index - n > 1:
                        realBreak = False
                        break
                    n = index
        if realBreak == False:
            continue
        else: count += 1

print(count)