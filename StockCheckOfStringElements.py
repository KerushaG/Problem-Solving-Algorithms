#Introduction to Programming, Task 17.2
#Kerusha Govender (2019.05.08)
#Program that counts and displays the number of each particular letter in a string.

dictionary = {}
test_str = "google.com"
chars = len(test_str)
for i in range(0, chars):
    if test_str[i] in dictionary: #test_str[i] is essentially the key of the dictionary, and if it was already added from the else statement, its value is one
        old_value = dictionary[test_str[i]] #Because the same character occured in the string again I want to change the value of the character/key in the dictionary
        new_value = old_value + 1 #I captured the value in the old_count, to change it in the new count
        dictionary[test_str[i]] = new_value #I called the key and added the new value in the dictionary
        
    else:
        dictionary[test_str[i]] = 1 #if the character is not in the dictionary its added with a count of 1
    
print(dictionary)

random_dict = {}
string = input("Enter any word or sentence: ")
chars = len(string)
for i in range(0, chars):
    if string[i] in random_dict:
        old_value = random_dict[string[i]]
        new_value = old_value + 1
        random_dict[string[i]] = new_value
    else:
        random_dict[string[i]] = 1
print(random_dict)


#ORIGINAL CODE
#NOTE: I did know how to do this at all, online were a lot of different answers I used the one that was easiest, but not sure how it works, and below are all the things
#I tried... Please help.
#Daniel's Response:
#This task could also have  been solved by adding the characters and the count of the characters to a dictionary.
##(in the expected output, the curly braces indicate a dictionary {} ).
##The dictionary could have then been sorted in order to display the most frequent character to the least frequent character.
##This task is always tricky as dictionaries are not yet covered;
##from collections import Counter
##
##test_str = "google.com"
##
##k = Counter(test_str)
##
##print(str(k))
##
###OR
##
##from collections import Counter
##
##string = input("Enter any word or sentence: ")
##
##res = Counter(string)
##
##print(str(res))

#NOTES:
##string = "google.com"
##length = len(string)
##number = 0
##
##method = string.split()
##print(method)
##item = len(method)
##print(item)
##
##method1 = string.split('g')
##print(method1)
##item1 = len(method1)
##print(item1)
##G = item1 - item
##print(G)
##
##method2 = string.split('o')
##print(method2)
##item2 = len(method2)
##print(item2)
##O = item2 - item
##print(O)
##
##method3 = string.split('l')
##print(method3)
##item3 = len(method3)
##print(item3)
##L = item3 - item
##print(L)
##
##method4 = string.split('e')
##print(method4)
##item4 = len(method4)
##print(item4)
##E = item4 - item
##print(E)
##
##method5 = string.split('c')
##print(method5)
##item5 = len(method5)
##print(item5)
##C = item5 - item
##print(C)
##
##method6 = string.split('.')
##print(method6)
##item6 = len(method6)
##print(item6)
##Point = item6 - item
##print(Point)
##
##method7 = string.split('m')
##print(method7)
##item7 = len(method7)
##print(item7)
##M = item7 - item
####print(M)
####new = string.find('g')
####print(new)
####
####length1 = string[new+1:length]
####print(length1)
####
####new2 = length1.find('g')
####print(new2)
####
####length2 = length1[new2:length]
####print(length2)
##
###new = string.split('g')
###print(new)
####test = string.find('g')
####test2 = length - test + 1
####print(string[test2: length])
##      
####while 'g' in string:
####    if test >= 0:
####        G = string[test]
####        number += 1
####print(number)
##    
##    
##    
##    #print("this might work")
##
###for i in range(0, length):
##    
##
###if sample > 0:
###    g += 1
##
###print(g)

##word = "google.com"
##
##Alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
##
##for i in range(0, 26):
##    print(word.count(Alphabet[i]))

