def swap_xor(a, b):
    a = a ^ b
    b = a ^ b
    a = a ^ b
    return a, b

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))

x, y = swap_xor(x, y)

print("After swapping:")
print("x =", x)
print("y =", y)
