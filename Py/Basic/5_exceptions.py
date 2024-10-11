try:
    print("Try something")
    getfile = open("myuFile", "r")
    getfile.write("My file for exception handling.")
except IOError:
    print("Something was wrong")
except:
    print("Unknown the error")
