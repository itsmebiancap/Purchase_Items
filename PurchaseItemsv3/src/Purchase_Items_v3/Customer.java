/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Purchase_Items_v2;


/**
 *
 * @author Bebe
 */
public class Customer {
 
    public String firstName;
    public String lastName;
    String fullName;
    public void fullName()
     {
    /**
     *
     * @param firstName
     * @param lastName
     * @param fullName
     */
     }
    public void customer(String firstName, String lastName, String fullName)
    {
    this.firstName = firstName;
    this.lastName = lastName;
    this.fullName = fullName;
    }

    /**
     *
     * @return
     */
    @Override
  public String toString()
    {   
    return this.firstName + " " + this.lastName;
    }
  



}


  