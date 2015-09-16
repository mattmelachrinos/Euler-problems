num = 2**1000
num = str(num)
#print num
i = 0
sum = 0
list = [num[i]]
while i<301:
	i = i+1
	list.append(num[i])
#print list
i = 0
while i<302:
	sum += int(list[i])
	i= i+1
print sum