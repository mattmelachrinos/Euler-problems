import math

numbers = []
with open("p099_base_exp.txt" ,'r') as f:
    i = 1
    for line in f:
        splitted_line = line.split(',')
        num1 = int(splitted_line[0])
        num2 = int(splitted_line[1])
        num =  num1**num2
        numbers.append(int(math.log10(num))+1)
        print i
        i += 1

x = max(numbers)
for item in numbers:
    if item == x:
        print numbers.index(item)
