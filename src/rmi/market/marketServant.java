/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author wolfe
 */
public class marketServant extends UnicastRemoteObject implements rmiMarketInterface{

    public marketServant() throws RemoteException{
        super();
        init();
    }
    
    item[] items=new item[5];
    
    Hashtable<String, item>  Items = new Hashtable<String, item>();
    
    
    
    @Override
    public void transfer(int SenderAccountNo, int ReciverAccountNo, int amount) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public int balance(int account) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Add_item(item item) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Items.put(item.id,item);
        return;
    }

    @Override
    public void buy(String name) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String name) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hashtable<String, item> viewItem() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void init() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    item a=new item();
//    a.name="vitz";
//    a.id="vitz2001";
//    a.price=44;
//    a.quantity=5;
//    
//    Items.put(a.id,a);
//String name, String id,String postedby,float price,int quantity,int ownerAc

    item a=new item("vitz", "vitz 2008", "fasil", 500000, 5, 10001);
    Items.put(a.id,a);
    
    item b=new item("bmw", "bmwfi", "andu", 50000, 12, 10002);
    Items.put(b.id,b);
    
    item c=new item("pen", "bic1", "nahome", 2.50, 20, 10003);
    Items.put(c.id,c);
    System.out.print(Items.get("vitz 2008").name);
    
    }

 
    
}
