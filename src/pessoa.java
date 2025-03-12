public class pessoa {
    private String nome;
    private String cpf;
    private int anoNascimento;
    private double altura;

    public pessoa(String nome, String cpf, int anoNascimento, double altura){
        this.nome = nome;
        this.cpf = cpf;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int calcularIdade(int anoAtual) {
        return anoAtual - this,anoNascimento;
    }

    public void mostrar() {
        int idade = calcularIdade(2025);
        System.out.println("nome:"+ nome);
        System.out.println("cpf:"+cpf);
        System.out.println("ano de nascimento:"+anoNascimento);
        System.out.println("altura:"+altura+"m");;
        System.out.println("idade:"+idade +" anos");

    }

}

