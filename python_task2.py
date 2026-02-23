string_form = "34567"
result = ""
for _ in range(len(string_form)-1,-1,-1):
    result += string_form[_]
print(result)  
