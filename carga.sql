CREATE TABLE IF NOT EXISTS users (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    senha VARCHAR(255) NOT NULL
);

INSERT INTO users (id, name, email, senha) VALUES
('11111111-1111-1111-1111-111111111111', 'Alice', 'alice@example.com', 'password1'),
('22222222-2222-2222-2222-222222222222', 'Bob', 'bob@example.com', 'password2'),
('33333333-3333-3333-3333-333333333333', 'Charlie', 'charlie@example.com', 'password3');

CREATE TABLE IF NOT EXISTS categories (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

INSERT INTO categories (name) VALUES
('Electronics'),
('Books'),
('Clothing');

CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    user_id UUID REFERENCES users(id),
    products_list TEXT,
    sell_date TIMESTAMP
);

INSERT INTO orders (user_id, products_list, sell_date) VALUES
('11111111-1111-1111-1111-111111111111', '1,2', '2024-06-21 12:00:00'),
('22222222-2222-2222-2222-222222222222', '3', '2024-06-22 10:30:00'),
('33333333-3333-3333-3333-333333333333', '2,3', '2024-06-23 15:45:00');


CREATE TABLE IF NOT EXISTS products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    category_id INT REFERENCES categories(id)
);


INSERT INTO products (name, description, price, category_id) VALUES
('Smartphone', 'A smartphone with a 6-inch screen', 599.99, 1),
('Laptop', 'A powerful laptop with 16GB RAM', 1299.99, 1),
('T-shirt', 'A comfortable cotton t-shirt', 19.99, 3);


