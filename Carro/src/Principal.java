public class Principal
{
    public static void main(String[] args) {
    Carro carro = new Carro("Fiat", "Gol");
    carro.andar();
    

    Bomba bomba = new Bomba("Gasolina");
    bomba.abastecer(new Carro("Fiat", "Gol")); // O Carro Fiat Gol está sendo abastecido 
    //com Gasolina

    Posto posto = new Posto(3);
    Caminhao caminhao = new Caminhao("Mercedes", "1318", 16);
    
    try {
    Bomba bombaDisponivel = posto.bombaDisponivel();
    bombaDisponivel.abastecer(caminhao);
    } catch (Exception e) {
    System.err.println(e.getMessage());
 }
 }
 }
 


