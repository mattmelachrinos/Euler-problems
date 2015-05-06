x = 1
sum = 0
def one_digit_check(item):
	global sum
	if item == '1' or item =='2' or item =='6':
		sum += 3
	elif item == '3' or item =='7' or item == '8':
		sum += 5
	elif item =='4' or item =='5' or item =='9':
		sum += 4
	return
def two_digit_check(l):
	global sum
#	print l,  l[0],  l[1]
	if l[0] == '1':
		if l[1] == '0':
			sum+=3
		#	print l
		elif l[1] == '1' or l[1] == '2':
			sum+=6
		#	print l
		elif l[1] == '3' or l[1] == '4' or l[1] == '8' or l[1] == '9':
			sum+=8
		elif l[1] == '5' or l[1] == '6':
			sum+=7
		elif l[1] == '7':
			sum+=9
	elif l[0] == '0':
		one_digit_check(l[1])
	elif l[0] == '2' or l[0] == '3' or l[0] == '8' or l[0] == '9':
		sum+= 6
		one_digit_check(l[1])
	elif l[0] == '4' or l[0] == '5' or l[0] == '6':
		sum+= 5
		one_digit_check(l[1])
	elif l[0] == '7':
		sum+= 7
		one_digit_check(l[1])	
	return
def three_digit_check(l):
	global sum
	one_digit_check(l[0])
#	print l[1] , ' ' , l[2]
	if l[1] =='0' and l[2] == '0':
		sum +=7  #'hundred'
	else:
		sum += 10 #'hundred and'
		two_digit_check(l[1:])
#	print l, ' ' , l[1:]
	
#	print l[1:]
	return

while x < 1001:
	y = str(x)
	l = list(y)
	if len(l) ==1:
		one_digit_check(l[0])
	elif len(l) == 2:
		two_digit_check(l)
	elif len(l) == 3:
		three_digit_check(l)
	elif len(l) ==4:
		one_digit_check(l[0])
		sum += 8 #thousand
		#three_digit_check(l[1:3])
#	print x, ' array version: ', l[1:2]
	print x , sum
#	raw_input()
	x+=1
print sum