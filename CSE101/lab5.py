# Name: Inuk Baik
# SBUID: 112493042

# TODO: Print the following information
# Max element, Min element, Trace (only if 'm' is a square matrix)
# Do not modify the following nested for-loop
# Do not add other functions or loops
def print_matrix_info(m):
    max = m[0][0]
    min = m[0][0]
    trace = 0
    for i in range(len(m)):
        for j in range(len(m[i])):
            if m[i][j] > max:
                max = m[i][j]
            if m[i][j] < min:
                min = m[i][j]
    if len(m) == len(m[0]):
        for i in range(len(m)):
            trace += m[i][i]
    else: trace = None
    print("Trace: " + str(trace) + ", Max: " + str(max) + ", Min: " + str(min))

# TODO: Return the transposed matrix
def transpose(m):
    newList = []
    for i in range(len(m[0])):
        innerList = []
        for j in range(len(m)):
            innerList.append(m[j][i])
        newList.append(innerList)

    return newList


mtx = [[2, 3, 4], [0, 0, 0], [1, 2, 3], [5, 7, 1]]
print_matrix_info(mtx) # Trace should be None, Max is 7, Min is -1

print(transpose(mtx)) # [[2, 0, 1, 5], [3, 0, 2, 7], [4, 0, 3, -1]]
