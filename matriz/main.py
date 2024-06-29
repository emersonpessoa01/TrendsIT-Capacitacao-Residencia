# M = [
#     [10, 2],
#     [21, 13],
#     [7, 9]
# ]
# print(M)

# Convertendo matriz para lista
L1 = [10, 2]
L2 = [21, 13]
L3 = [7, 9]

M = [L1]

M.append(L2)

M.insert(2,L3)
print(M)