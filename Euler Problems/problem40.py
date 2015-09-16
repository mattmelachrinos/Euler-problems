import timeit
start = timeit.default_timer()

string = ""
x = 1
while len(string) < 1000000:
	string += str(x)
	x+=1
print int(string [0]) * int(string[9]) * int(string[99]) * int(string[999]) * int(string[9999]) * int(string[99999]) * int(string[999999])

stop = timeit.default_timer()
print stop - start