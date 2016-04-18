# JavaUtils

A small project to construct various small utilities to make your programming experience easier.

These utilities are nothing but just small java code so that you don't have to code it or so that it's easier for you to understand a particular concept.

Functions Built:

    1. toCameCase: Converts a String input to Camel Case. - Ver 1.2
    2. checkIfPalindrome: Checks if a given string is a palindrome or not. - Ver 1.0
    3. checkIfPalindromeIgnoreCase: Checks if a given string is a palindrome or not ignoring case. - Ver 1.0
    4. reverse: Reverses a given string, but does not deal with UTF-16 surrogate pairs. (reverse using n/2 time, using char array) - Ver 1.0
    5. reverseSafe: Reverses a given string, takes care of the UTF-16 surrogate pairs. (uses reverse of StringBuilder of java) - Ver 1.0

Library Built:

    #IO Library: To make your IO File operations easier.
        1. ReadFile: For your Input operation to a file.
            No need to know how to write too much code, just know the file name.
        2. WriteFile: For file output operations.
            No need to remember complex code for doing some basic write operations to a File.

Programs Included (will make UI for these soon and provide them as standalone):

    1. Mouse Move: This small program keeps moving your mouse pointer at definite intervals of time.
        This prevents the PC from shutting off the screen or from locking you out every 60sec..!
           * Why!?
           *      1. Because sometimes you work and some apps require you to keep the screen open for a session.
           *          What's better is .. You can custom set a timeout, and give a large time-out like 60sec and pixelMove as 1,
                        and this program will run in background without even being noticed.
           *      2. Or can be used as a 'Prank!'. Move the mouse fast enough and tell people it's a ghost in their machine...!

    2. Mad Mouse Clicker: A clicking app! Just makes a lot of clicks per second! You can control the time,hence the no of clicks.!
           * Why!?
           *      1. To test something (mouseClickListeners??) requiring a lot of clicks!
           *      2. To play the clicker games! (Well it's not cheating.. It's just insane no of clicks per sec! :p )
