
/**
 * encode messages or pictures in lowest bits of other pictures
 *
 * @author AP CS A
 * @version 1.0
 */
public class Steganography
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Steganography
     */
    public Steganography()
    {

    }

    /**
     * Method clearLowBits
     *
     * @param n number to clear
     * @return number with 0's in rightmost 2 bits
     */
    private int clearLowBits(int n)
    {
        return 4*(n/4);
    }

    
    /**
     * Method clearLow
     *
     * Clear the lower (rightmost) two bits in a pixel.
     * @param p pixel object to clear
     */
    private void clearLow( Pixel p )
    {
        p.setGreen(clearLowBits(p.getGreen()));
        p.setBlue(clearLowBits(p.getBlue()));
        p.setRed(clearLowBits(p.getRed()));   
    }
    
   
    /**
     * Method clearLowBits
     * Method to set the low bits of each color to 0
     * @param picture picture to modify
     */
    public void clearLowBits(Picture picture)
    {
        Pixel[][] pixels = picture.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                clearLow(pixelObj);
            }
        }
    }
    
    /**
     * Method main
     * test out the methods
     * @param args unused for now
     */
    public static void main(String[] args) 
    {
        Steganography steganography = new Steganography();
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        steganography.clearLowBits(beach);
        beach.explore();
    }
}
