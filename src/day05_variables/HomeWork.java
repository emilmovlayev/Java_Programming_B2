package day05_variables;

import java.sql.SQLOutput;

public class HomeWork {
    public static void main(String[] args) {
        String fname = "James";
        String sname = "Bond";
        char gender = 'M';
        byte age = 40;
        String comname = "MI16";
        boolean arethefulltime = true;
        String jobtitle = "Specialagent";
        int salary = 1000000;
        boolean aretheymarried = false;
        char suite = 'D';
        System.out.println("Firstname:" + fname + "\n" + "Surname: " + sname + "\n" + "Gender:" + gender +"\n"+ "Age:"+ age + "\n" + "Company name:" + comname + "\n" +
                "Fulltime:" + arethefulltime + "\n" + "Job:" + jobtitle + "\n" + "salary: " + salary + "\n" + "Married:" + aretheymarried + "\n" + "Suite:" + suite);
        System.out.println("Our employee is " + fname  +  sname + "\n"+ "He is " + age + " years old" + "\n" + comname + " is located in suite " + suite +
                "\n"+ " This years salary comes to "+ salary + "\n"+ "Other details:"+"\n"+ "Full time:" + arethefulltime + "\n"+ "Married: " + aretheymarried  );

        System.out.println();

        String carmodel = "BMW";
        String drivername = "Emil";
        String licensenum = "MassacES45";
        short speed = 320;
        boolean isautomatic = true;
        char licencec = 'A';
        System.out.println("My car is: "+ carmodel + "\n" +"Driver name is:"+ drivername + "\n"+
                "License num of the car is:" + licensenum + "\n" + "The speed of the car is: "+ speed+ "\n"+
                "Driving type is:"+ isautomatic + "\n"+ "License class is:"+ licencec);
        System.out.println();

        String ffname = "Elizabeth";
        String ssname = "Mell";
        String companyname = "Amazon";
        int ssalary = 100000;
        byte sday = 10;
        byte smonth = 10;
        int syear = 2020;
        boolean fulltime = true;
        String jjobtitle = "progremmer";
        String ofaddress = "BostonMA";

        String fullname = ffname +" "+ ssname;
        String fulldate = sday +"/"+ smonth +"/"+ "/"+syear;
        String email = fname + sday + "@" + companyname +".com";
        int Salaryafter3years = 100000 + 200000 + 200000;

        System.out.println("Full name:"+fullname+"\n"+"Start date:"+fulldate+"\n"+"Email:"+email+"\n"+
                Salaryafter3years);
        System.out.println();

       String name = "Medth";
       String genr = "Comedy";
       String duration = "1 hour";
       String releasedate ="10/10/2020";
       boolean sequels = true;
       byte rating =94;

        System.out.println("-----Welcome to the Cinema-----");
        System.out.println("Tonight we are streaming "+ name + " which was released on "+releasedate);
        System.out.println("This "+genr+ " movie got a rating "+rating + " out of 100 on MovieGap");
        System.out.println("Duration of the movie is "+ duration );


        System.out.println();
        int numchild =4;
        String partname ="Elizabeth";
        String location ="Los Angeles";
        String jjjobtitle ="Actor";

        System.out.println("You will be an "+jobtitle+" in Los angeles, married with "+partname+ " and have "+ numchild+ " children");

        System.out.println();

        String EmilMovlayev ;
        EmilMovlayev = "Emil Movlayev";
        System.out.println(EmilMovlayev);
        System.out.println();

          byte em = 5;
          double emm = 12.5;
          String emmm = "Java";
          System.out.println("It is in a line: \n" +em + "\n"+ emm + "\n"+ emmm );
          System.out.println();

          String brand ="Apple";
          String color = "Black";
          double price = 499.99;
          boolean waterResistant = true;
          boolean smart = true;
        System.out.println("Brand is the phone:"+brand);
        System.out.println("Color is the phone:"+color);
        System.out.println("Price is the phone:"+price);
        System.out.println("WaterResistant:"+waterResistant);
        System.out.println("Smart:"+smart);



    }
}

