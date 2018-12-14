/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.market;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author wolfe
 */
public class appServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, NotBoundException, MalformedURLException{
        Registry registry = LocateRegistry.createRegistry(5099);
        registry.bind("market", new marketServant());
    }    
}
