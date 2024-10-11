import requests

filename = "https://s3-api.us-geo.objectstorage.softlayer.net/cf-courses-data/CognitiveClass/PY0101EN/Chapter%205/Labs/Golden_State.pkl"


def download(url, filename):
    response = requests.get(url)
    if response.status_code == 200:
        with open(filename, "wb") as f:
            f.write(response.content)


download(filename, "resources/Golden_State.pkl")


def requestToSomePage(pageUrl):
    r = requests.get(pageUrl)
    r.status_code: 200
    print("Result", r)
    pass

requestToSomePage('https://www.ibm.com')
