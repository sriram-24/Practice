a=0
b=1
c=int(input("enter a number"))
d=[]
d.append(a)
d.append(b)
for i in range(c):
    d=a+b
    
    a=b
    b=d
print(d)
