# But_Med_API_REST_Spring_Boot_Alura
Curso de Spring Boot seguindo as aulas da Alura

# Projeto API REST de Gerenciamento de Médicos e Pacientes

Este é um projeto de API REST desenvolvido com base nos cursos da plataforma Alura, que tem como objetivo realizar o gerenciamento (CRUD) de médicos e pacientes. Esta API permite que você cadastre, consulte, atualize e remova médicos e pacientes de forma simples e eficiente.

## Tecnologias Utilizadas

- **Java:** A linguagem de programação utilizada para desenvolver a API.
- **Spring Boot:** Um framework que simplifica o desenvolvimento de aplicativos Java.
- **Spring Data JPA:** Facilita o acesso a bancos de dados relacionais.
- **Spring Security:** Fornece segurança para a API.
- **Banco de Dados MySQL:** Utilizado para armazenar os dados dos médicos e pacientes durante o desenvolvimento.
- **Maven:** Gerenciador de dependências para o projeto.

## Funcionalidades

A API oferece as seguintes funcionalidades:

- **Cadastro de Médicos:** Você pode criar um novo médico especificando nome, especialidade, CRM e telefone de contato.
- **Listagem de Médicos:** Recupere a lista de todos os médicos cadastrados.
- **Detalhes de um Médico:** Consulte os detalhes de um médico específico com base no seu ID.
- **Atualização de Médicos:** Atualize as informações de um médico existente.
- **Remoção de Médicos:** Remova um médico do sistema com base no seu ID.

- **Cadastro de Pacientes:** Registre um novo paciente fornecendo nome, data de nascimento, sexo e telefone.
- **Listagem de Pacientes:** Obtenha a lista de todos os pacientes registrados.
- **Detalhes de um Paciente:** Consulte os detalhes de um paciente específico com base no seu ID.
- **Atualização de Pacientes:** Atualize as informações de um paciente existente.
- **Remoção de Pacientes:** Remova um paciente do sistema com base no seu ID.



## Configuração do Banco de Dados

A API utiliza um banco de dados local (mysql) por padrão. Para configurar um banco de dados diferente, edite o arquivo `application.properties` e configure as propriedades relacionadas ao banco de dados.

## Segurança

A API utiliza o Spring Security para autenticação e autorização. Por padrão, um usuário e senha são configurados para autenticação. Certifique-se de alterar essas configurações em um ambiente de produção.

## Contribuição

Se você deseja contribuir para o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request. Todas as contribuições são bem-vindas!


