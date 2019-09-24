# testeoauth2
Teste de Autenticação oAuth2 em um serviço Spring Rest

Para gerar o Token:
Com o Postman, acesse a URL: http://localhost:8080/oauth/token, na opção Authorization, 
use o tipo de autenticação Basic Auth e preencha o username e passord indicado no
application.properties, parametros: security.oauth2.client.client-id e security.oauth2.client.client-secret, 
pressione o SEND do Postman e terá uma resultado 

{
    "access_token": "997d9a37-ca37-46fe-9ca3-ebf34ca5dc57",
    "token_type": "bearer",
    "refresh_token": "693beeb2-a2ea-4006-9347-7782c063fb87",
    "expires_in": 43199,
    "scope": "password"
}

Para consumir o serviço com token, abra o Postman entre na URL: http://localhost:8080/carro/ler, a opção Authorization,
use o tipo de autenticação Bearer Token e insira o token obtido anteiormente. Utilize o serviço normalmente e deve ter a resposta esperada.

