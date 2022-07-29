
# TODO: Complete this function for task 1
# Use try-except block to handle errors


def check_number1(s):
    try:
        num = int(s)
        if num >= 100:
            num = num % 100
            if num == 0:
                return('00')
        elif num < 10:
            return '0' + str(num)
        return str(num)

    except:
        return('00')

# TODO: Complete this function for task 2
# Use string methods to handle errors
def check_number2(s):
    if s.isdigit() == False:
        return('00')
    else:
        num = int(s)
        if num >= 100:
            num = num % 100
            if num == 0:
                return('00')
        elif num < 10:
            return '0' + str(num)
        return(str(num))

def go():
    year = input("Year of birth (YYYY): ")
    month = input("Month of birth (MM): ")
    day = input("Day of birth (DD): ")

    #year = check_number1(year)
    #month = check_number1(month)
    #day = check_number1(day)

    year = check_number2(year)
    month = check_number2(month)
    day = check_number2(day)

    print(year + month+ day) # Should print 020501 for 2002 May 1st

go()
