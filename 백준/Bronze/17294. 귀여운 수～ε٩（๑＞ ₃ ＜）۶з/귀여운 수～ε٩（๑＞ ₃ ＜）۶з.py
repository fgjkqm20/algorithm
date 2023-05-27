"""
수열
수 또는 다른 대상의 순서 있는 나열

등차수열
연속하는 두 항의 차이가 모두 일정한 수열

귀여운 수
수를 이루는 각 자릿수가 등차수열을 이루는 수

귀여운 수를 찾는 방법
1. 정수 k를 한 자리 수로 이루어진 수열로 본다.
2. 왼쪽에서 오른쪽으로 숫자가 
일정하게 커지거나 작아지는지 확인한다. 
"""

k = input()
k_length = len(k)

numList = []
for i in range(k_length):
    numList.append(int(k[i]))

def is_cute_number(numList):
    if k_length == 1:
        return True

    difference = numList[0] - numList[1]
    for i in range(1, k_length-1):
        if difference != numList[i] - numList[i+1]:
            return False
        
    return True

if is_cute_number(numList):
    print("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!")
else:
    print("흥칫뿡!! <(￣ ﹌ ￣)>")