/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aniruddha
 */
public class Temp {
    
    public int getThingsDone(){
        return 0;
    }
    
    public static void main(String[] args) {
        
        if(args.length > 0){
            
            for(int i = 0 ; i< args.length; i++)
                System.out.println(""+i+"th" + args[i]);
        }
        else{
            System.out.println("Error in app termination");
            System.exit(1);
        }
        
        return;
    }
    
}
