/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codekul.firstapp;

import com.codekul.firstapp.car.Car;
import com.melayer.codekul.customer.Animal;
import com.melayer.codekul.customer.Tiger;

/**
 *
 * @author aniruddha
 */
public class Main {
    
    public static void main(String[] args) {
        
        
        Car car = new /*+*/ Car();
        car.getCarOwner();
        
        /*Animal animal = new Animal();
        animal.whichAnimal();
        u cant acheive this thing*/
        
        Tiger tiger = new Tiger();
        tiger.whichAnimal();
                
        Animal animal = new Tiger();
        animal.whichAnimal();
    }
}
