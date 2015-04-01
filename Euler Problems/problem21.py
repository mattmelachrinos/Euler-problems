numbers = 0
n = 1
i = 0
j = 2
while n < 1002001:
	n += j
	numbers += n
	i+=1
	if i > 3:
		j +=2
		i = 0
		
print numbers