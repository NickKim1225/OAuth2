CREATE TABLE Users(
	id UUID PRIMARY KEY NOT NULL,
	username varchar(100) NOT NULL,
	password char(60) NOT NULL,
	role char(60) NOT NULL
)