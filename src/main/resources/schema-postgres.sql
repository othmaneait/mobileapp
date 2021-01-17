DROP TABLE IF EXISTS users;
CREATE TABLE users(id serial PRIMARY KEY, age integer , sexe integer,  preference varchar(20),pricemin integer , pricemax integer ,handicap boolean  );
DROP TABLE IF EXISTS AvailableTransport;
CREATE TABLE AvailableTransport(id serial PRIMARY KEY, nametransport varchar(20) , departureTime varchar(20),  arrivalTime varchar(20)   );