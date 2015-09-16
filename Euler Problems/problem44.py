
pent_num = []
n = 1

def pent():
	global n
	global pent_num
	n += 1
	pent_num.extend( [(n * (3*n - 1) ) / 2])


while n < 1000:
	pent()

print pent_num