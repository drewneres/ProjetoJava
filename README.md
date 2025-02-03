# Projeto Java Swing - Sistema de Gerenciamento de Bebidas

Este projeto é um sistema de gerenciamento de bebidas desenvolvido em **Java Swing (JFrame)** com integração ao banco de dados **PostgreSQL**. Ele permite o cadastro de clientes, funcionários, bebidas e registra as compras realizadas.

---

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter os seguintes itens instalados e configurados:

### 1. **Java Development Kit (JDK)**
   - Versão 8 ou superior.
   - Verifique se o Java está instalado executando no terminal:
     ```bash
     java -version
     ```
   - Caso não tenha, faça o download em [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) ou use uma distribuição open-source como [OpenJDK](https://openjdk.org/).

### 2. **PostgreSQL**
   - Banco de dados instalado e configurado.
   - Faça o download em [PostgreSQL](https://www.postgresql.org/download/).

### 3. **Driver JDBC para PostgreSQL**
   - O driver `postgresql-42.6.0.jar` (ou versão compatível) deve ser adicionado ao projeto.
   - Faça o download do driver em [PostgreSQL JDBC Driver](https://jdbc.postgresql.org/download/).
   - Adicione o arquivo `postgresql-42.6.0.jar` ao classpath do projeto.

### 4. **IDE**
   - Recomenda-se o uso de uma IDE como **IntelliJ IDEA**, **Eclipse** ou **NetBeans**.

---

## Configuração do Banco de Dados

### 1. Crie o Banco de Dados
No PostgreSQL, crie um banco de dados para o projeto:

```sql
CREATE DATABASE sistema_bebidas;
```
2. Execute as Queries de Criação das Tabelas
Conecte-se ao banco de dados sistema_bebidas e execute as seguintes queries para criar as tabelas necessárias:

```sql
CREATE TABLE clientes(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE bebida(
    codigo SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    quantidade_estoque INTEGER NOT NULL,
    tipo_bebida VARCHAR(255) NOT NULL,
    preco INTEGER
);

CREATE TABLE funcionario(
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL,
    usuario VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE compras(
    cod_compra SERIAL PRIMARY KEY,
    id_usuario INTEGER NOT NULL,
    codigo_bebida INTEGER NOT NULL,
    preco_bebida INTEGER NOT NULL,
    quantidade INTEGER NOT NULL,
    dia_compra INTEGER,
    total INTEGER,
    FOREIGN KEY (id_usuario) REFERENCES clientes (id),
    FOREIGN KEY (codigo_bebida) REFERENCES bebida (codigo)
);
```
## Configuração do Projeto
1. Importe o Projeto na IDE
Abra a IDE de sua preferência e importe o projeto como um projeto Maven ou Java existente.

2. Adicione o Driver JDBC
Adicione o arquivo postgresql-42.6.0.jar ao classpath do projeto.

```bash
IntelliJ IDEA: File > Project Structure > Libraries > + > Java > Selecione o arquivo .jar.
```

NetBeans: Project > Properties > Java Build Path > Libraries > Add External JARs.

3. Configure a Conexão com o Banco de Dados
No código Java, configure a conexão com o banco de dados. Exemplo:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/sistema_bebidas";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
```
Substitua ```seu_usuario e sua_senha``` pelas credenciais do seu banco de dados PostgreSQL.

## Como Executar o Projeto
Execute o Projeto:

Localize a classe principal (geralmente com um método main) e execute o projeto.
```bash
ProjetoJava.java
``` 

Acesse o Sistema:

O sistema deve abrir uma interface gráfica (JFrame) para interação com o usuário.

## Funcionalidades:
Cadastro de Clientes: Permite cadastrar novos clientes.

Cadastro de Funcionários: Permite cadastrar novos funcionários.

Cadastro de Bebidas: Permite cadastrar novas bebidas com preço e quantidade em estoque.

Registro de Compras: Registra compras realizadas pelos clientes, vinculando-as às bebidas e calculando o total.
