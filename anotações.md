<h1 align="center"> Anotações Java </h1>

## Menu

- [Orientação a Objeto](#orientação-a-objeto)
  - [Significados](#significados)
  - [Códigos](#códigos)
  - [Vetor de Objetos](#vetor-de-objetos)
  - [ArrayList](#arraylist)
<br>

# Orientação a Objeto

## Códigos

  | Códigos Básicos | Significados |
  |-----------------|--------------|
  | `Scanner sc = new Scanner(System.in); ` | Ler teclado |
  | `sc.close();` | Fechando o ler teclado |
  | `Locale.setDefault(Locale.US);` | Mudar a linguagem do programa |
  | `System.out.print("Exemplo..." + exemplo);` | Imprime na tela a variável exemplo e pula linha |
  | `int hora_inicial = sc.nextInt();` | Cria uma variável tipo int e lê um numero inteiro |
  | `public static void main(String[] args){}` | Execução incial do programa, costuma ficar na classe principal |
  | `Exemplo ex = new Exemplo();` | Cria um objeto que herda todos os atributos da classe Exemplo |
  | `ex.lerDados();` | Chamando o método lerDados da classe Exemplo para o objeto ex |
  | `public void exemplo(){}`| Método |
  | `Exemplo[] exemplos = new Exemplo[10]` | Criando um vetor de objetos |
  | `this.exemplo` | Referindo-se um atributo da classe |
  | `@override` | Sobrescrevendo um método da classe mãe |
  | `extends` | Sinalizando herança |
  | `super.metodo();` | Chamando um método da superclasse (classe mãe) |
<br>
<br>

## Significados 

### Classes
Classes são TAD (Tipo Abstrato de Dados). É uma descrição para um conjunto de objetos do mundo real. Exemplo: Classe Móvel, não é um móvel em si e sim uma especificação dele.

```java
public class Pesso{
  private String nome = "Fernanda";

  public String getNome(){
    return nome;
  }
}
```

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
  | `nomeDaLista.add(0, "Elemento");` | Esta adicionando claudia a posição 0 do array |
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




