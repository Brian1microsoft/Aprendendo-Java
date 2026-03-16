public class Carro implements Dirigir {
    private String nome;
    private String modelo;
    private int chassi;
    private String placa;
    private String ano;

    public Carro(String nome,String modelo,int chassi,String placa,String ano){
        this.nome = nome;
        this.modelo = modelo;
        this.chassi = chassi;
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
        System.out.println("O Carro está parado");

    }

    @Override
    public void desligar() {
        System.out.println("O Carro está desligado");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Carro");
        System.out.println("Carro ligado");

    }

    @Override
    public void dirigir() {
        System.out.println("O carro está sendo dirigido");

    }
}
