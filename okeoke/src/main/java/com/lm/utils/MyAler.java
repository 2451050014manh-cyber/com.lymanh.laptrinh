/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lm.utils;

/**
 *
 * @author admin
 */
public class MyAlert {
    private static MyAlert instance;
    
    private MyAlert() {
        if (instance == null)
            instance = new MyAler();
        return instance;
    }
}
