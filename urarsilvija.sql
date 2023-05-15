create database urarsilvija;
use urarsilvija;

create table korisnik(
	id int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50),
	telefon varchar(20)
);

create table sat(
	id int not null primary key auto_increment,
	marka varchar(50),
	korisnik int
);

create table popravak(
	id int not null primary key auto_increment,
	segrt int,
	trajanje int,
	cijena decimal(18,2),
	opis varchar(100)
);

create table popravak_sat(
	id int not null primary key auto_increment,
	sat int,
	popravak int
);

create table segrt(
	id int not null primary key auto_increment,
	ime varchar(50),
	prezime varchar(50),
	oib char(11)
);

alter table sat add foreign key (korisnik) references korisnik (id);
alter table popravak add foreign key (segrt) references segrt (id);
alter table popravak_sat add foreign key (sat) references sat (id);
alter table popravak_sat add foreign key (popravak) references popravak (id);