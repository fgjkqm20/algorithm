count = int(input())

quadrant = [0, 0, 0, 0, 0]

def where_quadrant(num1, num2):
    if num1==0 or num2==0:
        quadrant[4] += 1
        return

    if num1 > 0:
        quadrant[0 if num2 > 0 else 3] +=1
    else:
        quadrant[1 if num2 > 0 else 2] += 1

for i in range(count):
    num1, num2 = input().split()
    num1 = int(num1)
    num2 = int(num2)
    where_quadrant(num1, num2)

for i in range(4):
    print("Q%d" % (i+1) + ": %d" % quadrant[i])
print("AXIS: %d" % quadrant[4])