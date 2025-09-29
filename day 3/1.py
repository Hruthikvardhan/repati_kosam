
#Write a program to reverse a number entered by the user.
num = int(input("enter any number"))
rev = 0
temp = num

while num !=0 :
    digit = num%10
    rev = rev*10+digit
    num //=10
print(rev)
