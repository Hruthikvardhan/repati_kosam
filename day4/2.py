# Program to count the number of vowels in a given string

str_inp = input("Enter any string to check vowels count: ")
count = 0

# Convert to lowercase to handle both cases
str_inp = str_inp.lower()

for ch in str_inp:
    if ch in "aeiou":
        count += 1

print("Number of vowels:", count)