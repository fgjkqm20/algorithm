N = int(input())

for i in range(1, N+1):
    star = "*" * (i)
    blank = " " * 2*(N-i)
    print("%s%s%s" % (star, blank, star))

for i in range(1, N):
    star = "*" * (N-i)
    blank = " " * 2*i
    print("%s%s%s" % (star, blank, star))