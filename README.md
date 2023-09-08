![StoneSDK](https://cloud.githubusercontent.com/assets/2567823/11539067/6300c838-990c-11e5-9831-4f8ce691859e.png)

## Desafio Backend - Stone: https://github.com/stone-payments/desafio-backend 
O desafio consiste em criar uma API REST para a loja de Star Wars que será consumida por um aplicativo (Android e iOS). 
Todos os itens serão colocados em um carrinho do lado do aplicativo e passados para a API para realizar uma transação e-commerce.


### POST `/starstore/product`
Esse metodos recebe um produto novo e o insere em um banco de dados para ser consumido pela própria API.
```json
{
"title":"Blusa do Imperio",
"price":7990,
"zipcode":"78993-000",
"seller":"João da Silva",
"thumbnailHd":"https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg",
"date":"26/11/2015"
}
```
### GET `/starstore/products`
Esse metodo da API retorna a lista abaixo, conforme os dados forem inseridos no metodo acima.
```json
[
  {
    "title": "Blusa do Imperio",
    "price": 7990,
    "zipcode": "78993-000",
    "seller": "João da Silva",
    "thumbnailHd": "https://cdn.awsli.com.br/600x450/21/21351/produto/3853007/f66e8c63ab.jpg",
    "date": "26/11/2015"
  },
  {
    "title": "Blusa Han Shot First",
    "price": 7990,
    "zipcode": "13500-110",
    "seller": "Joana",
    "thumbnailHd": "https://cdn.awsli.com.br/1000x1000/21/21351/produto/7234148/55692a941d.jpg",
    "date": "26/11/2015"
  }
]
```

Após o usuário adicionar todos os itens desejados no carrinho, ele finalizará a compra.
Para isso, criamos o metodo `buy` em nossa API.

### POST `/starstore/buy`
Esse método recebe os dados da compra, junto com os dados do usuário.
```json
{
   "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
   "client_name":"Luke Skywalker",
   "total_to_pay":1236,
   "credit_card":{
      "card_number":"1234123412341234",
      "value":7990,
      "cvv":789,
      "card_holder_name":"Luke Skywalker",
      "exp_date":"12/24"
   }
}

```

### GET `/starstore/history`
Esse método retorna todos as compras realizadas na API.

Os dados inseridos acima estão divergente com os dados requisitados no retonro. 
Para isso, foi feito um insert manual em nosso bd, disponibilizando o metodo get que foi proposto.
```json
[
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   }
]
```

### GET `/starstore/history/{clientId}`
Esse método retorna todos as compras realizadas na API por um cliente específico
```json
[
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   },
   {
      "client_id":"7e655c6e-e8e5-4349-8348-e51e0ff3072e",
      "purchase_id":"569c30dc-6bdb-407a-b18b-3794f9b206a8",
      "value":1234,
      "date":"19/08/2016",
      "card_number":"**** **** **** 1234"
   }
]
```

