""" MysteryProgram.py"""


def MysteryProgram():
    """ Here i have put the program in its own function
        This could have just been in the def main(): function
        and did not need to be here.

        @param a : integer value
        @param b : integer value 
        @param c : integer value

        """
    
    
    a = 1680 # assign the value of 1680 to the variable a
    b = a /2; # This is not used???
    c = 1 # assign the value of 1 to the variable c

    #run while a/c is equal to or greater than c
    while(c <= (a/c)):

        if a%c == 0: # if a remainder c (a%c) == 0 then do print command
            print(c,"x",(a/c),"=",a) # Display message to console
        
        c = c +  1;  # increment c
    

def main():
    """ Main program calls function MysteryProgram()"""
    
    MysteryProgram()

if __name__ == '__main__':
    """ call main() to start program running"""
    main()
