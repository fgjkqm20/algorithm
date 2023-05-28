"""
1. 최고 점수 M를 찾는다.
2. 기존 점수들을 점수/M*100로 바꾼다. 
3. 바꾼 점수들의 평균을 구한다. 
"""

# 시험 본 과목의 개수 N를 입력 받는다.
N = int(input())

old_scores = input().split(" ")

M = 0
for i in range(N):
    old_scores[i] = int(old_scores[i])
    if old_scores[i] > M:
        M = old_scores[i]

sum_new_scores = 0
for i in range(N):
    sum_new_scores += old_scores[i] / M*100

print(sum_new_scores / N)