numbers = []
sum = 0
import math
def findamicability(n):
	j=0
	for num in range(2,int(math.sqrt(n) + 1)):
		if n%num == 0:
			j+=num
			j+=(n/num)
	j +=1
	return j
for i in range(1,10000):
	if i not in numbers:
		j = findamicability(i)
		if i == findamicability(j) and i != j:
			sum += i + j
			numbers.append(j)
print sum