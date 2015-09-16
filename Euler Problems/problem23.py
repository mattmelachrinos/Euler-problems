import math
abundant_numbers = []
for i in range(1,28123):
    abund = 1
    for j in range(2,int(math.sqrt(i)+1)):
        if i % j== 0:
            abund += j
            if i/j != j:
                abund += i/j
    if abund > i:
        abundant_numbers.append(i)
sums = []
for number in abundant_numbers:
    for x in range( )
