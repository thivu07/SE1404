/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import util.MyToys;

/**
 *
 * @author THANH THI
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("5! = " + MyToys.cF(5)); //hope 120
        System.out.println("6! = " + MyToys.cF(6)); //expected 720
        System.out.println("0! = " + MyToys.cF(0)); //expected 1     
        System.out.println("-5! = " + MyToys.cF(-5)); //banh
        //JVM sẽ giết app, ném ra ngoại lệ của chính mình
        //báo user đưa tham số sai so với điều kiện
    }
    
}

//hay phải là kĩ thuật máu sắc
