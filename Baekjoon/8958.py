num = int(input())
list = []
for i in range(num):
    list.append(str(input()))

for string in list:    
    score = 0
    mult = 1
    for letter in string:
        if letter == 'O':
            score += mult
            mult += 1
        else: mult = 1
    print(score)