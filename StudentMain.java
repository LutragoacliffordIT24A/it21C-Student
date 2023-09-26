/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JesMar
 */
class StudentMain {
    
    public static void main(String [] args){
        Student a = new Student();
          a.setname("Name:" + "Clifford John");
          a.setsection("Section:" +"IT21C");
          a.setmotto( "Motto:"+ "You Can't Undo Past But You Can Do A Better Future");
          
     System.out.println(a.getname());
     System.out.println(a.getsection());
     System.out.println(a.getmotto());
     
    }
}