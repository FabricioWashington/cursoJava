// Esta class esta associada a ExercicioFixacao.java
package ExercicioList.entities;

public class Funcionarios {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios() {
    }

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void increaseSalary(double percentage) {
        setSalario((Double) (getSalario() + getSalario() * percentage / 100.0));
    }

    public String toString() {
        return getId() + ", " + getNome() + ", " + String.format("%.2f", getSalario());
    }
}
