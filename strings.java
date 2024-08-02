//Strings are immutable
public class strings{
    public static void main(String [] args){
        //1st way of declaring strings
        String firstName = "Abdullah";
       
        //2nd way 
        new String("abdullah");

        //concatination of Strings
        String fullName = firstName + " " + new String("khan");
        System.out.println("fullName is "+fullName);
         
        //findind length of a string
        System.out.println("lenth of full name is "+fullName.length());

        //for printing every character 1 by 1 we use java's built in function named charAt
        for(int i =0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //comparing strings
        if(firstName.compareTo(fullName)==0){
        System.out.println("Strings are equal");}
        else
        System.out.println("Strings are not equal");
        
        //substring is used to obtain a part from a string
        String name = fullName.substring(0,8);
        System.out.println(name);

        //another substring till end of string
        String lastName = fullName.substring(9);
        System.out.println(lastName);
        }


    }
