/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import javax.ejb.Stateless;

/**
 *
 * @author Admin
 */
@Stateless
public class EJBareaBean implements EJBareaLocal {

    public double areaofcircle(int r) {
        return (3.14*r*r);
    }

    public double areaoftringle(int b, int h) {
        return (0.5*b*h);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method" or "Web Service > Add Operation")
 
}
