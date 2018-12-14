/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.io.Serializable;

/**
 *
 * @author wolfe
 */
public class item implements Serializable{
    public String name;
    public double price;
    public int quantity;  
    public String id;
    public String postedby;
    public int ownerAc;
//    Hashtable<int ,int> ls=new Hashtable<int ,int>();
    
    public item(){};
    public item(String name, String id,String postedby,double price,int quantity,int ownerAc){
        this.name=name;
        this.id=id;
        this.price=price;
        this.quantity=quantity;
        this.postedby=postedby;
        this.ownerAc=ownerAc;
    }
    
}
