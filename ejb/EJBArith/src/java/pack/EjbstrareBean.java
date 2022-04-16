/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import javax.ejb.Stateless;

/**
 *
 * @author Admin
 */
@Stateless
public class EjbstrareBean implements EjbstrareLocal {

    public String concate(String s1, String s2) {
        return (s1.concat(s2));
    }

    public int length(String s1) {
        return (s1.length());
    }

    public String tolower(String s1) {
       return (s1.toLowerCase());
    }

    public String touper(String s1) {
        return (s1.toUpperCase());
    }
    
    
 }
