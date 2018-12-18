/*Filename: CrimeData
*Author: Shafro Batyrov
*Date: 03.04.2018
*Purpose: Analyzing US Crime Data
*/
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.math.*;

public class CrimeData {
    
    //private vailables
    private ArrayList<CrimeObject> CrimeData = new ArrayList<CrimeObject>();   
    //other variables

public void setCrimeData(BufferedReader file){
    BufferedReader CSVFile = file;
    try {
        String dataRow = CSVFile.readLine(); 
        dataRow = CSVFile.readLine(); 
        int count = 0;
        while(dataRow != null){ 
            String[] dataArray = dataRow.split(",");
            CrimeObject CrimeObject = new CrimeObject( //create objects with correct data type
                (Short.valueOf(dataArray[0])),//year
                (Integer.valueOf(dataArray[1])),//population
                (Integer.valueOf(dataArray[2])),//violentcrime
                (Double.valueOf(dataArray[3])),//violentrate
                (Integer.valueOf(dataArray[4])),//murder
                (Double.valueOf(dataArray[5])),//murder rate
                (Integer.valueOf(dataArray[6])),//rape
                (Double.valueOf(dataArray[7])),//rape rate
                (Integer.valueOf(dataArray[8])),//robbery
                (Double.valueOf(dataArray[9])),//robery rate
                (Integer.valueOf(dataArray[10])),//Assault
                (Double.valueOf(dataArray[11])),//Assault rate
                (Integer.valueOf(dataArray[12])),//property crime
                (Double.valueOf(dataArray[13])),//property crime rate
                (Integer.valueOf(dataArray[14])),//Burglary
                (Double.valueOf(dataArray[15])),//burglary rate
                (Integer.valueOf(dataArray[16])),//larceny
                (Double.valueOf(dataArray[17])),//larceny rate
                (Integer.valueOf(dataArray[18])),//vehicle
                (Double.valueOf(dataArray[19]))//vehicle rate
            );
            CrimeData.add(CrimeObject); // add object to the CrimeData List
            dataRow = CSVFile.readLine();//move to the next line
            count++;
        }
    }
    catch (IOException ex) {
        ex.printStackTrace();
    }
}
//Available Methods
    public int getLength(){
        return CrimeData.size();
    }
    
    public int getPopulation(int i){
        int population = CrimeData.get(i).getPopulation();
        return population;
    }
    public short getYear(int i){
        return CrimeData.get(i).getYear();
    }
    
    public double getGrowth(int i){
        CrimeObject thisYear = CrimeData.get(i);
        CrimeObject nextYear = CrimeData.get(i+1);
        double growth = nextYear.getPopulation() - thisYear.getPopulation();
        growth = growth/thisYear.getPopulation();
        growth = growth*100;
        return growth;   
    } 
    
    public CrimeObject getObject(int i){
        CrimeObject Object = CrimeData.get(i);
        return Object;
    }
    
}