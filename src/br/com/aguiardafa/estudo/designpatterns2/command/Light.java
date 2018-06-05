package br.com.aguiardafa.estudo.designpatterns2.command;

/** Classe recebedora */
public class Light {

   public void turnOn() {
      System.out.println("A luz está ligada");
   }

   public void turnOff() {
      System.out.println("A luz está desligada");
   }
}
