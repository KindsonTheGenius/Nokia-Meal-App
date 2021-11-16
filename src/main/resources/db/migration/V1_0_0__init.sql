drop table if exists "meal";

create table if not exists meal (
    id  serial not null,
    meal_name varchar(255),
    price FLOAT,
    ingredients varchar(255),
    spicy BOOLEAN,
    vegan BOOLEAN,
    gluton_free BOOLEAN,
    description varchar(255),
    kcal FLOAT,
    image_url varchar(255),
    primary key (id)
);
