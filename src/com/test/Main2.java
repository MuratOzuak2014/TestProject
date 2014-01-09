/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

/**
 *
 * @author user
 */
public class Main2 {
        public static void main(String[] args) {
        Pamuk hammadde = new Pamuk ();
        
        IplikMakinesi makine = new IplikMakinesi ();
        Iplik iplik = makine.pamuguIplikYap(hammadde);
    }
}