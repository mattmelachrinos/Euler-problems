tri_num = 6.0
n_t = 286
pent_num = 2.0
n_p = 165
hex_num = 4.0
n_h = 143
def tri():
	global n_t
	global tri_num
	n_t += 1
	tri_num = (n_t*(n_t + 1)) / 2
def pent():
	global n_p
	global pent_num
	n_p += 1
	pent_num = (n_p * (3*n_p - 1) ) / 2
def hex():
	global n_h
	global hex_num
	n_h +=1
	hex_num = n_h * (2 * n_h - 1)
	


while tri_num != pent_num or tri_num != hex_num:
	if tri_num < pent_num or tri_num < hex_num:
		tri()
	if pent_num < tri_num or pent_num < hex_num:
		pent()
	if hex_num < tri_num or hex_num < pent_num:
		hex()
	print 'tri : ' , tri_num , ' pent : ' , pent_num , ' hex : ' , hex_num
print tri_num