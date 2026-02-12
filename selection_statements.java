class SelectionStatements {
    public static void main(String[] args) {
        int age = 17;

    //if statement
        //syntax
        // if(condition) {
        //     block of code
        // }

        //the condition must be in boolean expression always 
        // No semicolen after if statement and the block of code must be in curly braces

        // if (age >= 18) {
        //     System.out.println("You are eligible to vote.");
        // } else { 
        //     System.out.println("You are not eligible to vote."); 
        // }

    //if else statements
        //syntax 
        // if(Bool condition){ 
        //     code 
        // }else{ 
        //     code 
        // }

        //check number odd or even
        int number = 10; 
        if (number % 2 == 0) { 
            System.out.println(number + " is an even number."); 
        } else { 
            System.out.println(number + " is an odd number.");
        }

        //check leaf year or not
        int year = 2023; 
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { 
            System.out.println(year + " is a leap year."); 
        } else { 
            System.out.println(year + " is not a leap year."); 
        }

        //else if statement
        //syntax 
        // if(condition){ 
        //     code
        // }else if(condition2){ 
        //     code
        // }else{ 
        //     code
        // }
        
        //student marks system
        int marks = 37; 
        if (marks >= 90) { 
            System.out.println("Grade: A"); 
        } else if (marks >= 70) { 
            System.out.println("Grade: B"); 
        } else if (marks >= 60) { 
            System.out.println("Grade: C"); 
        } else if (marks >= 35) { 
            System.out.println("Grade: D"); 
        } else { 
            System.out.println("You are Fail"); 
        }

        //given Number is positive, negative or zero
        int num = -5; 
        if (num > 0) { 
            System.out.println(num + " is a positive number."); 
        } else if (num < 0) { 
            System.out.println(num + " is a negative number."); 
        } else { 
            System.out.println(num + " is zero."); 
        }

        //if number is divisible by 3 and 5 then print FizzBuzz
        //if number is divisible by 3 then print Fizz
        //if number is divisible by 5 then print Buzz
        int number = 15; 
        if (number % 3 == 0 && number % 5 == 0) { 
            System.out.println("FizzBuzz"); 
        } else if (number % 3 == 0) { 
            System.out.println("Fizz"); 
        } else if (number % 5 == 0) { 
            System.out.println("Buzz"); 
        } else { 
            System.out.println(number); 
        }

        //this example for blood donation eligibility
        // int age = 25; 
        // if (age >= 18 && age <= 65) { 
        //     System.out.println("You are eligible to donate blood."); 
        // } else { 
        //     System.out.println("You are not eligible to donate blood."); 
        // }
    }
}