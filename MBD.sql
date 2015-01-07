/*
Modelo Banco de Dados asfenglish
 ____---------------------------------------------------------------------____
|________________________________Tabela dados_________________________________|
| id           | int(8)       | not null     |  auto_increment  | primary key |
| palavra      | varchar(50)  | not null     |  -               |             |
| texto        | varchar(255) | -            |  -               |             |
|_____________________________________________________________________________|

*/

create database bdasfenglish;

use bdasfenglish;

create table dados(
id int(8) not null auto_increment,
palavra varchar(50) not null,
texto varchar(255),
primary key (id));