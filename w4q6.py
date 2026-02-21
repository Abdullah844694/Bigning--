def is_per(n):
    if n<=1:
        return "Not A Perfect number"
    div_sum=0
    for i in range(1,n):
        if n%i==0:
            div_sum+=i
    if div_sum==n:
        return "Perfect number"
    else:
        return "Not a perfect number"
num = int(input("Enter the number : "))
print(is_per(num))  