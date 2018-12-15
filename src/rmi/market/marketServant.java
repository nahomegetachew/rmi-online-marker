/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wolfe
 */
public class marketServant extends UnicastRemoteObject implements rmiMarketInterface {

    

    public marketServant() throws RemoteException, NotBoundException, MalformedURLException {
        super();


        init();
    }

    item[] items = new item[10];
    Hashtable<String, item> Items = new Hashtable<String, item>();
    Hashtable<Integer, account> Accounts = new Hashtable<Integer, account>();
    int marketacno = 10001;

    @Override
    public void transfer(int sender, int reciver, double ammount) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Accounts.get(sender).balance = Accounts.get(sender).balance - ammount;
        Accounts.get(reciver).balance = Accounts.get(reciver).balance + ammount;
    }

    @Override
    public account balance(int account) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        System.out.print( Accounts.get(10002).balance);
        return Accounts.get(account);
    }

    @Override
    public void Add_item(item i) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        Items.put(item.id,item);
        i.postedby = Accounts.get(i.ownerAc).ownername;
        Items.put(i.id, i);
    }

    @Override
    public void buy(String name, int b) throws RemoteException {

        //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        service.transfer(b,Item.get(name).ownerAc,Items.get(name).price);
        if (Items.get(name) != null) {
            this.transfer(b, Items.get(name).ownerAc, Items.get(name).price);
            if (Items.get(name).quantity > 1) {
                Items.get(name).quantity -= 1;
            } else {
                Items.remove(name);
            }
        }

    }

    @Override
    public void remove(String name,int ac) throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(Items.get(name).ownerAc == Accounts.get(ac).AccountNo){
        Items.remove(name);
        }
    }

    @Override
    public Hashtable<String, item> viewItem() throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Items;
    }

    private void init() {

        account a = new account("mente", 10002, 500000);
        account b = new account("fasil", 10003, 500000);
        account c = new account("mafi", 10004, 500000);
        account d = new account("mekdem", 10005, 500000);
        account e = new account("andu", 10006, 500000);
        account f = new account("nahome", 10001, 50000000);
        Accounts.put(a.AccountNo, a);
        Accounts.put(b.AccountNo, b);
        Accounts.put(c.AccountNo, c);
        Accounts.put(d.AccountNo, d);
        Accounts.put(e.AccountNo, e);
        Accounts.put(f.AccountNo, f);

        item u = new item("vitz", "vitz2008", "fasil", 5000, 5, 10003);
        item v = new item("bmw", "bmw", "andu", 5000, 5, 10006);
        item w = new item("glock", "glock19", "mekdem", 5000, 5, 10005);
        item x = new item("Toshiba", "a665", "mente", 5000, 5, 10002);
        item y = new item("motorbike", "ducat", "mafi", 5000, 5, 10004);
        item z = new item("damas", "suz15", "nahome", 5000, 5, 10001);
        Items.put(u.id, u);
        Items.put(v.id, v);
        Items.put(w.id, w);
        Items.put(x.id, x);
        Items.put(y.id, y);
        Items.put(z.id, z);

//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    item a=new item();
//    a.name="vitz";
//    a.id="vitz2001";
//    a.price=44;
//    a.quantity=5;
//    
//    Items.put(a.id,a);
//String name, String id,String postedby,float price,int quantity,int ownerAc
//        String[] ls = new String[6];
//        ls[0] = "vitz";
//        ls[1] = "vitz 2008";
//        ls[2] = "fasil";
//        ls[3] = "500";
//        ls[4] = "5";
//        ls[5] = "10001";
//        Items.put("vitz", ls);
//    
//        item b = new item("bmw", "bmwfi", "andu", 50000, 12, 10002);
//    Items.put(b.id,b);
//    
//    item c=new item("pen", "bic1", "nahome", 2.50, 20, 10003);
//    Items.put(c.id,c);
//    System.out.print(Items.get("vitz 2008").name);
//        items[0] = a;
//        items[1] = b;
//    Enumeration names;
//     names = Items.keys();
//    
//      while(names.hasMoreElements()) {
//        String str = (String) names.nextElement();
//         System.out.println(str );
//      }        
//      System.out.println();
    }

    public item[] vi() throws RemoteException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        item b = new item("bmw", "bmwfi", "andu", 50000, 12, 10002);
        return items;
    }

}
