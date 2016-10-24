package Cswkpt1;

import java.util.ArrayList;

/**
 * Write a description of class Monitoring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monitoring
{
    // instance variables - replace the example below with your own
    private String monitor;
    //Arraylist for storing Observatories in/
    private ArrayList<Observatory> grid;
    /**
     * Constructor for objects of class Monitoring
     */
    public Monitoring(String monitor)
    {
        // initialise instance variables
        this.monitor=monitor;
        grid=new ArrayList<Observatory>();
    }

    /*Method to add observatory objects to grid ArrayList
     * 
     */
    public void addObservatory(Observatory o)
    {
        // put your code here
        grid.add(o);
    }
    
    public void maxAvgMag()
 {
     Observatory largest=grid.get(0);
        for(int i=1; i<grid.size();i++)
        {
           Observatory o=grid.get(i);
            if(o.avgMagnitude()>largest.avgMagnitude())
            {
               largest = o;
            }
        
           System.out.println(largest.getObDetails());          
        }
 
 
}
public void totalMagMax()
{
    Observatory largest=grid.get(0);
    Earthquake tLargest=earthquake.list.get(0);
        for(int i=1; 1<grid.size(); i++)
        {
            Observatory o =grid.get(i);
            if(o.magMax()>largest.magMax())
            {
                largest=o;
            }
            
}
}
}

