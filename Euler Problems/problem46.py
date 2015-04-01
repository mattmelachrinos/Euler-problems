import math
primelist = []
flipper1 = True
x = 1.0
while flipper1:
	print x
	y = 2.0
	flipper2 = True
	while flipper2:
		if y > math.sqrt(x):
			primelist.append(x)
			flipper2 = False
		elif x%y == 0:
			for prime in primelist:
				num = x - prime
				i = 1
				j = 0
				while j <= num :
					j = 2 * i**2
					if j == num:
						break
					i +=1
				if j > num:
					flipper1 = False
					flipper2 = False
		y+=1
	x+=2
print x