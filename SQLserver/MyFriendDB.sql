CREATE DATABASE MyFriendDB;

USE MyFriendDB;

Create Table Users (
	user_id INT PRIMARY KEY,
	email VARCHAR (100),
	last_name VARCHAR (100)
	);

	INSERT INTO Users values(2,'izawel@gamil.com','izawel'), (3,'divzzz@gamil.com','divzzz'), (4,'barun@gamil.com','barun'), (5,'pribas@gamil.com','pribas'),(6,'nivinavi@gamil.com','nivinavi'); 

	SELECT * FROM Users;
	                          