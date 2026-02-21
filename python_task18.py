
numbers = 765432
largest = 0 
digit = 0
for _ in str(numbers):
    digit = int(_)
    if(digit > largest):
        largest = digit
        print(" the largest is ",largest)

