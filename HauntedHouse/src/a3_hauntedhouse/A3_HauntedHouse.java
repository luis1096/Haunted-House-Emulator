 // PantherID:  6131616
// CLASS: COP 2210 [FALL 2018]
// ASSIGNMENT # [3]
// DATE: 10/30/2018
//
////PATHERID OF ORIGINAL CODER: [6131616]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//*******************************************************************************
package a3_hauntedhouse;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ImageIcon;
public class A3_HauntedHouse
{
    /**this string is the name of the user who is  playing the game*/
    private String name;
    /**the array list creates an inventory for the user to pick up items and use them through out the game */
    private ArrayList inventory = new ArrayList();
    Scanner in = new Scanner(System.in);
    public A3_HauntedHouse()
    {
        this.name = name;
        this.inventory = inventory;
    }
    ImageIcon livingroom = new ImageIcon("living room.png");
    ImageIcon masterBathroom = new ImageIcon("master bathroom.png");
    ImageIcon bathroom = new ImageIcon("bathroom.png");
    ImageIcon bedroom1 = new ImageIcon("bedroom 1.png");
    ImageIcon bedroom2 = new ImageIcon("bedroom 2.png");
    ImageIcon kitchen = new ImageIcon("kitchen.png");
    ImageIcon attic = new ImageIcon("attic.png");
    ImageIcon masterBedroom = new ImageIcon("master bedroom.png");
    ImageIcon pantry = new ImageIcon("pantry.png");
    ImageIcon diningroom = new ImageIcon("dining room.png");
    ImageIcon frontDoor = new ImageIcon("front door.png");
    ImageIcon basement = new ImageIcon("basement.png");
    ImageIcon towerTerror = new ImageIcon("Tower of terror pic.png");
    ImageIcon elevator = new ImageIcon("elevator.jpg");
        
     /** the front door method acts as the starting location and the exit point at the same time.@Carlos De Cabrera PID#6072903*/   
    
