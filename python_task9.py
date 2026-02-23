number = 500
count = 0
for num in range(1,number):
    if(number % num == 0):
        count += 1
print("numbers that are divisors of 500 is ",count)
