import pandas as pd


def writeDataToCSV():
    # Creating a DataFrame from a dictionary
    data = {'Name': ['Alice', 'Bob', 'Charlie', 'David'],
            'Age': [25, 30, 35, 28],
            'City': ['New York', 'San Francisco', 'Los Angeles', 'Chicago']}
    df = pd.DataFrame(data)
    print("writing file")
    df.to_csv('resources/data.csv', index=False)


writeDataToCSV()


def readDataFromCSV():
    csv_path = 'resources/data.csv'
    df = pd.read_csv(csv_path)
    print(df)


readDataFromCSV()
