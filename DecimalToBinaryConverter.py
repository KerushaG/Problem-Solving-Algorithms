#Introduction to Programming, Task 23
#Kerusha Govender, 2019.05.06
#Program that converts decimal to binary number

#I first use len to count how many digits there are in the user's input, so that I can use that number to create a range in a for loop
#I used list comprehension to cast each number to an int and put it in a list, so that I can work with it
#I then used the reverse method to reverse the order of the list. When converting binary to decimal, they start with 2**0 at the last digit, so reversing the
#order and using that in the for loop made it easier to work with, because the range can move from 0-the length of the list
#I put the for loop in a function. The for loop checks the value that i would represent as an index of the list, and I used an if statement to say if that value
#called by the index is = 1, then i from the range must be used for 2**i and stored in a variable that will add all the calculations for every 1 that exists in the list

def bin2num(binary, user_length):
    number = 0
    for i in range(0, user_length):
        check1 = binary[i]
        if check1 == 1:
            twoPow = 2**i
            number += twoPow
    return(number)

user = input("Enter a binary number: ")
user_length = len(user)
binary = [int(element) for element in user]
binary.reverse()
print(bin2num(binary, user_length))
