/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pack;

import javax.ejb.Local;

/**
 *
 * @author Admin
 */
@Local
public interface EjbstrareLocal {

    public String concate(String s1, String s2);
    public String touper(String s1);
    public String tolower(String s1);
    public int length(String s1);

    
}
