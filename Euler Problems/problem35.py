count = 0
circular_primes = []
import math
def is_prime(number):
	for i in range(2,int((math.sqrt(number)+1))):
		if number % i == 0:
			return False
			break
	return True
def rotate(number):
	number = str(number)
	j = number[0]
	number = number[1:]
	number +=j
	number = int(number)
	return number
for i in xrange(1,1000000,2):
	num = i
	prime = True
#	print "------------------------------"
	while prime:
	#	print num
		prime = is_prime(num)
		if len(str(num)) == len(str(i)):
			num = rotate(num)
		else:
			break
	#	print num
		if num == i and prime:
			count +=1
			circular_primes.append(i)
			break
print count
print circular_primes