n = int(input())
line = 0
maxNum = 0
while n > maxNum:
    line += 1
    maxNum += line
row = line
column = 0
for i in range(line):
    if maxNum - i == n:
        column = line - i
        break
print(str(column) + '/' + str(row))