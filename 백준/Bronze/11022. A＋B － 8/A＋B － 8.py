count = input()
count = int(count)

result = []
for i in range(count):
    num1, num2 = input().split()
    result.append(num1)
    result.append(num2)
    
    num1 = int(num1)
    num2 = int(num2)
    
    result.append(str(num1+num2))

for i in range(count):
    str = "Case #%d" % (i+1) + ": "
    str += "%s" % result[i*3] + " + %s" % result[i*3+1]
    str += " = %s" % result[i*3+2]
    print(str)