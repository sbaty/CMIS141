import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.time.*;

/*Filename: TestCrime
*Author: Shafro Batyrov
*Date: 03.04.2018
*Purpose: Analyzing US Crime Data
*/
public class TestCrime {
     public static void main(String[] args) throws IOException {
         Instant start,stop; // create timers
         start = Instant.now();//start timer
         BufferedReader file;//create file
        
        if(args.length != 1) {// command line parameter catch
                System.err.println("\n\tError: Please incluce 1 command-line arguments" +
                "\n\n\tExample: Crime.csv");
                System.exit(1);
        }
        else{
            DecimalFormat df2 = new DecimalFormat(".##");//outputing doubles
            file = new BufferedReader(new FileReader(args[0]));//command line parameter         
            CrimeData CrimeData = new CrimeData();//declare CrimeData List
            Scanner Input = new Scanner(System.in);//declare Scanner        
            CrimeMenu Menu = new CrimeMenu();//declare menu
            
            CrimeData.setCrimeData(file);//create CrimeData with cmdline argument file
            System.out.println("Successfully Imported: "+ CrimeData.getLength() + " Rows of Data\n" );//verify data was imported
            
            //Create additonal Variables
            boolean flag = true;//for stopping the while loop
            int userChoice;//for handing user input choice
            
            System.out.println("********** Welcome to the US Crime Statistical Application **************************");
            while(flag == true){
                System.out.println(Menu.getMenu());//loops print menu
                userChoice = Input.nextInt();
                
                if(userChoice==0){ //checking for quit 
                    flag = false;
                    
                }
                if(userChoice==1)
                {
                    System.out.println("********** Population Growth **************************");
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//fomula for population growth
                        System.out.print(CrimeData.getYear(i) +"-"+CrimeData.getYear((i+1)) +": ");    
                        System.out.println( df2.format((CrimeData.getGrowth(i))) +"%");
                    }
                }
                if(userChoice==2){   
                    System.out.println("********** Highest Murder Rates **************************");
                    CrimeObject high = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for High Murder Rate
                        if((CrimeData.getObject(i).getMurderRate()) > (high.getMurderRate())){
                             high = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("High Murder Rate " + high.getYear() + " : " + df2.format(high.getMurderRate()) +"%") ;    
                }
                
                if(userChoice==3){   
                    System.out.println("********** Lowest Murder Rates **************************");
                    CrimeObject low = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for Lowest Murder Rates
                        if((CrimeData.getObject(i).getMurderRate()) < (low.getMurderRate())){
                             low = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("Low Murder Rate " + low.getYear() + " : " + df2.format(low.getMurderRate())+"%") ;    
                }
                if(userChoice==4){   
                    System.out.println("********** Highest Robbery Rates **************************");
                    CrimeObject high = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for Highest Robbery Rate
                        if((CrimeData.getObject(i).getRobberyRate()) > (high.getRobberyRate())){
                             high = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("High Robbery Rate " + high.getYear() + " : " + df2.format(high.getRobberyRate())+"%") ;    
                }
                
                
                if(userChoice==5){   
                    System.out.println("********** Lowset Robbery Rates **************************");
                    CrimeObject low = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for Lowest Robbery Rate
                        if((CrimeData.getObject(i).getRobberyRate()) < (low.getRobberyRate())){
                             low = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("Low Robbery Rate " + low.getYear() + " : " + df2.format(low.getRobberyRate())+"%") ;    
                }
                if(userChoice==6){   
                    System.out.println("********** Change in Vehicle Theft Rate **************************");
                        CrimeObject first = CrimeData.getObject(0);
                        CrimeObject second = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for change in Vechicle Theft
                        if((CrimeData.getObject(i).getYear())==(1998)){
                            first = CrimeData.getObject(i);
                        }
                        if((CrimeData.getObject(i).getYear())==(2012)){
                             second = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("Change in Vehicle Theft Rate from 1998 to 2012: " + (first.getVehicleTheftRate() - second.getVehicleTheftRate()+"%" ));    
                }
                if(userChoice==7){   
                    System.out.println("********** Highest Assault Rates **************************");
                    CrimeObject high = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for Highest in Assault Rates
                        if((CrimeData.getObject(i).getAssaultRate()) > (high.getAssaultRate())){
                             high = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("High Assault Rate " + high.getYear() + " : " + df2.format(high.getAssaultRate())+"%") ;    
                }
                
                if(userChoice==8){   
                    System.out.println("********** Lowset Assault Rates **************************");
                    CrimeObject low = CrimeData.getObject(0);
                    for(int i=0; i<(CrimeData.getLength()-1);i++){//equation for lowest Assault rate
                        if((CrimeData.getObject(i).getAssaultRate()) < (low.getAssaultRate())){
                             low = CrimeData.getObject(i);
                        }
                    }
                    System.out.println("Low Assault Rate " + low.getYear() + " : " + df2.format(low.getAssaultRate())+"%") ;    
                }
                
            }
        }
        stop = Instant.now();
        System.out.println("Thank you for trying the US Crimes Statistics Program");
        System.out.println("Elapsed time in seconds was: " + (Duration.between(start, stop).toMillis())/1000);//print durationg in seconds
    }
    
}