def bj(num, m, cards):
    if len(cards) != num:
        return False
    else:
        sum = []
        for i in cards:
            for j in cards:
                for k in cards:
                    if i == j or i == k or j == k:
                        continue
                    else:
                        sum.append(i + j + k)
        jack = 0
        for a in sum:
            if m - a < m - jack and a <= m:
                jack = a
    return jack
            
num, m = map(int, input().split())
cards = list(map(int, input().split()))
print(bj(num, m, cards))
