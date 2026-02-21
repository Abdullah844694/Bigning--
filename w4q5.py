def digit_sum(n):
    total = 0
    for dig in str(abs(int(n))):
        total+=int(dig)
    return total
num= input("Enter the integer : ")
result = digit_sum(num)
print(f"Sum of the digits is: {result}")
