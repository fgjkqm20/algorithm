count = int(input())

def calculate(num, operators):
    for operator in operators:
        if operator == '@':
            num *= 3
        elif operator == '%':
            num += 5
        elif operator == '#':
            num -= 7
    return num

results = []
for i in range(count):
    math_expression = input().split()

    num = float(math_expression[0])
    operators = math_expression[1:]
    results.append(calculate(num, operators))

for i in range(count):
    print("%.2f" % results[i])