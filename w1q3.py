num = int(input("Enter an integer: "))

temp = num
digits = len(str(num))
sum_armstrong = 0

while temp > 0:
    digit = temp % 10
    sum_armstrong += digit ** digits
    temp //= 10

if sum_armstrong == num:
    print(num, "is an Armstrong Number")
else:
    print(num, "is not an Armstrong Number")
