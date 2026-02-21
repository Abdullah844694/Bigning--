x = float(input("Enter value of x: "))
y = float(input("Enter value of y: "))

if x == 0 or y == 0:
    print("Undefined (division by zero)")
else:
    result = (1 + (x / y) + (x ** y)) / (2 + (y / x) + (y ** x))
    print("Result =", result)
