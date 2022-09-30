import java.util.*;
public class Main {
    public static void main(String[] args) {
        int userinput = 1;
        int regorlog;
        String name,gender,phno,pass;
        int age;
        Scanner sc = new Scanner(System.in);
        List<register> Register = new ArrayList<>();
        System.err.println("WELCOME TO ATM");
        while (userinput == 1) {
            System.out.println("use ATM---->1");
            System.out.println("Quit---->2");
            userinput = sc.nextInt();
            if (userinput == 1) {
                System.out.println("Register--->1");
                System.out.println("Login------>2");
                regorlog = sc.nextInt();
                if (regorlog == 1) {
                    name=register.NAME();
                    age=register.AGE();
                    gender=register.Gender();
                    phno=register.PHNO(Register);
                    pass=register.PASS();
                    Register.add(new register(name,age,gender,phno,pass,0));
                    System.out.println("Registration Successful");
                }
                 else if (regorlog == 2) {
                     venkat.methode(Register);
                }
            }
        }
        if(userinput==2)
            System.out.println("HAVE A GOOD DAY");
    }
}
class register extends Main
{
    String name,gender,phno,pass;
    int age;

    Main ob=new Main();
    int acbalence;
    public static String PASS()
    {
        Scanner sc=new Scanner(System.in);
        String pass,pass1;
        System.out.println("Please enter ur password");
        pass=sc.nextLine();
        System.out.println("Please reenter the password");
        pass1=sc.nextLine();
        while(!(pass.equals(pass1)))
        {
            System.err.println("your password is not same first time u enter");
            System.out.println("Please reenter the password");
            pass1=sc.nextLine();
        }
        return pass;
    }
    public static String Gender()
    {
        String gender;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter ur gender(male or female)");
        gender=sc.nextLine();
        if(gender.equals("male")||gender.equals("female"))
            return gender;
        else {
            System.err.println("Please enter valid gender");
            gender=Gender();
            return gender;
        }

    }
    public static String PHNO(List<register> Register)
    {
        int C=1,C1=0;
        Scanner sc=new Scanner(System.in);
        String  phno;
        System.out.println("Please enter ur phone number must be 10 digits");
        phno=sc.nextLine();
        if((phno.length()==10))
            C1=1;
        if(C1==1)
        {
            for(register i:Register)
            {
                if((i.phno).equals(phno)) {
                    System.out.println("This ph number is already taken ");
                    C=0;
                    break;
                }

            }
        }
        if(C1==0||C==0)
        {
            phno=PHNO(Register);
        }

        return phno;
    }
    public static int AGE()
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Please enter ur age");
        System.out.println("your age is must be higher than 18");
        age=sc.nextInt();
        if(age>17)
            return age;
        else
        {
            System.err.println("sorry we could not create an account below 18");
            age=AGE();
            return age;
        }
    }
    public static String NAME()
    {
        String firstname;
        int FNC=0,LNC=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter ur name in only upper case without any special characters except space");
        firstname=sc.nextLine();

        for(char i:firstname.toCharArray())
        {
            if((i>=65&&i<=90)||i==' ')
            {
                FNC++;
            }
        }
        if(FNC==firstname.length())
            return firstname;
        else
        {
            System.err.println("Please enter valid name");
            firstname=NAME();
            return firstname;
        }

    }
    register(String name,int age,String gender,String phno,String pass,int acbalence)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phno=phno;
        this.pass=pass;
        this.acbalence=acbalence;
    }
}
class afterlogin
{

    public static void addmoney(register i)
    {
        Scanner sc=new Scanner(System.in);
        int amountadd;
        System.out.println("Your account balance is "+i.acbalence);
        System.out.println("Please enter amount you add");
        amountadd=sc.nextInt();
        i.acbalence+=amountadd;
        System.out.println("ur account balance is "+i.acbalence);
    }
    public static void withdraw(register i)
    {
        System.out.println("Please enter how much money u want");
        int WD;
        Scanner sc=new Scanner(System.in);
        WD=sc.nextInt();
        if(WD>i.acbalence)
            System.out.println("Your account balence is only "+i.acbalence);
        else {
            System.out.println("Withdraw successful");
            i.acbalence-=WD;
            System.out.println("Your current balance is after withdraw "+i.acbalence);
        }
    }
    public static void changepass(register i)
    {
        i.pass=register.PASS();
        System.out.println("The password is set Successfully");
    }
}
class venkat
{
    public static void methode(List<register> Register)
    {
        Scanner sc=new Scanner(System.in);
        String phno,pass;
        int count=0,UIafterlogin;
        System.out.println("Please enter ur phone number");
        phno = sc.nextLine();
        System.out.println("Please enter ur password");
        pass = sc.nextLine();
        count=loginpage(Register,phno,pass,count);
        if (count == 0) {
            System.out.println("Sorry we could not find ur account");
        }

    }
    public static int loginpage(List<register> Register, String phno, String pass, int count)
    {
        for (register i : Register) {
            if ((i.phno).equals(phno) && (i.pass).equals(pass)) {
                count=1;
                Scanner sc = new Scanner(System.in);
                int UIafterlogin=1;
                while(UIafterlogin!=5) {
                    System.out.println("if u want add money--->1");
                    System.out.println("if u want check balance--->2");
                    System.out.println("if u want withdraw money--->3");
                    System.out.println("if u want to change ur password--->4");
                    System.out.println("exit----->5");
                    UIafterlogin = sc.nextInt();
                    if(UIafterlogin<5) {
                        switch (UIafterlogin) {
                            case 1:
                                afterlogin.addmoney(i);
                                break;
                            case 2:
                                System.out.println("Your account Balance is " + i.acbalence);
                                break;
                            case 3:
                                afterlogin.withdraw(i);
                                break;
                            case 4:
                                afterlogin.changepass(i);
                                break;
                            default:
                                System.out.println("Sorry we could not help u");
                        }
                    }
                }
                break;
            }
        }

        return count;
    }
}



