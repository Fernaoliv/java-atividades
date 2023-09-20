package att04;

public class empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private static double salarioAnual;
    

    public empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void apresentar() {
        salarioAnual = salarioMensal * 12;
        System.out.println("Olá, eu sou " + nome + " " +  sobrenome + " e ganho " + salarioAnual + " por ano.");
    }

    public static double calcularSalarioAnual10() {
        double salarioAnual10 = salarioAnual * 1.10;
        return salarioAnual10;
    }
}
