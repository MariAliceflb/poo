public class empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        }else {
            this.salarioMensal = 0;
        }
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
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0;
        }
    }
    public void forneceAumento() {
        this.salarioMensal *= 1.1;
    }


}

