num = int(input())
count = 2
x, y = (2, 8)
if num == 1:
    print(1)
else:
    while num not in range(x, y):
        x = y
        y += 6 * count
        count += 1
    print(count)