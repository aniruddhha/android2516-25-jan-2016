/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstapp.car;

/**
 *
 * @author aniruddha
 */
public class Car {
    
    /*default this is wrong*/ void getCarNum(){
        
        System.out.println("Car Num is 10");
    }
    
    public void getCarOwner(){
        
        System.out.println("Car Owner is android");
    }
    
    protected void getCarDashboard(){
        System.out.println("Car Dashboard");
    }
    
    private void getCarEngine(){
        
         System.out.println("Car Engine is 200cc");
    }
}
