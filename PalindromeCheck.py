#Introduction to Programming, Task 17.5
#Kerusha Govender (2019.04.19)
#[A program that checks if the word the user entered is a palindrome or not]

word = input("Enter a palindrome: ")
reverse_word = word[::-1]
#print(reverse_word)

if word == reverse_word:
    print("Your word is a palindrome.")

else:
    print("Your word is not a palindrome.")
