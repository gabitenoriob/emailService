# Microserviço para Envio de E-mails

Este é um microserviço desenvolvido com as tecnologias Java 21 + Spring Boot para facilitar o envio de e-mails utilizando os provedores AWS SES (Simple Email Service) e SendGrid. O serviço segue os princípios da arquitetura limpa para garantir uma estrutura modular e de fácil manutenção.

## Arquitetura

O microserviço segue uma arquitetura limpa, onde a aplicação é dividida em camadas distintas, cada uma com responsabilidades específicas:

1. **Core:**
   - Este pacote contém as entidades de domínio e as regras de negócio da aplicação. Aqui são definidos os objetos.

2. **Infra:**
   - O pacote de Infraestrutura lida com detalhes de implementação, como acesso a banco de dados, envio de e-mails e integração com serviços externos. Ele fornece implementações concretas para interfaces definidas na camada de aplicação.

3. **Application:**
   - A camada de Aplicação é responsável por orquestrar as operações da aplicação, aplicando as regras de negócio definidas na camada de Domínio. Aqui são definidos os casos de uso da aplicação e suas respectivas implementações.

4. **Adapters:**
   - Este pacote contém adaptadores que permitem que a aplicação se comunique com componentes externos Aqui estão os adaptadores para interações com APIs de serviços de e-mail, por exemplo.

5. **Controllers:**
   - Os controladores são responsáveis por receber as requisições HTTP da API e direcioná-las para os casos de uso apropriados na camada de Aplicação. Eles lidam com a entrada e saída da aplicação, como validação de dados e formatação de respostas.


## Funcionamento

O microserviço oferece uma API RESTful para o envio de e-mails. Ele suporta dois provedores de e-mail: AWS SES e SendGrid. Os endpoints disponíveis são:

- `/api/email/send` - Endpoint para enviar um e-mail. Os parâmetros necessários são:
  - `to` - Endereço de e-mail do destinatário.
  - `subject` - Assunto do e-mail.
  - `body` - Corpo do e-mail.

## Documentação da API

A documentação completa da API pode ser encontrada [aqui](https://documenter.getpostman.com/view/33292565/2sA3JDfjTQ).
