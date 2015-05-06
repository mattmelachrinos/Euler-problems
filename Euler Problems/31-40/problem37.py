import math
string = "1234"
print string[1]
def primechecker(num):
	j = 2
	while True:
		if num % j == 0:
			return False
		else if j >= math.sqrt(i):
			return True
		j+=1
		
def truncchecker(num):
	num = str(num)
	for x in (1, len(num)):
		j = num[:x]
		primechecker(int(j))
	for x in (-1, -len(num)):
		
		
i = 11
num_of_trunc_primes = 0
while num_of_trunc_primes < 11:
	i+=2
	if primechecker(i) :
		if truncchecker(i) :
		num_of_trunc_primes +=1
		# save number
