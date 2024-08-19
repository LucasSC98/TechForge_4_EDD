import java.util.ArrayList;

public class ConsultaUsandoVetores {
    private ArrayList<Pessoas> pessoaslista;

    public ConsultaUsandoVetores() {
        pessoaslista = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idadem, char sexo, int id) {
        Pessoas novaPessoa = new Pessoas(nome, idadem, sexo, id);
        pessoaslista.add(novaPessoa);
    }

    public ArrayList<Pessoas> consultarPessoasSexo(char sexo) {
        ArrayList<Pessoas> pessoasSexo = new ArrayList<>();
        for (Pessoas pessoa : pessoaslista) {
            if (pessoa.getSexo() == sexo) {
                pessoasSexo.add(pessoa);
            }
        }

        return pessoasSexo;
    }

    public ArrayList<Pessoas> consultarPessoasId(int id) {
        ArrayList<Pessoas> pessoasId = new ArrayList<>();
        for (Pessoas pessoa : pessoaslista) {
            if (pessoa.getid() == id){
                pessoasId.add(pessoa);
            }
        }
        return pessoasId;
    }

    public ArrayList<Pessoas> consultarPessoasNome(String nome) {
        ArrayList<Pessoas> pessoasNome = new ArrayList<>();
        for (Pessoas pessoa : pessoaslista) {
            if (pessoa.getNome().equals(nome)) {
                pessoasNome.add(pessoa);
            }
        }
        return pessoasNome;
    }
    public ArrayList <Pessoas> ConsultarPorIdade(int idade) {
        ArrayList<Pessoas> pessoasIdade = new ArrayList<>();
        for (Pessoas pessoa : pessoaslista) {
            if (pessoa.getIdade() == idade) {
                pessoasIdade.add(pessoa);
            }
        }
        return pessoasIdade;
    }
    public void excluirPessoa(Pessoas pessoa) {
        pessoaslista.remove(pessoa);
    }

    public void exibirPessoas(ArrayList<Pessoas> pessoas) {
        for (Pessoas pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome()+" Idade: " + pessoa.getIdade()+ " Sexo: " + pessoa.getSexo() + " Id: " + pessoa.getid());
        }
    }
}
