import random
# Name: Inuk Baik
# SBUID: 112493042

# Don't modify the Card class
class Card:
    def __init__(self, n):
        self._id = n
        self.suit_sym = ['\u2663', '\u2666','\u2665', '\u2660']
        self.rank_sym = ['2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K', 'A']

    def suit(self):
        return self._id // 13

    def rank(self):
        return self._id % 13

    def __repr__(self):
        return self.rank_sym[self.rank()] + self.suit_sym[self.suit()] 


class Deck:
    # You're allowed to modify the constructor.
    def __init__(self, d):
        self._deck = d

    #I added the _deck to receive a list to be the Deck and to express it.

    # TODO: Define the necessary methods 
    def shuffle(self):
        for i in range(0, len(self._deck) - 1):
            r = random.randint(i, len(self._deck) -1)
            self._deck[i], self._deck[r] = self._deck[r], self._deck[i]

    #I made it similar to the permute function. if the method is called, 
    #it will switch the position of the element in index i with the random element that is located in index r which is always placed after i and before the last element in the deck.
    #This method will shuffle the whole deck.

    def get_card(self, rank, suit):
        for i in range(len(self._deck)):
            if self._deck[i].suit() == suit and self._deck[i].rank() == rank:
                return str(self._deck[i]) + ' in index ' + str(i)

    #This method will present the card that has given rank and suit. So starting from the first card of the deck,
    #it will compare if the card's suit and rank is same with the given rank and suit.
    #If it finds the one that corresponds, it will return the card it self, and the index of it.

    def __repr__(self):
        result = ''
        for i in range(len(self._deck)):
            if result != '':
                result = result + ', '
            result = result + 'Card' + str(i + 1) + ': ' + str(self._deck[i])
        return result

    #This is the representation of the full deck. When the Deck is tried to be printed, it will return the string which arrange the whole deck.
    #Except the first card, every card will be printed after the comma(,) to distinguish, with the string which shows what card it is.
    #The cards are stored in the deck in the form of a Card class, so that the representation of the cards follow the representation of the Card class.
    
def main():
    # TODO: Write a code that will shuffle the deck 10 times, and for each shuffle, print out the deck.
    # Deck printout format: 'Card 1: <X>, Card 2: <Y>, ...', where <X> is the card printout.
    lst = []
    for i in range(52):
        lst.append(Card(i))
    d = Deck(lst)    

    #This is to fill the full deck which is sorted.
    #I made a list that is appended from the Card(0) which is Club 2 to Card(51) which is Spade Ace.
    #Then I initialized the new deck 'd' with the full deck 'lst'.

    for i in range(10):
        d.shuffle()
        print(d)

    #This for loop will shuffle and print the deck 10 times.
    #It will iterately call the shuffle method in the Deck class 10 times,
    #and then print the deck out each time.

if __name__ == '__main__':
    main()
