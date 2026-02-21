import math
def eff_area(R,r):
    if (R<=0 or r<=0) or (R<r):
        return "Invalid input"
    area = math.pi*(R**2 -r**2)
    return round(area,2)
out_R = float(input("enter the outer radius : "))
inner_r = float(input("Enter the inneer radius : "))
result = eff_area(out_R,inner_r)
print("Effective area is : ", result)