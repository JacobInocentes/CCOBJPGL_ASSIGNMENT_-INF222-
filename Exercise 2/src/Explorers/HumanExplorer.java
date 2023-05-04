package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
   public void visit(Mars mars) {
      System.out.println("Ate a pizza in Mars");

   }

   public void visit(Saturn saturn) {

      System.out.println("Ate a pizza in Saturn");
   }

   public void visit(Mercury mercury) {
      System.out.println("Ate a pizza in Mercury");
   }

   public void visit(Earth earth) {
      System.out.println("Ate a pizza in earth");
   }

   public void visit(Jupiter jupiter) {
      System.out.println("Ate a pizza in jupiter");
   }

   public void visit(Venus venus) {
      System.out.println("Ate a pizza in Venus");
   }

   public void visit(Neptune neptune) {
      System.out.println("Ate a pizza in Neptune");
   }

   public void visit(Pluto pluto) {
      System.out.println("Ate a pizza in Pluto");
   }

   public void visit(Uranus uranus) {
      System.out.println("Ate a pizza in Uranus");
   }
}