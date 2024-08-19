public class Pessoas {
    private String nome;
    private Integer idade;
    private Character sexo;
    private Integer id;

    public Pessoas(String nome, Integer idade, Character sexo, Integer id) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.id = id;
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;

    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public Character getSexo() {
        return sexo;
    }
    public void setSexo(Character sexo) {
        this.sexo = sexo;

    }
    public Integer getid() {
        return id;

    }
    public void setId(Integer id) {
        this.id = id;
    }

}
