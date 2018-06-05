package br.com.aguiardafa.estudo.designpatterns2.bridge;

public interface Colaborador {
	 
    void produz();
 
    void recebeTarefa(Tarefa tarefa);
 
}