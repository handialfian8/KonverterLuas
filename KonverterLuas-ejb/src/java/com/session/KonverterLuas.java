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
 * @author Handi
 */
@Stateless
@LocalBean
public class KonverterLuas {
    
    DecimalFormat a = new DecimalFormat("0.000000");
    String result;
            
    public String meterpersegi_are(double param) {
        return result = a.format(param/100);
    }

    public String meterpersegi_hektare(double param) {
        return result = a.format(param/10000);
    }

    public String meterpersegi_kmpersegi(double param) {
        return result = a.format(param/1000000);
    }

    public String are_meterpersegi(double param) {
        return result = a.format(param*100);
    }

    public String are_hektare(double param) {
        return result = a.format(param/100);
    }

    public String are_kmpersegi(double param) {
        return result = a.format(param/10000);
    }

    public String hektare_meterpersegi(double param) {
        return result = a.format(param*10000);
    }

    public String hektare_are(double param) {
        return result = a.format(param*100);
    }

    public String hektare_kmpersegi(double param) {
        return result = a.format(param/100);
    }

    public String kmpersegi_meterpersegi(double param) {
        return result = a.format(param*1000000);
    }

    public String kmpersegi_are(double param) {
        return result = a.format(param*10000);
    }

    public String kmpersegi_hektare(double param) {
        return result = a.format(param*100);
    }

    
}
