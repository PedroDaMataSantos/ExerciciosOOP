package br.com.domain;

    public class SistemaRH {

    //Criando Funcionrios-Poliformismo
    public static void main(String[] args) {

    Funcionario[] funcionario = new Funcionario[3];


        Desenvolvedor dev = new Desenvolvedor(
        "Ana",
        "DEV001",
        3000.0, 
        50, 
        50.0);

        dev.registrarHorasExtra(10);
        funcionario[0] = dev;

        Gerente gerente = new Gerente(
        "Carlos", 
        "GER001",
        1000.0, 
        5000.0,
        2000.0);

        gerente.setBonusPerformance(1000.0);
        gerente.setComissao(500.0);
        funcionario[1] = gerente;

        Estagiario estagiario = new Estagiario(
        "Maria", 
        "EST001", 
        20.0, 
        35);

        estagiario.registrarHoras(35);
        funcionario[2] = estagiario;

        System.out.println("=== FFOLHA PAGAMENTO ===");
        double totalFolha = 0.0;

        for (Funcionario func : funcionario) {
            func.exibirDados();
            totalFolha += func.calcularSalario();
             System.out.println("----");



        }
        
             System.out.println("TOTAL FOLHA " + totalFolha);

             //Demonstrando polimorfismo
                System.out.println("\n=== DEMONSTRAO POLIMORFISMO ===");
                
                for(Funcionario func : funcionario){
                    System.out.println(func.getNome() + "- Salario R$"+ func.calcularSalario());
                    }
                }






    }

    

