import java.util.ArrayList;

// MODIFICADORES DE ACESSO
// são responsáveis por determinar o nível de visibilidade das classes, atributos e métodos
// public:
// private:
// protect

public class Main {

// ATRIBUTOS
    String nome;
    static String nome2;

// CONSTRUTOR - este método é chamado toda vez que uma nova instância da Classe for CRIADA!
    public Main(String nome){
        this.nome = nome; // concede valor ao atributo da instância criada
    }

    static void teste(){}

    void declaraNome(){
        nome = "Ian Costa";
        System.out.println(nome2);
        Main.teste(); // Pode-se chamar outro método mesmo já dentro de um método
   }

    String getNome(){
        return nome;
    }

    public static void main(String[] args) {

    // SINTAXE BÁSICA
        // byte, short, int, long;  Tipos inteiros com diferentes faixas de representação
        // char, String;            O string não é um tipo primitivo
        // double e float;
        // boolean eBrasileiro = true;

    // FORMAS DE DECLARAÇÃO
        var idade = 2;// O tipo VAR serve para declarar variáveis de escopo LOCAL

        int data_nascimento = 16012002;
        // data_nascimento = "dezesseis ..." -> Não se pode devido java ser fortemente tipado

        String nome;
        nome = "Ian Felipe Oliveira da Costa";

    // CONDICIONAIS
        if (idade > 22) {
            System.out.println("Maior");
        } else if (idade == 22) {
            System.out.println("Igual");
        } else {
            System.out.println("Menor");
        }

    // ARRAYs
        // Como declarar? Arrays FIXOS
        int[] idades = { 1, 2, 3};
        int[] idades2 = new int[10];
        idades[0] = 4;
        String[] nomes = new String[10];
        //idades.length;

    // ARRAYLIST

        // É uma lista de tamanho DINÂMICO
        // É uma classe de uma biblioteca padrão do JAVA UTIL
        ArrayList<Integer> idades3 = new ArrayList<Integer>();

        idades3.add(22); // Adicionando números no Array List
        idades3.add(50);
        idades3.add(75);
        idades3.add(10);
        idades3.size();
        //idades3.remove;
        idades3.size();
        System.out.println(idades3.get(1));

    // LOOPS
        for ( var i = 0; i < idade; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < idade) {
            System.out.println(i);
            i++;
        }

    // CASTING - transforma tipos de variáveis

        int idade4 = 30;
        double idade5 = idade4; // int em double
        idade4 = (int) idade5; // double em int

        char letra = 'a';
        String nome2 = String.valueOf(letra); // char em String
        letra = nome2.charAt(0); // String em Char
        String nome3 = String.valueOf(idade4);

        idade4 = Integer.parseInt(nome3);
        System.out.println(idade4);

    // criando objeto do tipo Pessoa que é uma classe filha da classe Ser
        String sobreNome;
        String nomeDono;
        Ser minhaProfessora = new Pessoa(nome="Fernanda",  idade=22, sobreNome="Kipper");
        Ser meuCachorro = new Cachorro(nome="Truffaut",  idade=4, nomeDono="Manu");
        System.out.println(minhaProfessora.saudacao());
        System.out.println(meuCachorro.saudacao());

    }
}