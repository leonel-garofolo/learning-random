album_ratings = [10, 9, 9, 19]
L = len(album_ratings)
print("len:", L)

S = sum(album_ratings)
print("sum:", S)

Sort = sorted(album_ratings)
print("Sort:", Sort)

album_ratings.sort()
print("array is sorted", album_ratings)

print("len+sum", len([sum([1, 1, 1])]))


def Mult(a, b):
    c = a * b
    return c


a = 5
b = 10
c = Mult(a, b)
print("Mult function", c)


def NotWork():
    print("Not work")
    pass


print(NotWork())


# Global Scope
def Thriller():
    Date = 1900
    return Date


Date = 2024
print("Thriller", Thriller())
print("Date", Date)


def ACDC(y):
    print("ACDC -> Rating input", Rating)
    return Rating + y


Rating = 9
Z = ACDC(1)
print(Rating)
