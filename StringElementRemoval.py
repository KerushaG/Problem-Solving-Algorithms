#Introduction to Programming, Task 17.4
#Kerusha Governder, (2019.05.08)
#[A program that asks the user to enter input and asks them what of that input they would like to strip, does so and displays the result]


user_input = input("Type any sentence: ")
to_remove = input("Now type the characters you would like to remove from that sentence with no commas, and a space in between: ") #so that I can split the characters so that it ends up in a list that I can call by index
remove_list = to_remove.split() #list of characters to remove
remove_item = len(remove_list) #count how many are in the list

for i in range(0, remove_item): #use above count to create a range in a for loop
    search = user_input.find(remove_list[i]) #this uses the find function to check if i, which I use as an index number to access the list of characters to remove, is in the user's input
    if search != -1: #if the search is -1 that means that particularly character is not a match in the user's input 
        user_input = user_input.replace(remove_list[i], "") #if there is a match with items in the remove list and the user's input I use the replace function to remove the character that i represents and replace it with an empty string

print(user_input) #print the new user's input

#############################
#NOTES
#So what I did is split the input from the variable which will store the characters that the user wants to remove, I said that they should not use a comma, so I would
#get a proper match later in the code
#The split input is stored as a list in a new variable and I counted the number of items in that list and stored it another variable, which I used for the range in a for
#loop.
#In the for loop I'm basically saying check for a certain index character from the list of characters to remove in the original input, if its there execute the statement
#which replaces that particular character with an empty string, the variable will then have a new value, which will be used in the for loop for the second iteration and so on
#So the for loop allows to check for each character represented in a split variable as a single item in a list, and the loop goes through that list assessing and
#editing the string
#Notes, testing stuff out
##user_input = "everyday hustle"
####info = user_input.find('h')
####if info > 0:
####    print(user_input.replace('h',''))
##
####instructions = 
####print(instructions)
##character = "a e w d"
##length = len(user_input)
#####print(length)
##char = len(character)
#####print(char[0])
####remove = len(char)
####print(remove)
##
##for i in range(0, length):
##    if character[i] == user_input[i]:
##        print(user_input.replace('[i]', ''))

    
##    for j in range(0, remove):
##        if remove[j] == i:
##            user_input.replace('')


##print(user_input.replace('e', '', 3))


##var1 = "the sky is cloudy"
##var2 = "y k i"
##var2_num = var2.split()
##print(var2_num)
##items = len(var2_num)
##print(var2_num[1])
##
##for var2_num[1] in var1:
##    var1 = var1.replace(var2_num[1], "")
##print(var1)
##            

##count ='mississippi'
##print(count.strip('p'))
##print(count.strip('s'))
##print(count.strip('i'))
##print(count.strip('mssi'))
