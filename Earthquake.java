
/**
 * Write a description of class Earthquake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earthquake
{
    // instance variables - replace the example below with your own
    private double magnitude;
    private double latitude;
    private double longitude;
    private int year;
    private String title;
    /**
     * Constructor for objects of class Earthquake
     */
    public Earthquake(String title, double magnitude, double latitude, double longitude, int year)
    {
        // initialise instance variables
        this.title=title;
        this.magnitude=magnitude; //input the above parameters into these fields.
        this.latitude=latitude;
        this.longitude=longitude;
        this.year=year;
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    //mutator methods
    public void setTitle(String name)
    {
        title=name;
    }
    public void setMagnitude(double richterS )
    {
        // put your code here
        magnitude=richterS;   //input 
    }
    public void setLatitude(double posLat)
    {
        latitude=posLat;
    }
    public void setLongitude(double posLon)
    {
        longitude=posLon;
    }
    public void setYear(int eventYr)
    {
        year=eventYr;
    }
    //return methods
        public double getMagnitude()
    {
        return magnitude;
    }
    public double getLatitude()
    {
        return latitude;
    }
    public double getLongitude()
    {
        return longitude;
    }
    public int getYear()
    {
        return year;
    }
      public String getTitle()
    {
        return title;
    }
    public String getDetails()
    {
        return title + ", " + year + ", " +magnitude + "mag, " + latitude + "lat, " + longitude + "long. ";
    }
}