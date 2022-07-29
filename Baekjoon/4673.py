def d(n):
    num = n
    for i in range(len(str(n))):
        num += int(str(n)[i])
    return num

i = 1
while i < 10000:
    i = d(i)
    print(i)