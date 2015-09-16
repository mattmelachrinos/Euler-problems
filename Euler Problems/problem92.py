import time
start_time = time.time()
count = 0
for i in range (1,10000000):
	number = i
	while number != 1 and number !=89:
		numlist = []
		if number in one_list:
			break
		for item in str(number):
			numlist.append(int(item)**2)
		number = 0
		for item in numlist:
			number +=item
	if number == 89:
		count +=1
print count
print("----- %s seconds -----" % (time.time() - start_time))