import java.util.ArrayList;
import java.util.List;

public class GerenteDePessoas {
    private List<Funcionario> funcionarios;

    public GerenteDePessoas() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void editarFuncionario(int id, Funcionario f) {
        for (Funcionario func : funcionarios) {
            if (func.getId() == id) {
                func.setNome(f.getNome());
                func.setCargo(f.getCargo());
                func.setSalario(f.getSalario());
                func.setDataAdmissao(f.getDataAdmissao());
                break;
            }
        }
    }

    public void excluirFuncionario(int id) {
        funcionarios.removeIf(func -> func.getId() == id);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public Funcionario buscarFuncionario(int id) {
        for (Funcionario func : funcionarios) {
            if (func.getId() == id) {
                return func;
            }
        }
        return null;
    }
}

