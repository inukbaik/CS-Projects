i = 1
list = list(range(1, 10001))

def self(a):
    length = len(str(a))
    nn = a
    for i in range(length):
        b = a // 10 ** (length - i - 1)
        nn += b
        a = a - b * 10 ** (length - i - 1)
    return nn

while self(i) <= 10001:
    list.remove(self(i))
    i += 1

    
for x in range(len(list)):
    print(list[x])