#Name: Inuk Baik
#SBU ID: 112493042

def b2d(n):
    try:
        count = 0
        dec = 0
        while n:
            if n % 10 != 1 and n % 10 != 0:
                return 'Invalid Input: Require Binary number input'
            # This if statement will handle the illegal input which the input is not the binary number.
            # If you put a none binary number, modulo 10 of it should be other than 0 and 1, so it will immediately return the error message.
            # If the none binary number's last digit is 0 or 1, it will eventually return the error message during the iteration.
            dec += n % 10 * 2 ** count
            n //= 10
            count += 1
        return dec

        #This while loop will deal with the last digit of the number until it the n became 0.
        #It will mod the last digit by 10 and multiply 2 ** (position - 1), and add it to the dec which will store decimal value of the binary number.
        #And then, floor division the n by 10 so that it can proceed to the next digit.
        #Also, count will be increasing in every iteration, so that it can represent the digit that is proceeding.

    except:
        return 'Invalid Input: Require integer input'
    # This try except block will find the error which the input cannot be mod by 10 (which means the input is not a number), so it will return the error message.

print(b2d(1111))