# Primeiro exemplo de Dynamodb com Java

A base para este exemplo é Guide "Building an Application with Spring Boot" do Spting, mas eu copiei daqui...

https://github.com/flaviomicheletti/java-spring/tree/master/01-building-application-with-spring-boot

Seguindo a documentação da AWS

https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/GettingStarted.Java.html

Eu atualizei as dependências (pom) coforme documentação.

https://docs.aws.amazon.com/pt_br/sdk-for-java/v1/developer-guide/setup-project-maven.html



### Leitura adicional

Código utilizados na documentação da AWS.

https://github.com/aws-samples/aws-dynamodb-examples/tree/master/src/main/java/com/amazonaws/codesamples/gsg



### Criando tabela

Código

	MoviesCreateTable dyna = new MoviesCreateTable();
	dyna.criar_tabela();

Resultado

	Attempting to create table; please wait...
	Success.  Table status: ACTIVE



### Carregar dados de amostra

Fazer download do arquivo `moviedata.zip` segundo a [documentação](https://docs.aws.amazon.com/pt_br/amazondynamodb/latest/developerguide/GettingStarted.Java.02.html#GettingStarted.Java.02.01).

Código

	MoviesLoadData dyna = new MoviesLoadData();
	dyna.ler_dados();  

Resultado

	PutItem succeeded: 2013 Rush
	PutItem succeeded: 2013 Prisoners
	PutItem succeeded: 2013 The Hunger Games: Catching Fire
	PutItem succeeded: 2013 Thor: The Dark World
	PutItem succeeded: 2013 This Is the End
	PutItem succeeded: 2013 Insidious: Chapter 2
	PutItem succeeded: 2013 World War Z
	PutItem succeeded: 2014 X-Men: Days of Future Past



### à fazer

terminar os demais exemplos !!!



