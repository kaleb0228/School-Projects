import java.util.*;
/**
 * We want to recreate a mechanical pencil for production.
 *
 * @author Kaleb Dippold
 * @version 1.0b
 */

public class Pencil
{
    private int leadStorageCapacity; // a typical pencil holds at max 12
    private double length; // inches
    private double weight; // ounces
    private double pointType; // 0.5 or 0.7 mm
    private double exposedLead; // Current exposed lead. (Starts at 0, adds .5 every click).
    private String brandName; // a string that defines a brand name (Bic here)
    private String bodyColor; // black, grey
    private String bodyShape; // shape of the pencil (cylindrical)
    private String pocketClipColor; // red, green, blue, etc.
    private String materialComposition; // plastic or steel
    private ArrayList<Lead> lead =  new ArrayList<Lead>();
    private Eraser eraser;
    
    
    // A contructor used to define the basic characteristics of the Pencil.
    public Pencil()
    {
        // All pencils should be Bic with a length of 5.5.
        // Weight of 32
        leadStorageCapacity = 12;
        length = 5.5; 
        weight = 1.6;
        pointType = 0.7;
        exposedLead = 0;
        brandName = "Bic";
        bodyColor = "Black";
        bodyShape = "Cylindrical";
        pocketClipColor = "Red";
        materialComposition = "Plastic";
        
    }
    
    // Declaring the brand name, weight, and length of the pencil.
    public void Pencil(double pointType, String brandName, String bodyClipColor, String materialComposition)
    {
        this.pointType = pointType;
        this.brandName = brandName;
        this.pocketClipColor = pocketClipColor;
        this.materialComposition = materialComposition;
    }
    
    // If point type matches 0.7, add lead to it (change storage capacity by -1). If not, make no changes.
    //public int acceptLead (double pointType)
    //{
    //    this.pointType = pointType;
    //    if (pointType == 0.7) {
    //        leadStorageCapacity = leadStorageCapacity - 1;
    //    }
    //    if (pointType != 0.7) {
    //        leadStorageCapacity = leadStorageCapacity;
    //    }
    //    return leadStorageCapacity;    
    //}
    
    public void addLead (Lead lead)
    {
        //Adding lead, a simple check to make sure lead size 
        //matches pencil point type.
        if (lead.getThickness() == this.pointType && lead.size() < maxLead)
        {
            this.lead.add(lead);
        }
    }
    
    public double dispenseLead ()
    {
        if(lead != null)
        {
            //see how much length we have first
            if(lead.getLength() >= .5 && exposedLead < lead.getLength())
            {
                exposedLead += .5;
            }
            else
            {
                exposedLead = 0;
                lead = null;
            }
            //expose only if we haven't used all of length
            //expose a set amount of length (.5)
        }
        else
        {
            exposedLead = exposedLead;
        }
        return exposedLead;
    }
    
    public double getExposedLead()
    {
        return exposedLead;
    }
    
    
}
