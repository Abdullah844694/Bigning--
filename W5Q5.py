def frequency(text, word):
    text = text.lower()
    word = word.lower()
    
    arr = text.split()
    freq = 0
    
    for x in arr:
        if x==word:
            freq += 1
            
    return freq
    

text = input("Enter a string: ")
word = input("Enter a word to search: ")
        
print(f"\nFrequency of {word} in string = {frequency(text, word)}")
    