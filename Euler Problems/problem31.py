coins = [200,100,50,20,10,5,2,1]
count = 0
def checker (number):
    i=0
    while number !> coins [i]:
        i+=1


    if number == 200:
        count += 1
        break
    elif number >200:
        break

for item in coins:
    checker(item)
