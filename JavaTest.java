package BioData;

import com.sun.org.apache.bcel.internal.classfile.JavaClass;

public class JavaTest {
    //static or class variable,
    static  String  address1 = "9 park Road";
    static  String  address2 =  "Maruti Nagar";
    static  String  address3 =  "London";
    static  String  address4 =  "UB5 8RS";

    //static or class variable,
    static String phone= "+44 789 9999";

    //instance variables
    String sex;

    //constant variables
    static final String DOB = "01/05/1980";
    //static or class variables
    static String maritalStatus = "Married";

    //static or class variables
    static  String  qualification1 = "BCA";
    static  String  qualification2 =  "MCA";

    public static void main (String[] args){
        //Drawing boarder line of the page (header) and left ,right border lines
        System.out.println("------------------------------------------------------------");
        System.out.println("|                                                          |");
        String cvTitle = "bio-data";
        System.out.println("\t\t\t\t\t\t\t\t\t"+"BIO-DATA");
        System.out.println("------------------------------------------------------------");
        //local variables are inside the method.
        String firstName = "John";
        String lastName =   "Miller";
        System.out.println("|Name\t\t\t:\t\t"+firstName+" "+lastName+"\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");


        //printing static variable's value
        System.out.println("|Address\t\t:\t\t"+address1+"\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t"+ JavaTest.address2+"\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t"+ JavaTest.address3+"\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t"+ JavaTest.address4+"\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //local variable are inside method.
        String email = "abc@gmail.com";
        System.out.println("|E-mail\t\t\t:\t\t"+email+"\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //printing static variable's value

        System.out.println("|Phone\t\t\t:\t\t"+phone+"\t\t\t\t\t\t|");
        System.out.println("|                                                           |");

        JavaTest obj = new JavaTest();
        obj.sex= "male";


        //instance variable assigning some value.

        System.out.println("|sex\t\t\t:\t\t"+obj.sex+"\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //Local variable
        String height = "5\'1\" ";
        System.out.println("|Height\t\t\t:\t\t"+height+"\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //Local variables
        String sex = "male";
        System.out.println("|sex\t\t\t:\t\t"+sex+"\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        // constant variable print.
        System.out.println("|DOB\t\t\t:\t\t"+DOB+"\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");

        //printing static variable's value
        System.out.println("|Marital Status\t:\t\t"+maritalStatus+"\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //printing static variable's value
        System.out.println("|Qualification\t:\t\t"+qualification1+"\t\t\t\t\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t"+ JavaTest.qualification2+"\t\t\t\t\t\t\t\t\t|");
        System.out.println("|                                                           |");
        //Local variable
        String profession = "Q.A.";
        System.out.println("|profession\t\t:\t\t"+profession+"\t\t\t\t\t\t\t\t|");

        System.out.println("|-----------------------------------------------------------|");
    }
}
