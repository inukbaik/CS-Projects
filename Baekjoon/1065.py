num = int(input())

i = 1
count = 0
while i <= num:
    string = str(i)
    if len(string) == 1 or len(string) == 2:
        count += 1
    elif int(string[2]) - int(string[1]) == int(string[1]) - int(string[0]):
        count += 1
    i += 1

print(count)