📋 aplicação para gestão de pagamentos e lançamentos financeiros.

<div align="center"> 
  <img src="https://img.shields.io/badge/Spring-000000?style=for-the-badge&logo=Spring" alt="Spring" /> 
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" /> 
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" /> 
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /> 
</div>
  
📌 Descrição
Sistema de cadastro e lançamentos de despesas desenvolvido em Java com Spring. 

✔ Cadastro de consultas
✔ API RESTful 
✔ Integração com banco de dados PostgreSQL
✔ Pronto para deploy em containers Docker

🚀 Tecnologias
Backend: Quarkus (Java)
Banco de Dados: PostgreSQL
Containerização: Docker

🗃️ Estrutura do Banco de Dados
1. Tabela usuarios
Coluna	Tipo	Descrição	Restrições
id	UUID	Identificador único	PRIMARY KEY, NOT NULL
nome	VARCHAR(100)	Nome completo	NOT NULL
email	VARCHAR(255)	E-mail	UNIQUE, NOT NULL
senha_hash	TEXT	Hash da senha (bcrypt)	NOT NULL
criado_em	TIMESTAMP	Data de criação	DEFAULT CURRENT_TIMESTAMP


🛠️ Como Executar
Pré-requisitos
Java 17+
Docker (opcional)
Maven

### **✅ Funcionalidades**<br>
✔ Cadastro de consultas<br>
✔ API RESTful com documentação OpenAPI/Swagger<br>
✔ Integração com banco de dados PostgreSQL<br>
✔ Pronto para deploy em containers Docker



## **📊 Endpoints Principais**

| Método | Rota               | Descrição                     |
|--------|--------------------|-------------------------------|
| POST   | `/consultas`       | Agenda uma nova consulta      |
| GET    | `/consultas/{id}`  | Busca consulta por ID         |

<div align="center"> <p>✨ Desenvolvido por <strong>Marcos Morais</strong></p> <a href="https://github.com/seu-usuario">GitHub</a> | <a href="https://linkedin.com/in/seu-perfil">LinkedIn</a> </div>
