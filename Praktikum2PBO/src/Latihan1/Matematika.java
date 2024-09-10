/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1;

public class Matematika implements InterfaceMatematika{
    int a, b;
     
    public Matematika(int a, int b){
         this.a = a;
         this.b = b;
    }
     
    @Override
    public void pertambahan(){
        System.out.println("Pertambahan: " + a + " + " + b + " = "+ (a+b));
    }
    
    @Override
    public void pengurangan(){
        System.out.println("Pengurangan: " + a + " - " + b + " = "+ (a-b));
    }
    
    @Override
    public void perkalian(){
        System.out.println("Perkalian: " + a + " * " + b + " = "+ (a*b));
    }
    
    @Override
    public void pembagian(){
        System.out.println("Pembagian: " + a + " / " + b + " = "+ (a/b));
    }
}
