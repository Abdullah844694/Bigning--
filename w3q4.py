a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

while b != 0:
    sum = a ^ b         
    carry = (a & b) << 1 
    a = sum
    b = carry

print("Sum =", a)
