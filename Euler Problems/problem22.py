alpha = {	'A':1,	'B':2,	'C':3,	'D':4,	'E':5,	'F':6,
			'G':7,	'H':8,	'I':9,	'J':10,	'K':11,	'L':12,
			'M':13,	'N':14,	'O':15,	'P':16,	'Q':17,	'R':18,
			'S':19,	'T':20,	'U':21,	'V':22,	'W':23,	'X':24,
			'Y':25,	'Z':26
		}
string = ''

with open('names.txt','r') as file:
	for text in file:
		names = text

names = names.split(',')
name_list = []
for name in names:
	name_list.append( name[1:-1])

name_list.sort()

answer = 0

for name in name_list:
	pts = 0
	i = 0
	while i < (len(name)):
		pts += alpha[name[i]]
		i+=1
	answer += (pts * (name_list.index(name) + 1))
print answer
