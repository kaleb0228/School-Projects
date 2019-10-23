
/**
 * Defining the pencil's eraser
 * 
 * 
 */
public class Eraser
{
    // instance variables - replace the example below with your own
    private double length; // about 3 cm
    private int thickness; // about 1 cm thick
    private int force; // defining force for the remove mark method
    private int time; // defining time for the remove mark method
    private String color; // usually white, but all depends on the manufacturer.
    private String material; // rubber
    private String hardness; // usually firm
    

    // Basic characteristics of our eraser.
    public Eraser()
    {
        length = 3.0;
        thickness = 1;
        color = "White";
        material = "Rubber";
        hardness = "Firm";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void removeMark(double length, int force, int time)
    {
        this.force = force;
        this.time = time;
        this.length = length - (force*0.1 + time);        
    }
}
