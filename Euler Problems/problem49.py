import math
primelist = []
x = 1001
while x < 10000:
	y = 2
	while x%y != 0:
		if y > math.sqrt(x):
			primelist.append(x)
			break
		y+=1
	x+=2
primelist = [str(item) for item in primelist]
#map(str, primelist)
for item in primelist:
	print item
