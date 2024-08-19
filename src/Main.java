import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ConsultaUsandoVetores consulta = new ConsultaUsandoVetores();

        consulta.adicionarPessoa("Lucas",26, 'M', 299);
        consulta.adicionarPessoa("Ana", 32, 'F', 301);
        consulta.adicionarPessoa("Carlos", 45, 'M', 302);
        consulta.adicionarPessoa("Mariana", 28, 'F', 303);
        consulta.adicionarPessoa("Felipe", 39, 'M', 304);
        consulta.adicionarPessoa("Bianca", 22, 'F', 305);

        ArrayList<Pessoas>pessoasSexo = consulta.consultarPessoasSexo('F');
        ArrayList<Pessoas>pessoasID = consulta.consultarPessoasId(299);
        ArrayList<Pessoas>pessoasIdade = consulta.ConsultarPorIdade(45);
        ArrayList<Pessoas>nomes= consulta.consultarPessoasNome("Felipe");


        //Consulta de pessoas pelo sexo: F//
        System.out.println("Consulta pessoas por sexo:  ");
        consulta.exibirPessoas(pessoasSexo);

        System.out.println("--------------------------------");
        //Consulta de pessoas pelo ID: 299//
        System.out.println("Consulta pessoas por id: ");
        consulta.exibirPessoas(pessoasID);
        System.out.println("--------------------------------");

        //Consulta de pessoas por idade: 45//
        System.out.println("Consulta pessoas por idade: ");
        consulta.exibirPessoas(pessoasIdade);
        System.out.println("--------------------------------");

        //Consulta de pessoas pelo nome: Felipe//
        System.out.println("Consulta pessoas por nome: ");
        consulta.exibirPessoas(nomes);



    }
}
