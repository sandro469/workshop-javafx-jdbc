# Workshop JavaFX + JDBC

Aplicação desktop desenvolvida em **Java** utilizando **JavaFX**, **JDBC** e **MySQL**, baseada no workshop de Java do professor Nelio Alves.

O projeto implementa um sistema de cadastro com operações completas de **CRUD (Create, Read, Update e Delete)**, utilizando o padrão **DAO (Data Access Object)** para acesso ao banco de dados.

## 🚀 Tecnologias utilizadas

* Java
* JavaFX
* JDBC
* MySQL
* MySQL Workbench
* Eclipse IDE
* Scene Builder
* Git
* GitHub

## 📋 Funcionalidades

### Department

* ✔ Listar departamentos
* ✔ Inserir departamento
* ✔ Atualizar departamento
* ✔ Excluir departamento

### Seller

* ✔ Listar vendedores
* ✔ Inserir vendedor
* ✔ Atualizar vendedor
* ✔ Excluir vendedor

## 🗄 Banco de Dados

O projeto utiliza um banco de dados MySQL com as tabelas:

* Department
* Seller

A conexão é realizada através do arquivo:

```properties
db.properties
```

Exemplo:

```properties
user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSL=false
```

## ▶ Como executar

1. Clone este repositório:

```bash
git clone https://github.com/sandro469/workshop-javafx-jdbc.git
```

2. Importe o projeto no Eclipse.

3. Crie o banco de dados MySQL utilizando os scripts do projeto.

4. Configure o arquivo `db.properties` com suas credenciais.

5. Execute a classe principal da aplicação.

## 📂 Estrutura do projeto

```
src
 ├── application
 ├── db
 ├── gui
 ├── gui.listeners
 ├── gui.util
 ├── model
 │    ├── dao
 │    ├── dao.impl
 │    ├── entities
 │    └── exceptions
```

## 📚 Conceitos praticados

* Programação Orientada a Objetos (POO)
* JavaFX
* FXML
* Scene Builder
* JDBC
* DAO Pattern
* Eventos
* Controllers
* Tratamento de Exceções
* MySQL
* Git e GitHub

## 📸 Imagens

Você pode adicionar aqui capturas de tela da aplicação.

Exemplo:

* Tela principal
* Cadastro de vendedores
* Cadastro de departamentos

## 👨‍💻 Autor

**Sandro**

GitHub:
https://github.com/sandro469

---

Projeto desenvolvido para fins de estudo e prática das tecnologias Java, JavaFX, JDBC e MySQL.
