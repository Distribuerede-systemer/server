CREATE DATABASE cbscalendar;
use cbscalendar;

SET SESSION FOREIGN_KEY_CHECKS=0;

/* Create Tables */

CREATE TABLE locationdata
(
	locationdataid int NOT NULL AUTO_INCREMENT,
	longitude int NOT NULL,
	latitude int UNIQUE,
	PRIMARY KEY (locationdataid)
);


CREATE TABLE roles
(
	roleid int NOT NULL AUTO_INCREMENT,
	userid int NOT NULL,
	type varchar(200) NOT NULL,
	PRIMARY KEY (roleid)
);


CREATE TABLE users
(
	userid int NOT NULL AUTO_INCREMENT,
	email varchar(40) NOT NULL,
	active boolean,
	created datetime NOT NULL DEFAULT NOW(),
	PRIMARY KEY (userid)
);


CREATE TABLE userevents
(
	userid int NOT NULL,
	eventid int NOT NULL
);


CREATE TABLE notes
(
	noteid int NOT NULL AUTO_INCREMENT,
	eventid int NOT NULL,
	createdby int NOT NULL,
	text text,
	created datetime NOT NULL DEFAULT NOW(),
	PRIMARY KEY (noteid)
);


CREATE TABLE events
(
	eventid int NOT NULL AUTO_INCREMENT,
	type int NOT NULL,
	location int,
	createdby int NOT NULL,
	start datetime NOT NULL,
	end datetime NOT NULL,
	name varchar(0) NOT NULL,
	text text NOT NULL,
	PRIMARY KEY (eventid)
);


CREATE TABLE dailyupdate
(
	date datetime NOT NULL UNIQUE,
	apparentTemperature double,
	summary text,
	windspeed double,
	qotd varchar(512),
	PRIMARY KEY (date)
);



/* Create Foreign Keys */

ALTER TABLE events
	ADD FOREIGN KEY (location)
	REFERENCES locationdata (locationdataid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE userevents
	ADD FOREIGN KEY (userid)
	REFERENCES users (userid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE notes
	ADD FOREIGN KEY (createdby)
	REFERENCES users (userid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE roles
	ADD FOREIGN KEY (userid)
	REFERENCES users (userid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE events
	ADD FOREIGN KEY (createdby)
	REFERENCES users (userid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE notes
	ADD FOREIGN KEY (eventid)
	REFERENCES events (eventid)
	ON UPDATE RESTRICT
	
;


ALTER TABLE userevents
	ADD FOREIGN KEY (eventid)
	REFERENCES events (eventid)
	ON UPDATE RESTRICT
	
;