 public void frontDoor()
    {  
        int number = 1;
        int numberTwo = 2;
         if(inventory.contains("frontdoor_key")) 
       {
          JOptionPane.showMessageDialog(null, "you have the key to escape you made it out alive!");
          gameOver();
          System.exit(0);
       }
        
       while(!inventory.contains("frontdoor_key"))
       {
             
            name = JOptionPane.showInputDialog("Welcome to the Tower Terror may i ask what is your name?");
           JOptionPane.showMessageDialog(null, "Welcome " + name + " we start at the 1st floor of the tower.\nplease step into the elevator to go on and explore.");  
           JOptionPane.showMessageDialog(null,"",":D",  JOptionPane.INFORMATION_MESSAGE , elevator);
           number = number + 20;
           elevator();
       }
       
             
    }
             
 
  /** the elevator method goes from the basement (0) to the attic (11) and all in between , while acting as an anchor for all for all the methods.@Luis Oliveros PID#6131616*/
    public void elevator()
    {
        String decision = JOptionPane.showInputDialog("you are now in the elevator \nYou may choose to type in the number of the floor you want to go to. (0-11)");
        
        if(decision.equals("0")) 
        {
            basement();
        }
        else if(decision.equals("1"))
        {
            frontDoor();
        }
        else if(decision.equals("2"))
        {
             livingRoom();
        }
         else if(decision.equals("3"))
        {
            bathRoom();
        }
        else if(decision.equals("4"))
        {
            diningRoom();
        }
         else if(decision.equals("5"))
        {
            kitchen();
        }
        else if(decision.equals("6"))
        {
            pantry();
        }
         else if(decision.equals("7"))
        {
            masterBedroom();
        }
        else if(decision.equals("8"))
        {
           masterBathroom();
        }
         else if(decision.equals("9"))
        {
            bedRoom1();
        }
        else if(decision.equals("10" ))
            
        {
            bedRoom2();
        }
        else if(decision.equals("11"))
        {
           attic();    
        }
        else
        {
            JOptionPane.showMessageDialog(null,"that wasnt a valid key " + name + "lets try over shall we");
            elevator();
        } 
        
    }
          
    
    /** when the living room method runs it ask the user to explore, if the user explores they are able to open the chest, or finish the game.@Carlos De Cabrera PID#6072903*/
    public void livingRoom()
    {
        String decision = JOptionPane.showInputDialog("So you've made it to floor 2, the living room there is an item you can explore would you like to? \nPlease type (yes) or (no)");
        
        
        if(decision.equalsIgnoreCase("yes"))
        {
           JOptionPane.showMessageDialog(null, "you open up a chest and a Ghost escapes and scares you to death");
            inventory.add("Chest");
            JOptionPane.showMessageDialog(null,"Map of were you ended","D",  JOptionPane.INFORMATION_MESSAGE , livingroom);
            gameOver();
          
        }
        else if(decision.equalsIgnoreCase("no"))
        {
            elevator(); 
        }
        else
        {
            JOptionPane.showMessageDialog(null,"that wasnt a valid key " + name + "lets try over shall we");
            livingRoom();
        } 
        
    }  
    /**the dining room method allows you the explore the room and find a candelabra or go back to the elevator to explore and other floor.@Luis Oliveros PID#6131616*/
    public void diningRoom()
    {
        String decision = JOptionPane.showInputDialog("You are in the 4th floor,  dining room there is an item to explore would you like to? type (yes) or (no)");
        if(decision.equalsIgnoreCase("yes"))
        {
           inventory.add("Candelabra");
           JOptionPane.showMessageDialog(null,"As you pick up the Candelabra it lights up by itself and you see a death shadow back to the elevator you go.");
            elevator();
        }
        else if(decision.equalsIgnoreCase("no"))
        {
            elevator();
        }
          else
        {
            JOptionPane.showMessageDialog(null,"that wasnt a valid key " + name + "lets try over shall we");
            diningRoom();
        } 
    } 
    /**the kitchen method allows you to explore two items the cabinet, and the refrigerator, if you pick the cabinet you die, and if you pick the refrigerator you die.@Carlos De Cabrera PID#6072903 */
    public void kitchen()
    {
       String decision3 = JOptionPane.showInputDialog("Welcome to the 5th floor the kitchen. There are two items to explore type etheir (refrigerator) or (cabinet) or (no)");
               
        if(decision3.equalsIgnoreCase("no"))
        {
             elevator();
         }
         else if (decision3.equalsIgnoreCase("refrigerator"))
         {
             inventory.add("soul food");
             String decisionA = JOptionPane.showInputDialog("You open the fridge and find some delicious soul food \nwould you like to explore the cabinet? type (yes) or (no)");

             if(decisionA.equalsIgnoreCase("no"))
             {
                 elevator();
             }
             else if(decisionA.equalsIgnoreCase("yes"))
             {
               JOptionPane.showMessageDialog(null,"when you open the cabinet The dishes and glasses start flying as you as soon as you open the door. \nYou get hit in the head and feel yourself start moving towards a light");
                JOptionPane.showMessageDialog(null,"Map of were you ended",":D",  JOptionPane.INFORMATION_MESSAGE , kitchen);
              gameOver();
             }
         }
         else if(decision3.equalsIgnoreCase("cabinet"))
         {
              JOptionPane.showMessageDialog(null,"when you open the cabinet The dishes and glasses start flying at you as soon as you open the door. \nYou get hit in the head and feel yourself start moving towards a light");
               JOptionPane.showMessageDialog(null,"Map of were you ended",":D",  JOptionPane.INFORMATION_MESSAGE , kitchen);
             gameOver();
         }
         else
          {
            JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
              kitchen();
           }
   }
    /** the pantry allows you to explore two items, the broom, and the dusty recipe box both items which get added to your inventory if you choose to pick them up.@Luis Oliveros PID#6131616*/
    public void pantry()
    {
         
        String decision5 = JOptionPane.showInputDialog("welcome to floor number 6 the pantry. Please type (yes) or (no) to explore an item in their");
                        
        if(decision5.equalsIgnoreCase("yes"))
        {
            inventory.add("Dusty recipe Box");
            String decisionB = JOptionPane.showInputDialog("you find a Dusty recipe box you open it up and a recipe \nfor devils food cake appears out of nowhere \nwould you like to explore the other item in their? (yes) or (no)");

            if(decisionB.equalsIgnoreCase("no"))
            {
                elevator();
            }
            else if(decisionB.equalsIgnoreCase("yes"))
            {
                 JOptionPane.showMessageDialog(null,"The broom flies up in the air as soon as you touch it");
                 inventory.add("broom");
               elevator();
             }
        }
        else if(decision5.equalsIgnoreCase("no"))
        {
         elevator();
        }
        else
          {
             JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
              pantry();
          }
                                 
       } 

