dict = {}
for a in range(2,101):
    for b in range(2,101):
        dict[a**b]=a**b
print len(dict)
