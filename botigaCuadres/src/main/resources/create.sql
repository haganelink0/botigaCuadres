create table paints (
    id int not null,
	created_at timestamp not null,
	updated_at timestamp not null,
    author varchar(255) not null,
    price int not null,
    title varchar(255) not null,
	shop_id int not null,
    primary key (id)
)

create table shops (
    id int not null,
created_at timestamp not null,
updated_at timestamp not null,
    max_capacity int not null,
    shop_name varchar(255) not null,
    primary key (id)
)