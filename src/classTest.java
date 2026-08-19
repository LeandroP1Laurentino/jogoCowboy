public class Personagens {
    public String nome, poder, cor;
    public int vida, moedas, tempo, balas, pontos;
    public double vidas;

     // constructor

 public Personagens(String nome, int balas, String cor, int pontos, double vidas) {
    this.nome = nome;
    this.balas = balas;
    this.cor = cor;
    this.pontos = pontos;
    this.vidas = vidas;
 }


    public void pular(String direcao) {
        System.out.println("-> " + this.nome + "pulou para" + direcao + "!");
    }
    public void andar(String direcao) {
        System.out.println("->" + this.nome + "andou para " + direcao + ".");

    }
    public void correr() {
        System.out.println("");

    }
    public void tomarDano() {
        if(this.vidas > 0.5){
            this.vidas -= 0.5;
            System.out.println(" OUCH " + this.nome + "tomou dano, vidas restantes: " + this.vidas);
        }else {
            this.vidas = 0;
            System.out.println("GAME OVER!"+ this.nome + "foi derrotado");
        }

    }
    public void exibirStatus() {
        System.out.println("[" + this.nome + " | Traje: " + this.cor + "| Balas: " + this.balas + "| Pontos: " + this.pontos + "| Vidas: " + this.vida + "]" );
    }
    public void atirar() {
        if(this.balas > 0) {
            this.balas--;
            System.out.println("Bang!" + this.nome + "atirou! Balas restantes: " + this.balas);
        }
        else {
            System.out.println(" CLICK !" + this.nome + "tentou atirar, mas está sem balas!");
        }
    }
    public void pontuar(int pontosGanhos){
        this.pontos += pontosGanhos;
        System.out.println("+" + this.nome + "ganhou" + "pontos. Total: " + this.pontos);
    }
    public void pisar() {

    }
    private void causarDano() {

    }
    public void morrer() {

    }

}


public class Main {
    public static void main(String[] args) {
        Personagens  p1= new Personagens("Leandro", 10, "amarelo", 10, 5);


    }
}
