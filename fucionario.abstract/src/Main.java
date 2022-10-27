import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente();
        Funcionario funcionario2 = new programador();
        funcionario1.setNome("Renato");
        funcionario1.setSalario(10000.00);
        funcionario2.setNome("lucas");
        funcionario2.setSalario(10000.00);
        ArrayList <Funcionario> funcionarios= new ArrayList<>();
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        for(Funcionario f : funcionarios){
            System.out.println(f);
            f.aumentaSalario();
            System.out.println(f);
        }
    }
}