package br.com.aguiardafa.estudo.designpatterns2.command;

import java.util.ArrayList;
import java.util.List;

/** Classe invocadora */
public class Switch {
   private List<Command> history = new ArrayList<Command>();

   public void storeAndExecute(Command cmd) {
      this.history.add(cmd); // optional 
      cmd.execute();
   }
}
