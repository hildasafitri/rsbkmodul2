/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.text.DecimalFormat;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Agung
 */
@Stateless
@LocalBean
public class konversisuhu02 {

    String hasil;
    DecimalFormat x = new DecimalFormat("0.0");
    
    public String celcius_reamure(double param) {
        hasil = x.format (param * 4 / 5); 
        return hasil;
       
    }
    public String celcius_fahrenheit(double param) {
        hasil = x.format (param * 9 / 5 +32); 
        return hasil;
    }
    
    public String fahrenheit_celcius(double param){
        hasil = x.format ((param-32) * 5 / 9); 
        return hasil;
    }
        public String fahrenheit_reamure(double param){
        hasil = x.format ((param-32) * 4 / 9); 
        return hasil;
    }
        
        public String reamure_celcius(double param){
        return (x.format(param*5/4));
    }
        public String reamure_fahrenheit(double param){
        return (x.format(param*9/5 +32));
    }



}