  /**bedroom 1  has three options 1 is the explore the chair and then pick it up, option 2 is the look outside the window, and option  3 is to go back to the elevator.@Carlos De Cabrera PID#6072903*/
  public void bedRoom1()
   {
        String decision = JOptionPane.showInputDialog("hey you made it to bedroom1 on floor 9 " + name + " and there are two items to explore\n would you like to explore them?\n type (yes) or (no)");
        
        if(decision.equalsIgnoreCase("yes"))
        {
            inventory.add("chair");
            String decision2 = JOptionPane.showInputDialog("you see the chair starts rocking by itself with no one in it \nwould you like to look out the window " + name + " type (yes) or (no)");
            
            if(decision2.equalsIgnoreCase("no"))
            {
                  elevator();
            }
            else if(decision2.equalsIgnoreCase("yes"))
            {
                inventory.add("window");
                JOptionPane.showMessageDialog(null, "as you look at the window you see a child outside on a swing who suddendly disappears \nthere is nothing more to explore in this floor " + name + " back to the elevator we go");
                 elevator();
            }
        }
        else if(decision.equalsIgnoreCase("no"))
        {
            elevator();
        }
       else
        {
           JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
            bedRoom1();
        }
            
    }
   

/**bedroom2 has two options as well one including a doll house, and one exploring a dresser, both attached attached together so both are explored if user wants to explore items.@Luis Oliveros PID#6131616*/
    public void bedRoom2()
    {
        int x = 2;
        int y = 1;
        String decision = JOptionPane.showInputDialog("hello " + name + " youre in the 10th floor, bedroom 2 want to explore the items ? (yes) or (no)");
      do
      {
        if(decision.equalsIgnoreCase("yes") || decision.equalsIgnoreCase("no") );
        {
               String decision2 = JOptionPane.showInputDialog("a ghost jumps out of the dresser and leaves screaming downstairs\n Suddenly the door to the elevator dissapears behind you \n there is a doll house to view. type (yes) or (no)");
        
              if(decision2.equalsIgnoreCase("yes") || decision2.equalsIgnoreCase("no"));
              {
                   JOptionPane.showMessageDialog(null,"regardless of your choice the dolls start dancing while they count down from 10 then they explode with you and the house");
                      JOptionPane.showMessageDialog(null,"Map of were you ended",":D",  JOptionPane.INFORMATION_MESSAGE , bedroom2);
                      gameOver();
              }
           }
        x--;
      }
      while( x > y);
      x--;
    }
     /**the master bedroom method attaches both explored items together while also giving you the option to get back into the elevator.@Carlos De Cabrera PID#6072903*/                
    public void masterBedroom()
    {
        String decision = JOptionPane.showInputDialog("Welcome to the Master bedroom on floor number 7 " + name + " there are items you can explore type (yes) to view  or (no) to move on");
        if(decision.equalsIgnoreCase("no"))
        {
            elevator();
        }
        else if(decision.equalsIgnoreCase("yes"))
        {
            JOptionPane.showMessageDialog(null,"you find some gum to chew on and it taste good");
            inventory.add("gum");
            String decision2 = JOptionPane.showInputDialog("would you like to view the other item in this room (yes) or (no)");
            if(decision2.equalsIgnoreCase("yes"))
            {
                JOptionPane.showMessageDialog(null,"As you look at the Intricate Oil Lamp and rub it a genie comes out and stabs you and you die ");
                 JOptionPane.showMessageDialog(null,"Map of were you ended",":D",  JOptionPane.INFORMATION_MESSAGE , masterBedroom);
                gameOver();
            }
            else if(decision2.equalsIgnoreCase("no"))
            {
                 elevator();
            }
        }
          else
        {
           JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
            masterBedroom();
        }
    }
    
