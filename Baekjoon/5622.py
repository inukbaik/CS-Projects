string = input()
dial = [['A', 'B', 'C'], ['D', 'E', 'F'], ['G', 'H', 'I'], ['J', 'K', 'L'], ['M', 'N', 'O'], ['P', 'Q', 'R', 'S'], ['T', 'U', 'V'], ['W', 'X', 'Y', 'Z']]
number = 0
for letter in string:
    for list in dial:
        if letter in list:
            number += dial.index(list) + 3

print(number)