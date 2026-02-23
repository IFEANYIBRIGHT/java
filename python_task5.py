<<<<<<< HEAD
for _ in range(1,51,3):
    print (_)
=======
string_words = "Find the position of the first vowel in a string."
position = 0
new_position =0
for letter in range(len(string_words)):
    position = string_words[letter]
    if(position == "A" or position == " a" or position == "E" or position == "e" or position == "i" or position == "I" or position == "O" or position == "o" or position == "U" or position == "u"):
        new_position = letter
        print(new_position)
        break
>>>>>>> 8941580be15db230189164daf2ccc23539d58232
