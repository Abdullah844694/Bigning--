l = float(input("Enter the length of cuboid : "))
while l<= 0:
    l = float(input("Enter the length of cuboid : "))
b = float(input("Enter the breadth of cuboid : "))
while b<=0:
    b = float(input("Enter the breadth of cuboid : "))
h = float(input("Enter the height of cuboid : "))
while h<=0:
    h = float(input("Enter the height of cuboid : "))
choice = int(input("Enter you choice->\n"
                   "1 for surface area->\n"
                   "2 for volume->\n"
                   "3 for both->\n"))
while choice < 1 or choice >3 :
    print("Incorrect choice!! , Please enter again")
    choice = int(input("Enter you choice->\n"
                   "1 for surface area->\n"
                   "2 for volume->\n"
                   "3 for both->\n"))
SA = 2*(l*b + b*h + l*h)
Vol = l*b*h
if choice == 1:
    print(f"The surface area is : {SA: .2f} ")
elif choice == 2:
    print(f"The volume is : {Vol: .2f} ")
else: 
    print(f"Surface area is: {SA: .2f}\n"
          f"Volume is : {Vol: .2f}\n ")
    
    