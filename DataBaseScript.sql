/*
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”
*/

DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;

-- 8. Создать таблицы с иерархией из диаграммы в БД

CREATE TABLE Dog (
    ID INT PRIMARY KEY,
    AnimalType VARCHAR(45) DEFAULT 'Dog',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

CREATE TABLE Cat (
    ID INT PRIMARY KEY,
    AnimalType VARCHAR(45) DEFAULT 'Cat',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

CREATE TABLE Hamster (
    ID INT PRIMARY KEY,
    AnimalType VARCHAR(45) DEFAULT 'Hamster',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

CREATE TABLE Horse (
    ID INT PRIMARY KEY,
    AnimalType VARCHAR(45) DEFAULT 'Horse',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

CREATE TABLE Camel (
    ID INT PRIMARY KEY,
	AnimalType VARCHAR(45) DEFAULT 'Camel',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

CREATE TABLE Donkey (
    ID INT PRIMARY KEY,    
    AnimalType VARCHAR(45) DEFAULT 'Donkey',
    Name VARCHAR(255),
    Command VARCHAR(255),
    BirthDate DATE
);

/*
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
*/

INSERT INTO Dog (ID, Name, Command, BirthDate) VALUES 
(1, 'Buddy', 'Sit', '2020-01-01'), 
(2, 'Max', 'Fetch', '2019-07-12');

INSERT INTO Cat (ID, Name, Command, BirthDate) VALUES 
(3, 'Whiskers', 'Meow', '2019-02-15'), 
(4, 'Mittens', 'Purr', '2020-10-05');

INSERT INTO Hamster (ID, Name, Command, BirthDate) VALUES 
(5, 'Fluffy', 'Run in wheel', '2021-05-10'), 
(6, 'Nibbles', 'Eat seeds', '2018-12-08');

INSERT INTO Horse (ID, Name, Command, BirthDate) VALUES 
(7, 'Thunder', 'Gallop', '2018-03-20'), 
(8, 'Shadow', 'Trot', '2017-11-25');

INSERT INTO Camel (ID, Name, Command, BirthDate) VALUES 
(9, 'Sandy', 'Carry', '2016-06-12'), 
(10, 'Dusty', 'Transport', '2015-09-18');

INSERT INTO Donkey (ID, Name, Command, BirthDate) VALUES 
(11, 'Eeyore', 'Pull cart', '2019-08-12'), 
(12, 'Burrito', 'Work in field', '2020-04-25');

-- Domestic Animals
CREATE TABLE DomesticAnimal AS
SELECT ID, AnimalType FROM Dog
UNION
SELECT ID, AnimalType FROM Cat
UNION
SELECT ID, AnimalType FROM Hamster;

-- Baggage Animals
CREATE TABLE BaggageAnimal AS
SELECT ID, AnimalType FROM Horse
UNION
SELECT ID, AnimalType FROM Camel
UNION
SELECT ID, AnimalType FROM Donkey;

-- Animals
CREATE TABLE Animals AS
SELECT * FROM DomesticAnimal
UNION
SELECT * FROM BaggageAnimal;

-- 10. Удаление верблюдов
DELETE FROM Camel;

-- Объединение лошадей и ослов в новую таблицу
CREATE TABLE HorsesAndDonkeys AS
SELECT * FROM Horse
UNION
SELECT * FROM Donkey;

DROP TABLE BaggageAnimal;
CREATE TABLE BaggageAnimal AS
SELECT ID, AnimalType FROM HorsesAndDonkeys;

DROP TABLE Animals;
CREATE TABLE Animals AS
SELECT * FROM DomesticAnimal
UNION
SELECT * FROM BaggageAnimal;

/*
11.Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице
*/

CREATE TABLE YoungAnimals AS
SELECT *,
    TIMESTAMPDIFF(MONTH, BirthDate, CURDATE()) AS AgeInMonths
FROM (
    SELECT * FROM Dog
    UNION ALL
    SELECT * FROM Cat
    UNION ALL
    SELECT * FROM Hamster
    UNION ALL
    SELECT * FROM Horse
    UNION ALL
    SELECT * FROM Camel
    UNION ALL
    SELECT * FROM Donkey
) AS AllAnimals
WHERE BirthDate BETWEEN CURDATE() - INTERVAL 3 YEAR AND CURDATE() - INTERVAL 1 YEAR;

/*
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам. здесь нужно использовать функцию ALTER TABLE
*/

ALTER TABLE Dog ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Dog';
ALTER TABLE Cat ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Cat';
ALTER TABLE Hamster ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Hamster';
ALTER TABLE Horse ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Horse';
ALTER TABLE Camel ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Camel';
ALTER TABLE Donkey ADD COLUMN OriginalTable VARCHAR(45) DEFAULT 'Donkey';

CREATE TABLE AllAnimals AS
SELECT * FROM Dog
UNION ALL
SELECT * FROM Cat
UNION ALL
SELECT * FROM Hamster
UNION ALL
SELECT * FROM Horse
UNION ALL
SELECT * FROM Camel
UNION ALL
SELECT * FROM Donkey;

SELECT * FROM AllAnimals;