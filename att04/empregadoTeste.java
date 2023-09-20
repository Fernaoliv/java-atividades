package att04;
public class empregadoTeste {
    public static void main(String[] args) {

            empregado empregado1 = new empregado("Neemias", "Quemuel", 7000.0);
            empregado empregado2 = new empregado("Leila", "Lajes", 6000.0);
    
            empregado1.apresentar();
            System.out.println("E com 10% de aumento fico com cerca de: " + empregado1.calcularSalarioAnual10() + " por ano" );
    
            empregado2.apresentar();
            System.out.println("E com 10% de aumento fico com cerca de: " + empregado2.calcularSalarioAnual10() + " por ano");
        }
    }
    
