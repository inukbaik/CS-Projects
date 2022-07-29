a, b, c = map(int, input().split())
if c - b > 0:
    x = int(a / (c - b)) + 1
else: x = -1
print(x)