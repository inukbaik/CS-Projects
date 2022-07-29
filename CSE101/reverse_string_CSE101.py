def rev(n):
    if len(n) <= 1:
        return n #base case
    return n[-1] + rev(n[:-1])

print(rev('stony'))