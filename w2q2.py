def gcd(a, b):
    
    while b != 0:
        a, b = b, a % b
            
    return a

x = int(input("Enter first integer: "))
y = int(input("Enter second integer: "))
if (x<0 or y<0):
        print("invalid")
else:
    print("GCD of", x, "and", y, "is:", gcd(x, y))


