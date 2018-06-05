package br.com.aguiardafa.estudo.designpatterns2.bridge;

public class ExemploDoPatternBridge {

	public static void main(String[] args) {
		//Tarefas:
        Tarefa tarefaDoProgramadorJava = new ProgramacaoJava();
        Tarefa tarefaDoProgramadorRuby = new ProgramacaoRuby();
        Tarefa tarefaDoHomologadorTestesAuto = new TestesAutomatizados();
        Tarefa tarefaDoHomologadorTesteMan = new TestesManuais();
        
        // Eu gosto de programar em java, ent�o eu posso criar um programador que executa a tarefa de programar em Java
        final Colaborador programador = new Programador(tarefaDoProgramadorJava);
        programador.produz();
 
        // Eu tamb�m gosto de Ruby ent�o poderia desenvolver em Ruby!
        programador.recebeTarefa(tarefaDoProgramadorRuby);
        programador.produz();
 
        // Mas se a situa��o aperta e me pedem testes automatizados, n�o tem problema eu posso fazer tamb�m!
        programador.recebeTarefa(tarefaDoHomologadorTestesAuto);
        programador.produz();
 
        // No caso do colaborador, temos o mesmo, ele faz testes manuais
        final Colaborador homologador = new Homologador(tarefaDoHomologadorTesteMan);
        homologador.produz();
 
        // Mas se a situa��o aperta ele pode programar at� em Ruby!
        homologador.recebeTarefa(tarefaDoProgramadorRuby);
        homologador.produz();
	}

}
