<h1 align="center"> Anotações Java </h1>

## Menu

- [Orientação a Objeto](#orientação-a-objeto)
  - [Significados](#significados)
  - [Códigos](#códigos)
  - [Vetor de Objetos](#vetor-de-objetos)
  - [ArrayList](arraylist)
<br>




# Orientação a Objeto

## Significados

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
  
  
  


  ### Vetor de Objetos
 
   ```
Movel[ ] moveis = new Movel[10];

for(int i=0; i<10; i++){
    moveis[i] = new Movel();
    moveis[i].lerDados(); 
 }

for(int i=0; i<10; i++){
    moveis[i].apresenterDados();
}

```

### ArrayList

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
  | ``
 

```
import java.util.ArrayList;

for(String s : nomeDaListaExe)  {
System.out.println(s);
}

int indice = nomeDaLista.indexof(nomeDoElementoProcurado);

public void adicionarObjeto(Objeto o){
  this.nomeDaLista.add(o);
}

```

### Método Remover objeto

Esse método depende do equals() para saber quando os dois objetos são iguais.

```
public void excluir(int posicao){
this.nomeDaListaExe.remove(posicao); }
```



