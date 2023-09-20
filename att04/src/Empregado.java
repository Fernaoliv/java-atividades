public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    /* Construtor */
    public EmpregadoTeste(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    /* Métodos de acesso (getters e setters) */
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

    /* Método para calcular o salário anual */
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    /* Método para aplicar um aumento de 10% no salário */
    public void aplicarAumentoSalario() {
        salarioMensal *= 1.10; /* Aumento de 10% */
    }
}

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    /* Construtor */
    public Empregados(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    /* Métodos de acesso, getters e setters */ 
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

    /* Método para calcular o salário anual */
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    /* Método para aplicar um aumento de 10% no salário */
    public void aplicarAumentoSalario() {
        salarioMensal *= 1.10; /* Aumento de 10% */
    }


    public class EmpregadoTeste {
        public static void main (String[] args){
            
        }
    }