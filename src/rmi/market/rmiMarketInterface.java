/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author wolfe
 */
public interface rmiMarketInterface extends Remote {
//    when a custemer buy a product they use teir bank account so we need 
//    taransfer and chek balance methods 
    
    public void transfer(int SenderAccountNo,int ReciverAccountNo,double amount) throws RemoteException;
    public account balance(int account) throws RemoteException;
    
    public void Add_item(item i) throws RemoteException;
    public void buy(String id,int b) throws RemoteException;
    public void remove(String name,int ac) throws RemoteException;
    public Hashtable<String,item>  viewItem() throws RemoteException;
//    public item[] vi() throws RemoteException;

    
}
