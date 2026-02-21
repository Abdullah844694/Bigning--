def reverseWords(text):
    arr = text.split()
    size = len(arr)

    newarr = []
    for x in arr:
        newword = ""
        size = len(x)

        for i in range(size):
            newword += x[size-i-1]

        newarr.append(newword)
    
    newtxt = ""
    for y in newarr:
        newtxt += y + " "
    return newtxt


text = str(input("Enter a sentence: "))
text = reverseWords(text)
print(text)

