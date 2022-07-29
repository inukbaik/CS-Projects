result = []
for i in range(int(input())):
    h, w, n = map(int, input().split())
    if h == 1:
        y = 1
        x = n
    else:
        x = n // h + 1 
        y = n % h
    
    if y == 0:
        y = h
        x -= 1
    if x < 10:
        room = str(y) + '0' + str(x)
    else:
        room = str(y) + str(x)
    result.append(room)
for num in result:
    print(num)