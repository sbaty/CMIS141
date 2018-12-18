
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*Filename: CrimeObject
*Author: Shafro Batyrov
*Date: 03.04.2018
*Purpose: Analyzing US Crime Data
*/
public class CrimeObject {
    //Fields         
    private short Year;
    private int Population;
    private int ViolentCrime;
    private double ViolentRate;
    private int Murder;
    private double MurderRate;
    private int Rape;
    private double RapeRate;
    private int Robbery;
    private double RobberyRate;
    private int Assault;
    private double AssaultRate;
    private int PropertyCrime;
    private double PropertyCrimeRate;
    private int Burglary;
    private double BurglaryRate;
    private int Larceny;
    private double LarcenyRate;
    private int VehicleTheft;
    private double VehicleTheftRate;

    public CrimeObject (short Year, int Population,
            int ViolentCrime, double ViolentRate, 
            int Murder,double MurderRate, 
            int Rape, double RapeRate, 
            int Robbery,double RobberyRate,
            int Assault, double AssaultRate,
            int PropertyCrime, double PropertyCrimeRate,
            int Burglary, double BurglaryRate,
            int Larceny,double LarcenyRate,
            int VehicleTheft, double VehicleTheftRate){
        
        this.Year= Year;
        this.Population = Population;
        this.ViolentCrime = ViolentCrime;
        this.ViolentRate = ViolentRate;
        this.Murder = Murder;
        this.MurderRate = MurderRate;
        this.Rape = Rape;
        this.RapeRate = RapeRate;
        this.Robbery = Robbery;
        this.RobberyRate = RobberyRate;
        this.Assault = Assault;
        this.AssaultRate = AssaultRate;
        this.PropertyCrime = PropertyCrime;
        this.PropertyCrimeRate = PropertyCrimeRate;
        this.Burglary = Burglary;
        this.BurglaryRate = BurglaryRate;
        this.Larceny = Larceny;
        this.LarcenyRate = LarcenyRate;
        this.VehicleTheft = VehicleTheft;
        this.VehicleTheftRate = VehicleTheftRate;  
    }
    //getter methods
    public short getYear(){
        return this.Year;
    }
    public int getPopulation(){
        return this.Population;
    }
    public int getViolentCrime(){
        return this.ViolentCrime;
    }
    public double getMurderRate(){
        return this.MurderRate;
    }
     public double getRobberyRate(){
        return this.RobberyRate;
    }
     public double getVehicleTheftRate(){
         return this.VehicleTheftRate;
     }
    public double getAssaultRate(){
         return this.AssaultRate;
     }
  
}