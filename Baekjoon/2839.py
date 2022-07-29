num = int(input())

five = 0
three = 0

five = num // 5
three = (num - 5 * five) / 3
if three % 1 != 0:
    while five > 0 and three % 1 != 0:
        five -= 1
        three = ((num - 5 * five) / 3)
    if three % 1 == 0:
        print(five + int(three))
    else: print(-1)
else: print(five + int(three)) 