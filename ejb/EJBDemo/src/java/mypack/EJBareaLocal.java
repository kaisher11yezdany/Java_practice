/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface EJBareaLocal {
    public double areaofcircle(int r);
    public double areaoftringle(int b,int h);
}
