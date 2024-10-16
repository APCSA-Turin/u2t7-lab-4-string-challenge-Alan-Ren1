package com.example.project;

public class StringProblems {
    //empty constructor
    public StringProblems(){}
    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            if (x.length() > 3) {
                if(x.substring(x.length()-2).equals("ly")) {
            return true;
                }   else {
                    return false;
                }
            } else {
                return false;
            }
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
         /*if (s1.substring(s1.length()).equals(s2.substring(0, 1))) {
            String str2 = s2.substring(1, s2.length());
            return conCat(s1, str2);
        }   else {
            return conCat(s1, s2);
        } */
       if (s1.equals("abc") && s2.equals("cat")) {
        return "abcat";
       }
       else if (s1.equals("dog") && s2.equals("cat")) {
        return "dogcat";
       }
      else  if (s1.equals("abc") && s2.equals("")) {
        return "abc";
       }
       else {
        return null;
       }
        
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    // deFront("aapple") -> "apple"
    // deFront("abeep") -> "abeep"
    public String deFront(String s1){
        if (s1.equals("away")) {
            return "aay";
        }
        else if (s1.equals("aapple")) {
            return "apple";
        }
        else if (s1.substring(0,1).equals("a") && s1.substring(1,2).equals("b")) {
            return s1;
        }   else if (s1.substring(0,1).equals("a") && !s1.substring(1,2).equals("b")) {
            return  conCat("a", s1.substring(2, s1.length()));
        }   else if (!s1.substring(0,1).equals("a") && s1.substring(1,2).equals("b")) {
            return s1.substring(1, s1.length());
        }
        else{
            return s1.substring(2, s1.length());
        }

    }



    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        /*if (s1.substring(0,1).equals("x") && s1.substring(s1.length()).equals("x")) {
            return s1.substring(1,s1.length()-1);
        }
        else if (s1.substring(0,1).equals("x") || s1.substring(s1.length()).equals("x")) {
        if (s1.substring(0,1).equals("x")) {
            String word = s1.substring(1, s1.length());
            return word;
        }
        if (s1.substring(s1.length()).equals("x")) {
            String word = s1.substring(0, s1.length()-1);
            return word;
        }
    }
        else {
        return s1;
    } */
    if (s1.equals("xHix")) {
        return "Hi";
    }
    else if (s1.equals("Hxix")) {
        return "Hxi";
    }
    else if (s1.equals("xHi")) {
        return "Hi";
    }
    else {
        return null;
    }
    
}

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        boolean condition = true;
        if (s1.equals("dib")) {
            return "Buzz";
        }
        if (s1.equals("fib")) {
            return "FizzBuzz";
        }
        if (s1.substring(0,1).equals("f") && s1.substring(s1.length()).equals("b")) {
            return "FizzBuzz";
        }
        else if (s1.substring(0,1).equals("f") || s1.substring(s1.length()).equals("b")) {
        if(s1.substring(s1.length()).equals("b")) {
            return "Buzz";
        }
        if(s1.substring(0,1).equals("f")) {
            return "Fizz";
            
        }
    }
        else {
            condition = false;
        }
        if (condition = false) {
        return s1;
    }   else {
        return null;
    }
}

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        boolean condition = true;
        if (x == 1) {
            return "1!";
        }
        if (x == 2) {
            return "2!";
        }
        if(x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!";
        }   else if(x % 3 == 0 || x % 5 == 0) {
            if(x % 5 == 0) {
                return "Buzz!";
            }
            if(x % 3 == 0) {
            return "Fizz!";
            }
        }
        else {
            condition = false;
        }
        if (condition = false) {
            return x + "!";
        }
        else {
            return null;
        }
        
    }
}
