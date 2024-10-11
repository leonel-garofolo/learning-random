number1 = 1
number2 = 7
if (number1 == 1) and (number2 == 7):
    print("It's correct")
else:
    print("It's wrong")

# for range
squares = ["red", "yellow", "green", "purple", "blue"]
for i in range(0, 5):
    squares[i] = "white"
print("squares", squares)

# for each
squares = ["red", "yellow", "green"]
for s in squares:
    print("squares for each:", s)
for i, square in enumerate(squares):
    print("squares for each:", i, square)

# Do - While
squares = ["orange", "orange", "red", "yellow", "green", "purple", "blue"]
NewSquares = []
i = 0
while (squares[i] == 'orange'):
    NewSquares.append(squares[i])
    i = i + 1
print("Newsquares:", NewSquares)
