def avg_marks():
    marks = []
    print("enter the five marks ")
    for i in range(5):
        x = float(input(f"Marks {i+1} "))
        marks.append(x)
    avg = sum(marks)/5
    return avg
def cel_to_fer():
    c = float(input("enter the temperature in Celsius : "))
    f = (c*1.8)+32
    return f
def per():
    l = float(input("enter the length of rectangle board : "))
    b = float(input("enter the breadth of ractangle board : "))
    if l<=0 or b<=0:
        return "Length and Breadth should be positive"
    return 2*(l + b)
print("average marks are : " , avg_marks())
print("temperature in Farenhite : ", cel_to_fer())
print("The Permiter is : ", per())

    