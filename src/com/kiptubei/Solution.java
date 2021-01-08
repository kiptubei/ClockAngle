/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

/**
 *
 * @author kiptubei
 */
public class Solution {
    
    public int angle(int hours, int minutes){
        
        
        int hrs = hours;
        int min = minutes;
        
        /*formular*/
        /* hr hand angle with reference to 12 moves 0.5 degrees per minute (h*60+m)*0.5 */
        /* min hand moves 6 degrees per minute (6*m)*/
        
             // validate the input
        if (hrs <0 || min < 0 || hrs >12 || min > 60)
            System.out.println("Wrong input");
        
        
        if (hrs == 12)hrs = 0;
        
        
        if( min == 60){
            
            min = 0;
            hrs =  hrs + 1;
            
            if(hrs > 12) hrs = hrs -12;
        }
        
        int hour_angle  = (int)((hrs*60 + min)*0.5);
        int min_angle = (int)(6*min);
        
        int angle = Math.abs(hour_angle-min_angle);
        
        angle = Math.min(360-angle,angle);
        
        
        return angle;
    }
    
}
