
numbers = 765432
smallest = 9    
for digit in str(numbers):
    digit = int(digit)
    
    if digit < smallest:
        smallest = digit

print("The smallest digit is:", smallest)








