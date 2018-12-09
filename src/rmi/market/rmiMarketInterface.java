/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author wolfe
 */
public interface rmiMarketInterface extends Remote {
//    when a custemer buy a product they use teir bank account so we need 
//    taransfer and chek balance methods 
    
    public void transfer(int account,int amount) throws RemoteException;
    public int balance(int account) throws RemoteException;
    
    public void Add_item(item item) throws RemoteException;
    public void buy(String name) throws RemoteException;
    public void remove(String name) throws RemoteException;
    
}
