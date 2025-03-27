## 📌 Descrição
Sistema para gestão de pagamentos e lançamentos financeiros.

### 🚀 Funcionalidades Principais

#### 👥 Gestão de Usuários
- **Cadastro seguro** com validação de e-mail.
- **Hierarquia de acessos** (admin, usuário, convidado)
  
#### 📝 Cadastro de Pessoas.
- **Registro** com validação de e-mail.
 - **Endereço** com validação de e-mail.
 -  **Cidade e Estado** com validação de e-mail.
   

#### 💰 Controle Financeiro
- **Lançamento** de receitas e despesas

#### 📊 Relatórios Avançados
- **Geração de relatórios e receitas e despesas** (PDF)
- 
#### 📎 Anexos Digitais
- **Upload de comprovantes** (PDF, imagem)

## 🚀 Tecnologias
<div align="center"> 
  <img src="https://img.shields.io/badge/Spring-000000?style=for-the-badge&logo=Spring" alt="Spring" /> 
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" /> 
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" /> 
  <img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker" /> 
</div>

## 🛠️ Como Executar
Pré-requisitos
Java 17+
Docker (opcional)
Maven

# 1. Clone o repositório
git clone https://github.com/seu-usuario/financeflow.git

# 2. Suba os containers
docker-compose -f docker/docker-compose.yml up -d

# 3. Acesse a aplicação
http://localhost:3000





## **📊 Endpoints Principais**

| Método | Rota               | Descrição                     |
|--------|--------------------|-------------------------------|
| POST   | `/consultas`       | Agenda uma nova consulta      |
| GET    | `/consultas/{id}`  | Busca consulta por ID         |

<div align="center"> <p>✨ Desenvolvido por <strong>Marcos Morais</strong></p> <a href="https://github.com/MarcosCesarMorais">GitHub</a> | <a href="https://www.linkedin.com/in/marcoscmorais/">LinkedIn</a> </div>
