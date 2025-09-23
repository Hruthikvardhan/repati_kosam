num = int(input("Enter any number: "))
sum = 0
temp = num 
while num !=0:
    digit = num%10
    sum+=digit
    num /=10
print(sum)