    /**this method is used when ever the user dies or beats the game, it runs this method and shows the player ending inventory.@Luis Oliveros PID#6131616*/
    public void gameOver()
    {
        JOptionPane.showMessageDialog(null,"\nGame Over " + name + ", Thanks for playing, Happy Halloween :D\nThe items you saw in the house and/or collected in your backpack before the game ended will be listed in the order you found them 1 by 1");
       
        for(int i = 0; i <  inventory.size(); i++)
        {
            JOptionPane.showMessageDialog(null, inventory.get(i));
                System.exit(0); 
        }  
    }
    
    /**the bathroom method allows you to explore the mirror and and the shower, both which amazingly don't kill you.@Carlos De Cabrera PID#6072903*/
    public void bathRoom()
    {
        String decisionX = JOptionPane.showInputDialog("we are in the 3rd floor the bathroom there are items to explore " + name + " would you like to? \ntype (yes) or (no)");

        if(decisionX.equalsIgnoreCase("yes"))
        {

            inventory.add("Mirror");
            String decisionY = JOptionPane.showInputDialog("you pick a mirror and see a bloody face looking back at you \nthere is another item to explore would you like to " +name+  "\n type (yes) or (no)");

            if(decisionY.equalsIgnoreCase("no"))
            {
                 elevator();
            }
            else if(decisionY.equalsIgnoreCase("yes"))
            {
                 JOptionPane.showMessageDialog(null,"As you look at the shower the room suddenly steams up \nand you feel fingers touching the back of your neck");
                 inventory.add("shower");
                  elevator();
            }
        }
        else if(decisionX.equalsIgnoreCase("no"))
        {
             elevator();
        }
          else
        {
            JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
            bathRoom();
        }   
    }
/**the attic is an interesting method because it requires the user to first get the  key from the basement method, the the must open the door to find a chest the has the key to the front door to win the game.@Luis Oliveros PID#6131616*/
          public void attic()
         {
            boolean key = inventory.contains("attic_key");
            String d1 = JOptionPane.showInputDialog("you try to get into the attic but its locked use attic_key? (yes) or (no)");
           
            if ( key  && d1.equalsIgnoreCase("yes"))
            {
             String d2 = JOptionPane.showInputDialog("you see a chest open it? (yes) or (no)");
             
             if (d2.equalsIgnoreCase("yes"))
             {
                 JOptionPane.showMessageDialog(null,"you find the frontdoor_key?");
                 inventory.add("frontdoor_key");
                 JOptionPane.showMessageDialog(null,"you find nothing else to loot. Lets go back to the elevator");
                 elevator();
             }
             if (d2.equalsIgnoreCase("no"))
             {
                 JOptionPane.showMessageDialog(null,"i think you should, but ok back to the elevator");
                 elevator();
             }
             }
            else if(!key && d1.equalsIgnoreCase("no")){
            JOptionPane.showMessageDialog(null,"you dont have the key, go look for it");
                elevator();
             }
              else
        {
            JOptionPane.showMessageDialog(null,"that wasnt a valid key " + name + "lets try over shall we");
            attic();
        } 
                
    }
    /**the basement method is the only method or floor with 2 rooms in it, one which does nothing while the other contains a chest that adds the attic key to your inventory if you choose to open the chest else it sends you back into the elevator.@Carlos De Cabrera PID#6072903*/      
   public void basement()
    {
        String decision = JOptionPane.showInputDialog("So you've made it into the Basement there is two rooms to explore the storage room or the boiler room? \nPlease type (storage) or (boiler)");
        
        
        if(decision.equalsIgnoreCase("boiler"))
        {
            boiler();
        }
        else if(decision.equalsIgnoreCase("storage"))
        {
            storage();
        }
        else if(decision.equalsIgnoreCase("elevator"))
        {
            elevator();
        }
        else
         {
            JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
             basement();
         }
        
  }
   /**the boiler room method is a room insde the basement which has no item or anything of interest so it give you the option to go back to the elevator or explore the storage room.@Luis Oliveros PID#6131616*/
   public void boiler()
   {
      String d1 = JOptionPane.showInputDialog("You are in the boiler room want to explore it? /n type (yes) or (no)");
            
    if (d1.equalsIgnoreCase("yes"))
    {
    JOptionPane.showMessageDialog(null,"you find nothing");
        String d2 = JOptionPane.showInputDialog("elevator or storage");
        {
        if(d2.equalsIgnoreCase("elevator"))
        {
        elevator();
        }
    else if (d2.equalsIgnoreCase("storage"))
    {
        storage();
    }
    }
    }
    else if (d1.equalsIgnoreCase("no"))
    {
        JOptionPane.showMessageDialog(null,"ok lets go back");
        String d2 = JOptionPane.showInputDialog("elevator or storage");
        {
        if(d2.equalsIgnoreCase("elevator"))
        {
        elevator();
        }
    else if (d2.equalsIgnoreCase("storage"))
    {
        storage();
    }
    }
   }
     else
     {
            JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
             boiler();
     }
   }
   /**the storage room contains a chest that adds the attic key to your inventory so that it can be used to open the door in the attic.@Carlos De Cabrera PID#6072903*/
   public void storage()
   {
       String d1 = JOptionPane.showInputDialog("You are in the storage room you see a chest wannna open it? /n type (yes) or (no)");
       
       if(d1.equalsIgnoreCase("yes"))
       {
          JOptionPane.showMessageDialog(null,"you find an attic_key");
          inventory.add("attic_key");
       String d2 =JOptionPane.showInputDialog( "you see nothing else head back to the elevator or boiler room. /n type (elevator) or (boiler)");
       if (d2.equalsIgnoreCase("elevator"))
       {
           elevator();
      }
       else if (d2.equalsIgnoreCase("boiler")){
           boiler();
       }
     }
       else if (d1.equalsIgnoreCase("no"))
       {
           String d2 =JOptionPane.showInputDialog( "you see nothing else head back to the elevator or boiler room. /n type (elevator) or (boiler)");
           if (d2.equalsIgnoreCase("elevator"))
           {
           elevator();
      }
       else if (d2.equalsIgnoreCase("boiler")){
           boiler();
       }
       }
         else
         {
            JOptionPane.showMessageDialog(null,"That wasnt a valid response " + name + " im afraid we will have to start over");
             storage();
         }
   }
   /**the master bathroom allows you to explore the shower which doesn't kill you and takes you back to the elevator.@Luis Oliveros PID#6131616*/
   public void masterBathroom()
   {
         
                String decision4 = JOptionPane.showInputDialog("hey youre in the 8th floor the master Bathroom would you like to interact with the item in this room?");
               if(decision4.equalsIgnoreCase("no"))
                {
                     elevator();
                }
                else if(decision4.equalsIgnoreCase("yes"))
                {
                     JOptionPane.showMessageDialog(null, "as you look at the shower the Room suddenly steams \nup and you feel fingers touching the back of your neck ");
                     inventory.add("shower");
                      elevator();
                }
                 else
        {
            JOptionPane.showMessageDialog(null,"that wasnt a valid key " + name + "lets try over shall we");
            masterBathroom();
        } 
            }
}          