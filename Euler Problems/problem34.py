num = 2540160
sum = 0
import math
while num > 0:
	num -=1
	print num
	strnum = str(num)
	lst = list(strnum)
	digits = 0
	for item in lst:
		digits += math.factorial(int(item))
	if digits == num:
		sum += num
print sum