#Name: Inuk Baik
#SBU ID: 112493042

def filter_valid(lst, error_symbol):
    resultList = []
    for str in lst:
        if len(str) >= 4:
            if str.count(error_symbol) == 0:
                resultList.append(str)
    result = ' '.join(resultList)
    return result

#For testing
#inputList =  ["ACB", "5BBDXA", "EFGGH5", "A5BCDEFGHI"]
#error = '5'
#print(filter_valid(inputList, error))

#First, I made an empty list called 'resultList' which will contain the strings that is legal to the conditions.
#The condition is that the function should exclude the 3 or less lengthed strings "OR" strings which have an error.
#So I thought the legal strings should satisfy 1 "And" 2 condition.
#I used if statement to choose strings whose length is same or over 4 and inside that if statement, I used .count string method to find strings that does not have error symbols.
#Then I used .append to add the strings to the resultList, and made it as a string with .join string method. I put ' ' in front of .join to divide strings with the spaces.
