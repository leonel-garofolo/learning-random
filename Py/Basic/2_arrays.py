tuple1=("disco", 10, 1.2, "hard rock", 10)
print("Array Slice", tuple1[0:3])

# Tuples: Inmutable

# Tuples: Nesting
NT = (1,2,("pop", "rock"), (3,4), ("disco", (1,2)))
print("Nuples : Nesting -> ", NT[2][1])

# List: are Mutable
List = ["Michael Jackson", 10.1, 1982]
print("List:", List[0])
concatenateList = List + ["City", "USA"]
print("concatenateList", concatenateList)
concatenateList.extend(["Other thing"])
print("Concatenate by extend function", concatenateList)
del(concatenateList[0])
print("delete first element", concatenateList)
concatenateList.insert(0, "Michael Jackson")
print("add Michael Jackson again in first element of array", concatenateList)
concatenateList.count(2)
# Copy and clone list
A = ["hard rock", 10, 1.2]
B = A
print('A:', A)
print('B:', B)
B=[1,2,[3,'a'],[4,'b']]
print(B[3][1])
A = [2, 3, 4, 5]

# Dictionaries
Dictionary = {"key1": 1, "key2":2}
print(Dictionary)
print("Exist key1 -> ", "key1" in Dictionary)


release_year_dict = {"Thriller": "1982", "Back in Black": "1980", \
                    "The Dark Side of the Moon": "1973", "The Bodyguard": "1992", \
                    "Bat Out of Hell": "1977", "Their Greatest Hits (1971-1975)": "1976", \
                    "Saturday Night Fever": "1977", "Rumours": "1977"}
print("Get value", release_year_dict["Thriller"])
del(release_year_dict["Back in Black"])
print("Exist 'Back in Black' after delete it -> ", "Back in Black" in release_year_dict)
ListKeys = list(release_year_dict.keys())
print("list with only keys", ListKeys)

# Sets
album_set_1 = {"AC/DC", "Back in Black", "Thriller", "Thriller"}
print("Sets list -> ", album_set_1)
album_set_2 = {"AC/DC", "Back in Black", "The Dark Side of the Moon"}
album_set_3 = album_set_1 & album_set_2
print("Interception between two sets -> ", album_set_3)
print("lenn", len(("disco",10,1.2, "hard rock",10)))
