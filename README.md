# SimpleAndroidTests
Olá aventureiros. Estou estudando testes automatizados no android e, como a melhor forma de aprender é implementando, resolvi criar esse projeto. 

Os casos de teste, bem como as classes estão sendo implementados tanto em Java quanto em Kotlin. Na lista abaixo quando eu termino de implementar um caso em java eu marco como Java ok (Jok) e em Kotlin como Kok.

No projeto, as classes também seguem essa nomenclatura. As classes começam com J e K respectivamente.

O projeto em si, não faz nada. Ainda está com a tela gerada pelo android.

Para executar os testes no projeto, selecione uma classe de teste, clique com o botão direito e depois e run. Por exemplo run JClasseEstaticaTest.


## Roadmap com JUnit:

1. Casos simples:
    1. Método de classe retornando uma string fixa - Jok, Kok
    1. Método de classe fazendo uma operação - Jok, Kok
    1. Método de classe fazendo uma operação com double - Jok, Kok 

1. Utilizando AssertThat
    1. Método de classe retornando uma string fixa - Jok, Kok
    1. Método de classe fazendo uma operação com double - Jok, Kok 

1. Testando métodos estáticos
    1. Testar retorno de um método estático - Jok, Kok

1. Utilizando o mockito:
    1. Mockar o resultado de uma chamada - Jok, Kok
    1. Método recebe uma callback e teste verifica se esta foi chamada - Jok, Kok
    1. Método recebe uma expressao lambda e teste verifca se esta foi chamada - Kok*
    1. Mockar um método estático - Jok**

1. Singleton
    1. Mockar um método dentro do singleton - Jok, Kok***


* Não encontrei uma forma de um método aceitar lambda em java. Pelo que eu entendi, se, em java você recebe uma interface que só tem um método, na chamada você já pode passar como lambda. Com isso o teste iria ficar identico ao teste "Método recebe uma callback e teste verifica se esta foi chamada".

**Consegui com o Java utilizando o PowerMockito. No entanto, gera um warning. No curso da Alura: "Testes no Android: mocks e integrações" a recomendação é evitar métodos estáticos.

*** É possível mockar um método de um singleton, mas apenas em uma determinada instância. Não é possível mockar de modo geral. Veja JSingletonTest.deve_RetornarMock_QuandoChamarOMetodoGetStringMockado

## Dificuldades encontradas

1. O exemplo "Método recebe uma expressao lambda e teste verifca se esta foi chamada" costuma dar um erro:

``` 
org.mockito.exceptions.base.MockitoException: 
Cannot mock/spy class com.example.simpleandroidtests.kotlin.KClasseModeloTest$deve_chamarExpressaoLambda_QuandoOParametroDeEntradaForMaiorQue5$function$1
Mockito cannot mock/spy because :
 - final class
```
Para corrigí-lo foi necessário criar o arquivo

```
app/src/test/resources/mockito-extensions/org.mockito.plugins.MockMaker
```

E nele inserir o conteúdo:
```
mock-maker-inline
```

Para mais detalhes:

https://blog.mindorks.com/mockito-cannot-mock-in-kotlin


## Roadmap com Espresso:

Por ora, para o espresso não vi sentido em fazer tudo para Java e Kotlin. Portanto estou inicialmente fazendo apenas em kotlin.

1. Casos simples:
   1. Descobrir se uma view está aparecendo na tela - Kok
   1. Matches personalizados


## Ambiente
Para realizar esses testes utilizei o Android Studio Arctic Fox (2020.3.1) com a JRE 11.0.10