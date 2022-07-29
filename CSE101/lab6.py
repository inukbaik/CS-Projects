# Name: Inuk Baik
# SBUID: 112493042

def to_int(s):
    if s == '':                                         #base case
        return 0
    elif s[0] == '-' and s[1:].isdigit() == True:       #When given s is a negative number
        return 0 - to_int(s[1:])
    elif s.isdigit() == False:                          #another base case when 's' is not a numeric stirng
        return None
    else:                                               #recursive case
        i = 0
        while str(i) < s[0]:
            i += 1
        return i * 10 ** (len(s) - 1) + to_int(s[1:])
        

s = '-4-321'
# s = '234.3'   # should result in None
# s = 'abc'   # should result in None


print(to_int(s)) # Should print 4321
