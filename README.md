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

## 🗃️ Estrutura do Banco de Dados

### 1. Tabela `usuarios`  
**Descrição:**  
Armazena os dados dos usuários cadastrados no sistema.  

**Estrutura:**  
| Coluna       | Tipo         | Restrições               | Descrição               |
|--------------|--------------|--------------------------|-------------------------|
| `id`         | `UUID`       | `PRIMARY KEY, NOT NULL`  | Identificador único     |
| `nome`       | `VARCHAR(100)`| `NOT NULL`              | Nome completo           |
| `email`      | `VARCHAR(255)`| `UNIQUE, NOT NULL`      | E-mail de acesso        |
| `senha_hash` | `TEXT`       | `NOT NULL`              | Hash bcrypt da senha    |
| `criado_em`  | `TIMESTAMP`  | `DEFAULT CURRENT_TIMESTAMP` | Data de cadastro     |

**Exemplo de INSERT:**  
```sql
INSERT INTO usuarios (id, nome, email, senha_hash) 
VALUES (
  'a1b2c3d4-1234-5678-9101-112131415161', 
  'Maria Silva', 
  'maria@exemplo.com', 
  '$2a$10$xJwL5...'
);


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

<div align="center"> <p>✨ Desenvolvido por <strong>Marcos Morais</strong></p> <a href="https://github.com/MarcosCesarMorais">GitHub</a> | <a href="https://www.linkedin.com/in/marcoscmorais/">LinkedIn</a> </div>
