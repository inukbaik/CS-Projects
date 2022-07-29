croWords = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
str = input()

for word in croWords:
        str = str.replace(word, 'x')
count = len(str)
print(count)