def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

if gcd(x, y) == 1:
    print(x, "and", y, "are Relatively Prime numbers")
else:
    print(x, "and", y, "are not Relatively Prime numbers")
