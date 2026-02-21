import math 
def vol_sphere(radius):
    if radius <=0:
        return "invalid radius"
    volume = (4/3)*math.pi * (radius**3)
    return round(volume , 2)
r = float(input("enter the radius : "))
result = vol_sphere(r)
print("result is : ", result)
    