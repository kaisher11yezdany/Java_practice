/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ejbuse;

import mypack.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       EJBareaBean e= new EJBareaBean();
        System.out.println("Area of Circle Is="+e.areaofcircle(4));
        System.out.println("Area of Triangle Is="+ e.areaoftringle(4,5));
    
    }


};
