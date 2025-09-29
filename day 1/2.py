#Write a program to find the largest of three numbers entered by the user.

num1 = int(input("enter 1 st num"))
num2 = int(input("enter 2 nd num"))
num3 = int(input("enter 3 rd num"))
if((num1 > num2) and  (num1 > num3)):  #gurthu pettukoo e and insted of "&"
    print("num 1 largest")
elif((num2 > num1) and (num2 > num3)):
    print("num 2 largest")
else :
    print("num 3 is largest")
