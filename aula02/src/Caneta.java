public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("A cor da caneta é: "+this.cor);
        System.out.println("A caneta esta tampada? "+ this.tampada);
        System.out.println("Modelo da caneta: "+this.modelo);
        System.out.println("Ponta da caneta: "+this.ponta);
        System.out.println("Carga da caneta: "+this.carga);
    }

    public void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }

    protected void rabiscar(){
        if(this.tampada == true){
            System.out.println("Não pode rabiscar");
        }
        else{
            System.out.println("Rabiscando");
        }
    }
}
