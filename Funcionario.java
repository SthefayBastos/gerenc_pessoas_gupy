public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private int dataAdmissao;

    // Construtor
    public Funcionario(int id, String nome, String cargo, double salario, int dataAdmissao) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(int dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
