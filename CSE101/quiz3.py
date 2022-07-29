#Name: Inuk Baik
#SBU ID: 112493042

def reverse_words(s):
    counts = s.count(' ') + 1
    list = [''] * counts
    word = ''
    index = 0
    stringIndex = 0
    for letter in s:
        if letter == ' ' :
            list[index] = word
            word = ''
            index += 1
        else:
            word += letter
        if stringIndex == len(s) - 1:
            list[index] = word
        
        stringIndex += 1
    
    resultList = [''] * counts
    index = 0
    for word2 in list:
        newWord = ''
        for i in range(len(word2)):
            newWord += word2[len(word2) - 1 - i]
        resultList[index] = newWord
        index += 1
    return resultList


#I made an list which contains empty strings which has same lengths as the s.
#Then I added words which could be divided by ' ' by using if statements.
#If ' ' is found, the saved letters(words) will be added to the list.
#If the letter is the last letter, it will be added to the list too.
#If not, which means the letter is still in the word, it will add to the empty stirng called "word"
#Then using the for loops and the list, I reversed it by calling the letters reversely, and added it to the resultList.




print(reverse_words('I n v u'))

