create database fakultet;
use fakultet;

create table student(
	sifra int not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	jmbag char(11)
);

create table kolegij(
	sifra int not null primary key auto_increment,
	naziv varchar(100),
	opis varchar (200)
);

create table rok(
	sifra int not null primary key auto_increment,
	vrijeme datetime,
	kolegij int
);

create table student_rok(
	sifra int not null primary key auto_increment,
	student int not null,
	rok int not null
);

alter table student_rok add foreign key (student) references student (sifra);
alter table student_rok add foreign key (rok) references rok (sifra);
alter table rok add foreign key (kolegij) references kolegij (sifra);