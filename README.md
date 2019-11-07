
Projeto de API Restful usando Spring Boot, Postgresql, JPA e Hibernate. Para disponibilização dos dados de Artistas e Álbuns

### Documentação de referência
Para referência adicional, considere as seguintes seções:

* [Documentação oficial do Apache Maven] (https://maven.apache.org/guides/index.html)
* [Guia de Referência do Spring Boot Maven Plugin] (https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/maven-plugin/)
* [Spring Boot DevTools] (https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web] (https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA] (https://docs.spring.io/spring-boot/docs/2.2.0.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guias
Os seguintes guias ilustram como usar alguns recursos concretamente:

* [Criando um serviço da Web RESTful] (https://spring.io/guides/gs/rest-service/)
* [Como exibir conteúdo da Web com o Spring MVC] (https://spring.io/guides/gs/serving-web-content/)
* [Criando serviços REST com Spring] (https://spring.io/guides/tutorials/bookmarks/)
* [Acessando dados com JPA] (https://spring.io/guides/gs/accessing-data-jpa/)


# Pré-Requisitos
- Java - 1.8.x
- Maven - 3.x.x
- postgresql-12.x.x (x64)
- jdk-13.x.x (x64)
- jre (x64)


# Setup de Configuração 

1. Clonar o repositório
```
git clone --recursive https://github.com/lealzora/musicbox
```

2. Criar base de dados no Postgresql
```
create database Musica
```

3. Alterar usuário e senha para acessar o banco de dados.
- Abrir o arquivo:```src/main/resources/application.properties```
- Modificar ```spring.datasource.username``` e ```spring.datasource.password``` com os dados da sua instação

4. Executar o script de banco de dados ```Carga Inicial.sql``` localizado na pasta ```data``` na raiz do projeto

5. Rodar o Projeto





