public class Produto{
    private int codigo;
    private String nome;
    private int quantidade;
    private String tipo;
    private double valor;

    Produto(int codigo){
        this.codigo = codigo;
    }

    Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    Produto(int codigo, String nome, int quantidade){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto(int codigo, String nome, int quantidade, String tipo, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void vender(int vendas){

        if(this.quantidade>=vendas){
            this.quantidade = this.quantidade - vendas;
            System.out.println("Valor total da venda = "+vendas*this.valor);
        }else{
            System.err.println("Estoque insuficiente!");
        }

    }

    public void comprar(int compras){

        this.quantidade = this.quantidade + compras;
        System.out.println("Compra de "+compras+" "+this.nome+"realizada com sucesso!");

    }

    public void comprar(int compras, double novoValor){

        this.quantidade = this.quantidade + compras;
        this.valor = novoValor;
        System.out.println("Compra de "+compras+" "+this.nome+"realizada com sucesso e valor ajustado para "+novoValor+"!");

    }

    public void consultar(){

        System.out.println("-------CONSULTA-------\nCódigo: "+this.codigo+"\nNome: "+this.nome+"\nEstoque: "+this.quantidade+"\nTipo: "+this.tipo+"\nPreço: "+this.valor+"\n");

    }

    public void inserir(int codigo, String nome, int quantidade, String tipo, double valor){

        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;

    }

    public boolean igual(Produto p1){

        if(this.nome.equals(p1.nome)&&this.tipo.equals(p1.tipo)){

            return true;
        }else{

            return false;
        }

    }

}
