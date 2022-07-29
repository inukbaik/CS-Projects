word = str(input()).upper()

max = []
count = []
biggest = 0
for letter in word:
    if letter in max:
        count[max.index(letter)] += 1
    else:
        max.append(letter)
        count.append(1)
for i in count:
    if i > biggest:
        biggest = i
if count.count(biggest) > 1:
    print('?')
else:
    print(max[count.index(biggest)]) 
