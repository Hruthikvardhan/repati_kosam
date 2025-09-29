num = int(input("enter any number to check fibbnoccic"))
print("fibnoccic")

a,b =0,1
for i in range(num):
    print(a,end="")
    next = a+b
    a=b=next

