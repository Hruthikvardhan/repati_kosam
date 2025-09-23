# Write a program to check whether a given number is prime or not
num = int(input("enter any num"))
is_prime =True

if num <=1:
    is_prime=False
else:
    for i in range(2,num):
        if num%i==0:
            is_prime=False
            break
if is_prime:
    print("prime num")
else :
    print("not a prime num")
