def count_let(s):
    up_case_ct =0
    lw_case_ct = 0
    for ch in s:
        if ch.isupper():
            up_case_ct+=1
        elif ch.islower():
            lw_case_ct+=1
    return up_case_ct, lw_case_ct
word = input("Enter the word : ")
u,l = count_let(word)
print(f"Upper case count: {u} , Lower case count: {l}")
    