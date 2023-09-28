/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1_ooc;

import ioutils.IOUtils;

/**
 *
 * @author caroo
 */
public class Homework1_OOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       IOUtils form = new IOUtils();
       //it will be created a form to get user personal details
       
       String name;
        
        name = form.getUserText("Please, enter your name."); //get user name
       
       int age;
        
        age = form.getUserInt("Please, enter your age."); //get user age
        
        
        String country;
        
        country = form.getUserText("Which country are you from?"); //get user country
        
    }
    
}
