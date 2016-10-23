import java.util.ArrayList; //import array list class


/**
 * Write a description of class Observatory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Observatory
{
    // instance variables 
    private String obsName;
    private String country;
    private int beganObs;
    private double areaCov;
    private double avgMag;
    //ArrayList for storing earthquakes in.
    private ArrayList<Earthquake> list;
    
   
    //Construct an Observatory object & input parameter values
public Observatory(String name, String nation, int start, double sqKm)
    {
        // initialise instance variables
        obsName= name;
        country= nation;
        beganObs= start;
        areaCov= sqKm;
        avgMag=0.0;
        list=new ArrayList<Earthquake>();
           }
       
  //add earthquake object to list in observatory    
public void addEarthquake(Earthquake e)
    {list.add(e);
    }

//get number of earthquakes
public int getNumberOfEarthquakes()
   {
    return list.size();
   }
   
/* method to list current earthquakes and their details in 
 * string form
 */
    public void listAllEarthquakes()
    {
    System.out.println("Earthquake listing: ");
    for(Earthquake earthquake: list){
       System.out.println(earthquake.getDetails());
    }
    System.out.println();
 
    }

//List all magnitudes in array.
public void listMagnitudes()
{
    System.out.println("Earthquake Magnitudes: ");
    for(Earthquake earthquake : list){
        System.out.println(earthquake.getMagnitude());
        
}
System.out.println();
}

/*Prints largest magnitude earthquake recorded by observatory.
*and its details.
*largest=temporary variable is assigned an index at 
*   start of arraylist
*e=temporary index assigned to iterator.
*For each loop runs through whole arraylist
*At each new index, "largest"& current-index calls "getMagnitude" 
* and compare magnitude values.
* if current-index mag> "largest", reassign that index to "largest".
* Print the details of index set to "largest".
*/

public void magMax()
 {
     Earthquake largest=list.get(0);
        for(int i=1; i<list.size();i++)
        {
            Earthquake e=list.get(i);
            if(e.getMagnitude()>largest.getMagnitude()){
               largest = e;
              }
        }
           System.out.println(largest.getDetails());          
 }
  

 /* Calculate average magnitude.
  * set local variable "total" to 0
  * iterate over arraylist adding each EQ magnitude to total
  * Divide total by number of objects in arraylist
  */
 
public double avgMagnitude()
  {
  double total=0;
  for(Earthquake earthquake : list)
  {
    total=total+earthquake.getMagnitude();
  }
double avgMag=total/list.size();
System.out.println("Average Magnitude Recorded: "+avgMag);
return avgMag;
}

/*Print magnitudes above a certain level (parameter cutoff)
 * set local variable "filter" to = cutoff
 * iterate over arraylist comparing each EQ Mag to cutoff double.
 * IF getMagnitude > cutoff (only greater than no equal to)
 * print out that Earthquakes details using getDetails method.
 */
public void getMagnitudeAbove(double cutoff)
 {
     double filter=cutoff;
        for(int i=1; i<list.size();i++)
        {
            Earthquake e=list.get(i);
            if(e.getMagnitude()>cutoff){
               System.out.println(e.getDetails());
              }
        }
                     
 }

 public String getObDetails()
{
    return "Observatory:" + obsName + "Nation: " + country + "Started Observing: " + beganObs + "Square Kilometers Covered: " + areaCov+"sqkm.";
}
}
