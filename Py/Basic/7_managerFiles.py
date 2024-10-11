def readAllFile():
    with open("resources/exampleFile.txt", "r") as fileExampleFile:
        file_stuff = fileExampleFile.read()
        print(file_stuff)
    print(fileExampleFile.close())


readAllFile()


def readLineByLine():
    with open("resources/exampleFile.txt", "r") as fileExampleFile:
        while True:
            file_stuff = fileExampleFile.readline()
            if not file_stuff:
                break
            print("line: ", file_stuff)

    fileExampleFile.close()


readLineByLine()


def writeInFile():
    with open("resources/writeFile.txt", "w") as fileExampleFile:
        fileExampleFile.write("I am writing something\n")
        fileExampleFile.write("Hello all\n")
    fileExampleFile.close()


writeInFile()
