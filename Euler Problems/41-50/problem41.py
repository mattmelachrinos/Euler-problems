n = 987654321
while n > 100000000:
	n -=2
	j = str(n)
	print n
	if '1' in j and '2' in j and '3' in j and '4' in j and '5' in j and '6' in j and '7' in j and '8' in j and '9' in j:
		x = 3
		prime = True
		while x * x <= n:
			if n % x == 0:
				prime = False
				break
			x+=1
		if prime == True:
			print n
			break