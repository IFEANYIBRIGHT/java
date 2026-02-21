for _ in range(1,101):
    print(_)

for _ in range(50,101):
    if(_ % 2 != 0):
        print("Odd number from 50 - 100 is ",_)

for _ in range(100,0,-1):
    print(_)


for _ in range(1,20):
   square = _ * _ 
print ("The squares of 1 - 20  = ",square) 

for _ in range(1,51,3):
    print (_)


for _ in range (1,101):
    if(_ % 3 == 0 and _ % 5 == 0 ):
        print(_)

numbers = 0   
for _ in range(1,101):
    if(_ % 7 == 0):
       numbers += 1
print("number divisible is ",numbers)

sums = 0
for _ in range (1,51):
    sums += _
print("The sum of first natural numbers is ",sums)

product = 0
for _ in range(11):
    product *= _
print("The product of ten natural numbers is ",product)


for _ in range(65,91):
    print(chr(_))

times = 0
multiplication_table = 6
for _ in range(13):
   times = multiplication_table * _
   print(f" {multiplication_table}  X  {_} =  ",times)


name = " Brightx"
for names in name:
    print(names)


count = 0
letters = " i love programming very very much"
for _ in letters:
    if _ == "e":
        count+= 1
print(" e appears ",count)



 
letters = " BRIGHTX"
for _ in letters: 
    print( _.lower(),end = " ")







 
letters = " brightx"
for _ in letters: 
    print( _.upper(),end = " ")


count = 0
vowels = "The quick brown fox jumps over the lazy dog. "
for _ in vowels :
    if _ == "a" or _  == " e" or  _ == "i" or _  == "o" or _  ==" u":
        count += 1
print(f"there are {count} vowels in {vowels}")



digits = 234567
digit =" "
for _ in range(digits):
    digit = str(_)
    length = len( digit)
print("The number of character in this string",length)



 

 

numbers = 765432
largest = 0 
digit = 0
for _ in str(numbers):
    digit = int(_)
    if(digit > largest):
        largest = digit
        print(" the largest is ",largest)




#
#numbers = 765432
#smallest = 9    
#for digit in str(numbers):
#    digit = int(digit)
#    
#    if digit < smallest:
#        smallest = digit
#
#print("The smallest digit is:", smallest)
#
#
#
#


























