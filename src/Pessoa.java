public class Pessoa extends Ser { // EXTENDS serve para HERDAR A CLASSE
    String sobreNome;

    public Pessoa(String nome, int idade, String sobreNome){
        super(nome, idade);
        this.sobreNome = sobreNome;
    }

    void criaMain(){

        String nomeF = "Felipe";
        Main meuMain = new Main(nomeF);
        System.out.println(meuMain.nome);

        meuMain.declaraNome();
    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é " + this.nome;
    }
}
