# API Turismo Diamantina

## 📖 Sobre o projeto

A API Turismo Diamantina é uma aplicação desenvolvida em **Java** utilizando **Spring Boot** e **MySQL**, com o objetivo de promover a integração entre moradores, turistas e a cidade de **Diamantina - MG**.

O sistema disponibiliza informações sobre os principais pontos turísticos, patrimônios históricos, atrações naturais e eventos locais, permitindo o gerenciamento desses recursos por meio de uma API REST segura e escalável.

Além disso, a aplicação conta com autenticação e autorização utilizando **Spring Security** e **JWT (JSON Web Token)**, garantindo acesso seguro aos recursos da API.

---

## 🚀 Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- MySQL
- Maven

---

## ✨ Funcionalidades

- Cadastro de usuários
- Autenticação com login
- Geração e validação de Token JWT
- Controle de acesso utilizando Spring Security
- Cadastro de pontos turísticos
- Consulta de patrimônios históricos
- Gerenciamento de atrações naturais
- Cadastro e consulta de eventos locais
- Operações CRUD para gerenciamento das informações

---

## 🔐 Segurança

A API utiliza:

- Spring Security para autenticação e autorização;
- JWT para autenticação stateless;
- Proteção das rotas privadas através de tokens de acesso.

Fluxo de autenticação:

1. O usuário realiza login.
2. A API valida as credenciais.
3. Um Token JWT é gerado.
4. O token deve ser enviado no cabeçalho das requisições protegidas.

Exemplo:

```http
Authorization: Bearer seu_token_jwt
```

---

## 🗄️ Banco de Dados

Banco de dados relacional:

- MySQL

A persistência dos dados é realizada através do Spring Data JPA.

---

## ⚙️ Como executar o projeto

### Pré-requisitos

- Java 17 ou superior
- Maven
- MySQL

### Clone o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

### Configure o banco

No arquivo `application.properties` configure:

```properties
    url: jdbc:mysql://vali-mysql-ufvjm-60b2.b.aivencloud.com:26606/defaultdb?sslMode=REQUIRED
    username: ${DATABASE_USERNAME}
    password: ${DATABASE_PASSWORD}
    driver-class-name: com.mysql.cj.jdbc.Driver
```

A API estará disponível em:

```
https://vali-turismo.netlify.app/
```

---

## 📌 Endpoints principais

| Método | Endpoint | Descrição |
|---------|----------|-----------|
| POST | /v1/auth/login | Realiza login |
| POST | /v1/auth/register | Cadastra usuário |
| GET | /v1/pontoturistico/listar | Lista pontos turísticos |
| POST | /v1/pontosturistico | Cadastra ponto turístico |
| DELETE | /v1/pontosturisticos/{id} | Remove ponto turístico |

---

## 📂 Estrutura do projeto

```
src
├── config
├── controller
├── database
│   ├── model
│   └── repository
├── dto
├── exception
├── handler
├── service
└── typeEnum
```

---

## 🎯 Objetivo

Este projeto foi desenvolvido com o propósito de aplicar conceitos de desenvolvimento de APIs REST utilizando Spring Boot, segurança com JWT e persistência de dados em banco relacional, oferecendo uma solução para divulgação e gerenciamento das atrações turísticas da cidade de Diamantina-MG.

---

## 👨‍💻 Autor

Desenvolvido por **João Victor Silva Soares**.
