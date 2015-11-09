[![Apache License](http://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](LICENSE)
[![Build Status](https://travis-ci.org/Sybit-Education/taschengeldboerse.svg?branch=develop)](https://travis-ci.org/Sybit-Education/taschengeldboerse)

# Taschengeldbörse
Eine Taschengeldbörse im Zuge einer Schüler-Projektwoche bei [Sybit GmbH](http://www.sybit.de)

Projektwoche bei Sybit 2015

# Projekt-Setup

## Notwendige Software
- Datenbank: MySQL
- Java ab JDK 7
- Netbeans oder andere IDE
- Maven 3

## Datenbank initial einrichten
Dazu das Script [create-database.sql](src/main/resources/db/migration/create_database.sql) auf der MySQL-Datenbank ausführen.

## Projekt kompilieren
``mvn install``
