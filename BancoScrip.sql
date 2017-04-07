drop schema restaurante2016;

create schema restaurante2016;

use restaurante2016;


create table mercadoria (
id int not null auto_increment,
descricao varchar (30)not null,
tipo varchar (30)not null,
preco decimal (10,2)not null,
disponibilidade varchar (2)not null,
primary key (id)
);
 

-- drop table pedido;

create table pedido (
id int not null auto_increment,
data_entrada DATETIME not null,
mesa int not null,
garcom varchar (100),
data_saida DATETIME not null,
primary key (id)
);

create table login(
id int not null auto_increment,
login varchar (20) not null,
senha varchar (50) not null,
usuario varchar (20) not null,
primary key (id)
);

 -- select * from pedido ;
 
--  drop table itempedido;

create table itempedido(
id int not null auto_increment,
idpedido int not null,
idmercadoria int not null,
quantidade int not null,
primary key (id),
foreign key (idpedido) references pedido (id),
foreign key (idmercadoria) references mercadoria (id)
);

 -- select * from itempedido ;

create table caixa (
id int not null auto_increment,
data varchar (20) not null,
valor decimal (10,2) not null,
idpedido int not null,
primary key (id),
foreign key (idpedido) references pedido (id)
);

-- select * from caixa ;

insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (1,'Coca-Cola','Bebida', 5.00,'Y');
insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (2,'Virado a paulista','Prato',25.10,'Y');
insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (3,'Omelete','Prato',21.00,'Y');
insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (4,'Spaguetti','Prato',22.00,'Y');
insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (5,'Fanta','Bebida',5.00,'Y');
insert into mercadoria (id,descricao,tipo,preco,disponibilidade) values (6,'café','Bebida',2.00,'Y');
insert into mercadoria(descricao,tipo,preco,disponibilidade) VALUES('café','Bebida',2.00,'Y');
select * from mercadoria ;

SELECT ID FROM MERCADORIA ORDER BY ID DESC LIMIT 1;

select * from mercadoria where tipo = 'bebida';
