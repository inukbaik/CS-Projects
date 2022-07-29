def hanoi(n):
    if n == 1:
        return 0
    else:
        count += 1
        return str(count) + '\n' + hanoi(n - 1)

num = int(input())
count = 0
print(hanoi(num))