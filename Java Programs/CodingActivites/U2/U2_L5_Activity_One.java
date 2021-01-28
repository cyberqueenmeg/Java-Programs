/* Lesson 5 Coding Activity Question 1 */
/*
Write code which creates three regular polygons with 11, 14 and 19 sides respectively. 
All side lengths should be 1.0. The code should then print the three shapes, one on each line, in the order given (i.e. the one with 11 sides first and the one with 19 sides last).
*/

import java.util.Scanner;
import edhesive.shapes.*;

public class U2_L5_Activity_One{
  public static void main(String[] args){
  
    RegularPolygon a = new RegularPolygon(11);
    RegularPolygon b = new RegularPolygon(14);
    RegularPolygon c = new RegularPolygon(19);
    System.out.print(a\nb\nc);  
  
  }
}
