import numpy as np

a = np.array([0, 1, 2, 3, 4])
print(a.size)
print(a.ndim)
# print(a.shape(10))

X = np.array([[1, 0, 1], [2, 2, 2]])

out = X[0:2, 2]
print(out)

X = np.array([[1, 0], [0, 1]])

Y = np.array([[2, 1], [1, 2]])

Z = np.dot(X, Y)
print("printZ", Z)
