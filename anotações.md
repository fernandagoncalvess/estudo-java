<h1 align="center"> Anotações Java </h1>

## Menu

- [Orientação a Objeto](#orientação-a-objeto)
  - [Significados](#significados)
  - [Códigos](#códigos)
  - [Vetor de Objetos](#vetor-de-objetos)
  - [ArrayList](#arraylist)
  - [Persistência de dados](#persistência-de-dados)
  - [JPQL](#jpql)
  - [Serialização](#serialização)
<br>

## Regras na construção de códigos da linguagem Java
- Todas as letras iniciais dos nomes das classes tem que ser maiúsculo. Exemplo: MinhaClasse;
- Variáveis devem ser escritas com letras minúsculas, se for palavra composta a segunda palavra deve começar com letra maiúscula. Exemplo: anoFabricado;
- Usar ponto na variável double;
- Se a variavel é tipo float, tem q encerrar com um F. Exemplo: float pi = 3.14F;
- Variável constante tem q ser CAIXA ALTA. Exemplo: final double PI=3.14;
- Métodos também são escritos com letras minúsculas tirando a primeira letra da segunda palavra. Exemplo: calcularImposto();
- Nome dos pacotes:
  - Em caso de trabalho: nome.nomedaempresa.nomedoprojeto
  - Em caso de estudo: edu.seunome.temadoestudo

# Orientação a Objeto

## Códigos

  | Códigos Básicos | Significados |
  |-----------------|--------------|
  | `Scanner sc = new Scanner(System.in); ` | Ler teclado |
  | `sc.close();` | Fechando o ler teclado |
  | `Locale.setDefault(Locale.US);` | Mudar a linguagem do programa |
  | `System.out.print("Exemplo..." + exemplo);` | Imprime na tela a variável exemplo e pula linha |
  | `int numero = sc.nextInt();` | Cria uma variável tipo int e lê um numero inteiro |
  | `public static void main(String[] args){}` | Execução incial do programa, costuma ficar na classe principal |
  | `Exemplo ex = new Exemplo();` | Cria um objeto que herda todos os atributos da classe Exemplo |
  | `ex.lerDados();` | Chamando o método lerDados da classe Exemplo para o objeto ex |
  | `public void exemplo(){}`| Método |
  | `Exemplo[] exemplos = new Exemplo[10]` | Criando um vetor de objetos |
  | `this.exemplo` | Referindo-se um atributo da classe |
  | `@override` | Sobrescrevendo um método da classe mãe |
  | `super.metodo();` | Chamando um método da superclasse (classe mãe) |
  | `primeiroNome.concat(" ").concat(segundoNome);` | Concatena o primeiro e segundo nome |
<br>

<br>

## Significados 

### Classes
Classes são TAD (Tipo Abstrato de Dados). É uma descrição para um conjunto de objetos do mundo real. Exemplo: Classe Móvel, não é um móvel em si e sim uma especificação dele.

```java
public class Pessoa{
  private String nome = "Fernanda";

  public String getNome(){
    return nome;
  }
}
```
### Classe abstrata
Classe mãe que vai ser herdada. Exemplo: Existe a classe Pessoa, Aluno, Professor, ADM. As classes fazem parte de um projeto de registro de funcionários de uma escola. A classe Pessoa nunca será registrada então ela é uma classe abstrata.

### Objeto
```java
public class ExemploPessoa{
  public static void main(String[] args){
    Pessoa pessoa  = new Pessoa();
    System.out.print(pessoa.getNome());
      //Fernanda
  }
}
```


### Herança
Reaproveita classes já criadas, podendo ser modificadas pela herança sem perder a classe mãe.

```java
public class A extends B{
    //classe B é a classe mãe
}
```


### Polimorfismo
O mesmo método se comporta de maneiras diferentes


### Método Remover objeto

Esse método depende do equals() para saber quando os dois objetos são iguais.

```java
public void excluir(int posicao){
  this.nomeDaListaExe.remove(posicao);
}
```

### Vetor de Objetos

 Exemplos com um objeto Movel:
 No método localizaCategoria pode usar `==` ao invés de `equals()`.
```java
public class GerenciaMoveis{

  private Movel[ ] moveis = new Movel[10];

  public void cadastrarMoveis(){

    for(int i=0; i<10; i++){
      moveis[i] = new Movel();
      moveis[i].lerDados(); 
 }

    for(int i=0; i<10; i++){
      moveis[i].apresenterDados();
  }
}

public void localizaCategoria(String categoria){
   for(int i=0; i<10; i++){
      if(this.moveis[i].getCategoria().equals(categoria)
      this.moveis[i].apresentarDados();
  }
}

```

### ArrayList
Estrutura de dados que organiza e armazena valores na memória, não tem tamanho predefinido, aumenta conforme adiciona um objeto.

  | Códigos Básicos para Array | Significados |
  |----------------------------|--------------|
  | `private ArrayList<Exemplo>nomeDaLista`| Criando identificador para o arraylist |
  | `nomeDaLista = new ArrayList<>();` | Criando um array e alocando espaço para ele |
  | `nomeDaLista.add("Elemento");`| Adicionando um elemento no final da lista |
  | `nomeDaLista.add(0, "Elemento");` | Esta adicionando elemento a posição 0 do array |
  | `nomeDaLista.size();` | Tamanho do array |
  | `nomeDaLista.set(0, "Elemento1");` | Substitui o elemento da posição 0 |
  | `nomeDaLista.remove(0);` | Remove o elemento da posição 0 |
  | `nomeDaLista.contains("Elemento");` | Retorna True se encontrar "Elemento" na lista, caso contrário retorna false |
  | `nomeDaLista.isEmpty()` | Retorna True se a lista tiver vazia, caso contrário false |
  | `System.out.println(nomeDaLista.get(1));` | Mostra o elemento da posição 1 |
 <br>

```java
import java.util.ArrayList;

public void percorrerArrey(Movel m){
  for(Movel movel : listaMoveis){
    m.apresentarDaos();
  }
}

int indice = nomeDaLista.indexof(nomeDoElementoProcurado);

public void adicionarObjeto(Objeto o){
  this.nomeDaLista.add(o);
}

```


<a href="#menu"> Voltar ao menu</a>




# Persistência de dados

| Modelo relacional|  Modelo OO |
|------------------|------------|
| Tabela | Classe |
| Linha | Objeto |
| Coluna | Atributo |
| - | Método |
| Chave estrangeira | Associação |


# Configuração Conexão MySQL
```xml
    &amp;useSSL=false
    &amp;allowPublicKeyRetrieval=true
    &amp;createDatabaseIfNotExist=true
    &amp;serverTimezone=UTC
    &amp;serverTimezone=America/Sao_Paulo
```


### Exemplo uso do EntityManager no main

```java
public class Principal {
    
    
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Fernanda");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("nomeDaConexaoDoBancoDeDados");
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
                
        em.persist(p);
        
        em.getTransaction().commit();
        
        em.close();
        
    }
    
}

```

### Exemplo classe mapeada

```java

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable{
    
    @Id
    @Column(name="codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @Column(name = "nome", length = 50, nullable = false)
    private String nome;

    public Pessoa() {
    }
    
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

```

### Uso do find

```java
     private static void alterar() {
        EntityManager em = emf.createEntityManager();
        
        //Alteração
        Pessoa p1 = em.find(Pessoa.class, 1);
        p1.setNome("João");

        em.getTransaction().begin();
        em.merge(p1);//Altera ou cria
        em.getTransaction().commit();

        //Fecha a conexao
        em.close();
    }

```

## JPQL
`select * from veiculo` em JPQL fica:
<br>
`select v from Veiculo v` 
<br>
A sintaxe acima em JPQL significa que queremos buscar os objetos da entidade Veiculo.

```java
public class ListandoVeiculos {
public static void main(String[] args) {
    EntityManager manager = JpaUtil.getEntityManager();
    Query query = manager.createQuery("select v from Veiculo v");
    List<Veiculo> veiculos = query.getResultList();

    for (Veiculo veiculo : veiculos) {
        System.out.println(veiculo.getCodigo() + " - " veiculo.getFabricante() +
        " " veiculo.getModelo() +
        ", ano " veiculo.getAnoFabricacao() +
        "/" veiculo.getAnoModelo() + " por " "R$" + veiculo.getValor());

```

## Serialização
Transforma o estado do objeto em uma sequência de bytes, podendo ser gravado em arquivos, persistido ou transmitido pela rede. Mantém os dados além da execução do programa. 
Para isso é usado o pacote java.io, para indicar que o objeto pode ser serializado.

```java
import java.io.Serializable;


public class Vinho implements Serializable {
    private String nome;
    private String tipo;
     //gets e sets omitidos
  }

```

