import re

while True:
    try:
        replaced = input()
        replaceBy = input()
        data = input()

        regexTag = "<.*?>"
        matches = re.findall(regexTag, data)
        for match in matches:
            res = re.sub(replaced, replaceBy, match, flags=re.IGNORECASE)
            data = re.sub(match, res, data)
        print(data)
    except EOFError:
        break