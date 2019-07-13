#Introduction to Programming, Task 17.1
#Kerusha Govender, (2019.04.18)
#[A program that reads in a string and prints every first letter in lower case, and every second letter in lower case]

#So what I did here was first determine the length of the string, so I could use a for loop and use that length in the range. I had conditions, the first being to test
#if the range number was even. I basically wanted to capitalize every even number and lowercase every odd number. The for loop range allowed me to use each i as an
#index number to then convert that character to upper or lower and I used end="" to put it all on one line. 

string = input("Write any sentence or word: ")
length = len(string)
#print(length)

for i in range(0, length):
    if i%2 == 0:
        print(string[i].upper(), end="")
    else:
        print(string[i].lower(), end="")

#NOTES:      
###for i in range(0, length):
##L_0 = string[0]
##L_1 = string[1]
##L_2 = string[2]
##L_3 = string[3]
##L_4 = string[4]
##L_5 = string[5]
##L_6 = string[6]
##L_7 = string[7]
##L_8 = string[8]
##L_9 = string[9]
##L_10 = string[10]
##L_11 = string[11]
##L_12 = string[12]
##L_13 = string[13]
##L_14 = string[14]
##L_15 = string[15]
##
##print(L_0.upper() + L_1.lower() + L_2.upper() + L_3.lower() + L_4.upper() + L_5.lower() + L_6.upper() + L_7.lower() + L_8.upper()
##      + L_9.lower() + L_10.upper() + L_11.lower() + L_12.upper() + L_13.lower() + L_14.upper() + L_15.lower)
##    


##test = string[0:2]#, 4, 6, 8, 10, 12, 14, 16]
##test1 = string[1].lower()
##test2 = string[4 and 6].capitalize()
##print(test2)
##print(test + test1 + test2)
