num1 = int(input("enter num1 :"))
num2 = int(input("enter num2 :"))
a = num1
b= num2

while(b!=0):
    temp =b
    b = a%b
    a=temp
print(a)