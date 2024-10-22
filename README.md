# Projeto web services com Spring Boot e JPA com Hibernate
## Propósito do projeto:
- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções
## Tecnologias utilizadas
### Back-end
🔸 Java


🔸 Spring Boot


🔸 Apache Tomcat


🔸 Maven


🔸 H2


🔸 Postman


O foco desta aplicação é o desenvolvimento de um sistema para gerenciar entidades de negócio, permitindo a definição de diferentes tipos de relacionamentos entre elas, como "um para muitos" e "muitos para um". Para isso, foi utilizada uma arquitetura em camadas lógicas, que roda em um servidor.  A camada Resource, implementada com controladores REST (Representational State Transfer), faz a interface entre o usuário e o "Back End" da aplicação,  processando as requisições e retornando as respostas adequadas.  A comunicação entre as camadas Resource, Serviços e Acesso a Dados se dá de forma integrada,  permitindo a manipulação eficiente das entidades.

Um banco de dados relacional foi configurado e populado para fins de teste,  e as operações de CRUD (criar, recuperar, atualizar e deletar) foram implementadas para garantir a gestão completa das entidades.  A aplicação também inclui mecanismos de tratamento de exceções para prevenir e lidar com erros durante a execução.  Com a implementação do modelo de domínio,  os objetos são instanciados e persistidos automaticamente no banco de dados relacional.

As seguintes ferramentas foram utilizadas no desenvolvimento do projeto:

Spring Boot: Framework base para a construção da aplicação.
Apache Tomcat: Servidor web responsável por hospedar a aplicação.
Maven: Ferramenta para gerenciamento de dependências do projeto.
H2: Banco de dados em memória utilizado nos testes.
Postman: Ferramenta para realização de testes nas requisições HTTP.
Postgres: Banco de dados relacional escolhido para o ambiente de produção.


# Layout:
![Layout](https://github.com/user-attachments/assets/7bfb9961-2edf-44d6-862f-5ec1ff1ce616)


## Camadas lógicas:
![logical layers](https://github.com/user-attachments/assets/4462632a-28f6-4230-8e59-216524580141)


## Modelo conceitual:
![Domain Model ](https://github.com/user-attachments/assets/1f44deed-2044-486b-ad6b-55d85af5c475)
![Domain Instance ](https://github.com/user-attachments/assets/70cf809d-3084-4ecf-9fdc-16332ec45046)

