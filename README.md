# SQL1 Kodegjennomgang

This is the base code for the kodegjennomgang for module SQL1 from DATA1700 - Webprogrammering.

## Task 
Implementing a registration system for customers to register vehicles. 

This application should have a client (JavaScript), a server (Java/Spring) and a database (MySQL).

## Changelog
### v. 2.0
This version now includes a database connection, which was demonstrated live. It also includes the changes requested during the lectures, *i.e.*:
- Adding IDs to the Motorvogn, so that a same person can register multiple cars
- Personnummer being defined as CHAR(11) (fixed-length string) // it can also be defined as BIGINT 

### v. 1.0
- This first version DOES NOT include a database connection, as it will be demonstrated live. 

## Cloning this repository
1. Open the terminal (in IntelliJ or on your computer)
2. Go to the directory where you will clone this repo by using `cd directory/subdirectory/subsubdirectory...`
3. (OPTIONAL) If you want to create a new folder, use `mkdir foldername` and then go into that folder with `cd foldername`
4. `git clone https://github.com/anafvana/sql1-kodegjennomgang.git`
