// PantherID:  6131616
// CLASS: COP 2210 [FALL 2018]
// ASSIGNMENT # [3]
// DATE: 10/30/2018
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//*******************************************************************************
package a3_hauntedhouse;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class HauntedHouseTester
{
    public static void main(String[]args)
    {
        A3_HauntedHouse one = new A3_HauntedHouse();
         ImageIcon iconic = new ImageIcon("spooky.jpg");
         ImageIcon iconic2 = new ImageIcon("front door.png");
         JOptionPane.showMessageDialog(null,"This is an image of were you start in the tower for reference",":D",  JOptionPane.INFORMATION_MESSAGE , iconic2);
         JOptionPane.showMessageDialog(null,"spooky picture to scare you lets begin!",":D",  JOptionPane.INFORMATION_MESSAGE , iconic);
         one.frontDoor(); 
    }
}