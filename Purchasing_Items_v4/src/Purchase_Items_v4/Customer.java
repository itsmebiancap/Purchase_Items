/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Purchase_Items_v3;

/**
 *
 *   @author Bianca Papapietro, PRG215, Professor Stott, 1/15/17
 */
public class Customer {
    public String firstName;
    public String lastName;
    
    public String FullName()
    {
        return this.firstName + " " + this.lastName;
    }
    
}
