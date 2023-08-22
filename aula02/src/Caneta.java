public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("A cor da caneta é: "+this.cor);
        System.out.println("A caneta esta tampada? "+ this.tampada);
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não pode rabiscar");
        }
        else{
            System.out.println("Rabiscando");
        }
    }
}
