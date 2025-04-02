class Programa {
    public static void main(String[] args){

        Produto produto1 = new Produto(001);                                                                 //Criação de instâncias usando todos os construtores criados e exibindo-as
        produto1.inserir(1,"Jogo Batalha Naval", 10, "jogo",100);
        produto1.consultar();

        Produto produto2 = new Produto(002, "Jogo Master");
        produto2.inserir(2,"Jogo Master", 20, "jogo",150);
        produto2.consultar();

        Produto produto3 = new Produto(003, "Jogo Quebra-Cabeça",30);
        produto3.inserir(3,"Jogo Quebra-Cabeça", 30, "jogo",50);
        produto3.consultar();

        Produto produto4 = new Produto(1,"Jogo Batalha Naval", 10, "jogo",100);
        produto4.consultar();
        
        produto2.comprar(10);                                                                               //Teste de método comprar com 1 parametro
        produto2.consultar();

        produto3.comprar(30,75);                                                                  //Teste de método comprar com 2 parametro
        produto3.consultar();

        if(produto1.igual(produto4)){                                                                               //Comparações usando o método "igual"

            System.out.println("O produto 1 é igual ao produto 4");
        
        }else{

            System.out.println("Algo deu errado! = (");

        }

        if(produto2.igual(produto3)){

            System.out.println("Algo deu errado! = (");
        
        }else{

            System.out.println("O produto 2 é diferente do produto 3");

        }

    }

}