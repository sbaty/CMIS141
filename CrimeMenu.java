/*Filename: CrimeMenu
*Author: Shafro Batyrov
*Date: 03.04.2018
*Purpose: Analyzing US Crime Data
*/

public class CrimeMenu {
    final String showMenu =  //Create Menu Variable
        "\nEnter the number of the question you want answered. Enter ‘0’ to quit the program :" +
        "\n1. What were the percentages in population growth for each consecutive year from 1994 to 2013?"+
        "\n2. What year was the Murder rate the highest?"+
        "\n3. What year was the Murder rate the lowest?"+
        "\n4. What year was the Robbery rate the highest?"+
        "\n5. What year was the Robbery rate the lowest?"+
        "\n6. What was the total percentage change in Motor Vehicle Theft between 1998 and 2012?"+
        "\n7. What year was the Assault rate the highest?"+         
        "\n8. What year was the Assault rate the lowest?"+
        "\n0. Quit the program"+
        "\nEnter your selection:";

    public String getMenu(){//getter method
        return showMenu;
    }
    
}