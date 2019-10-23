
/**
 * Defining the Lead for the Pencil.
 *
 * 
 * 
 */
public class Lead
{
    // instance variables - replace the example below with your own
    private double length;
    private double thickness;
    private int force;
    private int time;
    private String color;
    private String material;
    private String hardness;

    // Basic characteristics of our lead - length in mm, thickness in mm.
    public Lead()
    {
        length = 90;
        thickness = 0.7;
        color = "Black";
        material = "Graphite";
        hardness = "Brittle";
    }

    // Method in order to check exposed lead before marking
    // public void markCheck(int force, int time)
    //{
    //   this.force = force;
    //    this.time = time;
    //   this.length = length - (force * 0.0833 * time); //approximately loses 0.0833 mm per second
   // }
    
    // Method in order to check exposed lead before marking
    public boolean markCheck(lead <lead1>)
    {
       if(Pencil.getExposedLead() > 0)
       {
           return true;
       }
       else 
       {
           return false;
       }
    }
    
    public void mark(int force, int time)
    {
       if(markCheck = true)
       {
           this.force = force;
           this.time = time;
           this.getExposedLead = exposedLead - (force * 0.0833 * time); //approximately loses 0.0833 mm per second
       }
    }    
    
    
    public double getThickness()
    {
        return thickness;
    }
    
    public double getLength()
    {
        return length;
    }
    
}
