import java.util.Scanner;
public class Task01 {
    public static boolean tempChecker(String temp){ 
    int count=0;
    for(int i=0; i<temp.length(); i++){
    char eachLetter=temp.charAt(i);
    if(Character.isDigit(eachLetter)==true)
    count++; 
    }
    return(count==temp.length());
    }
   public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.print("Welcome to the temperature conversion program\nPlease choose your procedure: \n");
    boolean continuation=true;
    while(continuation){
    System.out.println("1. Celsius to Fahrenheit and Kelvin");
    System.out.println("2. Kelvin to Fahrenheit and Celsius");
    System.out.println("3. Fahrenheit to Celsius and Kelvin");
    System.out.println("4. Exit program");
    System.out.print("Please enter a number based on your choice: ");
    char choice=input.next().charAt(0);
    while(Character.isDigit(choice)==false){
        System.out.print("Your choice should be a number. Enter a new one: ");
        choice=input.next().charAt(0);
    }
    while(choice!='1'&&choice!='2'&&choice!='3'&&choice!='4'){
        System.out.print("Invalid choice entered. Enter a new one: ");
        choice=input.next().charAt(0);
    }
    switch(choice){
        case '1':
            System.out.print("Please enter the temprature: ");
            String temp=input.next();
            while(tempChecker(temp)==false){
            System.out.print("Enter a valid number: ");
            temp=input.next();
            }
            double temperature=Double.parseDouble(temp);
            double tF=(9.0/5)*temperature+32;
            double tK=temperature+273;
            System.out.println("Temperature in Fahrenheit is: "+tF+"\nTemperature in Kelvin is: "+tK+"\n");  
            break;
        case '2':
            System.out.print("Please enter the temprature: ");
            temp=input.next();
            while(tempChecker(temp)==false){
            System.out.print("Enter a valid number: ");
            temp=input.next();
            }
            temperature=Double.parseDouble(temp);
            double tC=temperature-273;
            tF=(9.0/5)*tC+32;
            System.out.println("Temperature in Fahrenheit is: "+tF+"\nTemperature in Celsius is: "+tC+"\n");  
            break;
        case '3':
            System.out.print("Please enter the temprature: ");
            temp=input.next();
            while(tempChecker(temp)==false){
            System.out.print("Enter a valid number: ");
            temp=input.next();
            }
            temperature=Double.parseDouble(temp);
            tC=(5.0/9)*(temperature-32);
            tK=tC+273;
            System.out.println("Temperature in Celsius is: "+tC+"\nTemperature in Kelvin is: "+tK+"\n");  
            break;
        default:
        continuation=false;
            System.out.print("Thank you!");
            System.exit(0);    
    }
    } 
   }
}
