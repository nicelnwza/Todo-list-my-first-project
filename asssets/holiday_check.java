package asssets;

import java.util.Scanner;

public class holiday_check{
   time_update time_holiday = new time_update(0,"");
   list_todos list_of_var = new list_todos();
   public boolean holidaycheck= false;


 public holiday_check(boolean check){
    Scanner input = new Scanner(System.in);
    System.out.println("\n"+"Welcome to Todo list program"+"\n");
    int get_holiday = time_holiday.day;
    this.holidaycheck = check;

     if(get_holiday == 7 || get_holiday == 1 || list_of_var.holiday.size() != 0){
            
        holidaycheck = true;

     }else if(get_holiday != 7 || get_holiday != 1){
        if(holidaycheck == false){
        while(true){
            
            int choice;

            System.out.println("Please select your choice"+"\n");
            System.out.println("1:Enter Holiday if you have some then exit the program");
            System.out.println("2:Exit and Start Program");  
            choice = input.nextInt();
        
            if(choice == 1){
                System.out.println("Enter Yes if you have holiday");
                list_of_var.add_holiday();
                if(list_of_var.holiday.contains("No") || list_of_var.holiday.contains("no") || list_of_var.holiday.contains("NO")){
                    holidaycheck = false;
                    break;
                }else if(list_of_var.holiday.contains("Yes") || list_of_var.holiday.contains("yes") || list_of_var.holiday.contains("YES")){
                   holidaycheck = true; 
                   break;
                }else{
                    System.out.println("invalid var"+"\n");

                }
                
            }else if(choice == 2){
                System.out.println("you have exit program"+"\n");
                break;
            }else if(list_of_var.holiday.size() !=0){
                break;
            }else{
                System.out.println("Invalid value"+"\n");
            }
        }
        }
    }
    else{
        holidaycheck = false;
    }
    
    // System.out.println("holiday_check = "+holidaycheck); //check value holiday_check boolean
    input.close();
}

}