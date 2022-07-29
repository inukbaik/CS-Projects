lst = [1, 2, 3]
def get_at(lst, index):
    if len(lst) == 0:
        return None
    if index < 0 or index >= len(lst):
        return None
    return lst[index]

print(get_at(lst, 1))