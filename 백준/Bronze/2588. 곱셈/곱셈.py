num1 = input()
num2 = input()

char_list = list(num2)
int_list = [ 
    int(char_list[0]), 
    int(char_list[1]), 
    int(char_list[2]) 
]

num1 = int(num1)
num2 = int(num2)

print(num1 * int_list[2])
print(num1 * int_list[1])
print(num1 * int_list[0])
print(num1 * num2)