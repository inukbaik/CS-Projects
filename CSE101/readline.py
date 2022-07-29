import sys
n = int(input())
list_a = []

for i in range(n):
    a, b = map(int, sys.stdin.readline().split())

    value = a + b
    list_a.append(value)

for i in range(n):
    print(list_a[i])