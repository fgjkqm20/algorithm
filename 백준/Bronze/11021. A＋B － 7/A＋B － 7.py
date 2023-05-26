count = input()
count = int(count)

sumArr = []
for i in range(count):
    num1, num2 = input().split()
    num1 = int(num1)
    num2 = int(num2)
    sumArr.append(num1 + num2)

for i in range(count):
    print("Case #%d: %d" % (i+1, sumArr[i]))
