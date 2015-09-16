def checkIfPandigital(num):
#	print "checkIfPandigital"
	num = str(num)
	beg = num[:9]
	k = 0
	if '1' in beg and '2' in beg and '3' in beg and '4' in beg and '5' in beg and '6' in beg and '7' in beg and '8' in beg and '9' in beg:
		k +=1
	end = num[-9:]
	if '1' in end and '2' in end and '3' in end and '4' in end and '5' in end and '6' in end and '7' in end and '8' in end and '9' in end:
		k+=1
	return k
a = 1
b = 1
n = 3
flipper = True
l = 0
while True:
	l=0
	if flipper:
		a +=b
		if n :
			l = checkIfPandigital(a)
		flipper = False
	else:
		b+=a
		if n :
			l = checkIfPandigital(b)
		flipper = True
	if l ==2:
		if flipper:
			print n
			print b
		else: 
			print n
			print a
		break
	print n, l
	n+=1