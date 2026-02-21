n = int(input("Enter the numbers of integers you want : "))
choice = int(input("Enter your choice\n"
                   "1 for sum->\n"
                   "2 for product->\n"
                   "3 for average->\n"))
while choice < 1 or choice > 3:
    print("Incorrect Input Choice!!")
    choice = int(input(
        "Enter your choice again\n"
        "1 for sum->\n"
        "2 for product->\n"
        "3 for average->\n"
    ))
product = 1
sum=0
for i in range(n):
    x=int(input("enter the number : "))
    sum= sum + x
    product = product * x
if choice == 1:
    print(f"The sum is : {sum}")
elif choice == 2:
    print(f"The product is : {product}")
else:
    avg = sum/n
    print(f"the average is : {avg}")

    
    
