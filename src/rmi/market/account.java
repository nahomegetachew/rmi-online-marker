/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import rmi.market.bank.*;
import java.io.Serializable;
import java.util.Hashtable;
import rmi.market.item;

/**
 *
 * @author wolfe
 */



public class account implements Serializable {
    
    String ownername;
    int AccountNo;
    double balance;
    public account(String ownername, int AccountNo, double balance){
        this.AccountNo=AccountNo;
        this.ownername=ownername;
        this.balance=balance;
    }
    

    
    
    
    
    
    
    

}
