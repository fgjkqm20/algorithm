bowl = input()

upward = True
bowl_height = 10

if bowl[0] == ')':
    upward = False

for i in range(1, len(bowl)):
    if bowl[i] == '(':
        bowl_height += 5 if upward else 10
        upward = True
    else:
        bowl_height += 10 if upward else 5
        upward = False

print(bowl_height)