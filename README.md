[![Apache License](http://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](LICENSE)
[![Build Status](https://travis-ci.org/Sybit-Education/taschengeldboerse.svg?branch=develop)](https://travis-ci.org/Sybit-Education/taschengeldboerse)

# Taschengeldbörse
Eine Taschengeldbörse im Zuge einer Schüler-Projektwoche bei [Sybit GmbH](http://www.sybit.de)

Projektwoche bei Sybit 2015

# Projekt-Setup

## Notwendige Software
- Datenbank: [MySQL](https://www.mysql.de/)
- Entwicklungsumgebung: [Netbeans](https://netbeans.org/) oder andere IDE mit
  - Java ab JDK 7
  - Maven 3

## Datenbank initial einrichten
Bevor man das Projekt starten kann, muss die Datenbank eingerichtet werden.
Dazu das Script [create-database.sql](src/main/resources/db/migration/create_database.sql) auf der MySQL-Datenbank initial ausführen. Wie das geht, ist in folgendem [Video](https://www.youtube.com/watch?v=eHDz7uWjCyU) beschrieben.

## Projekt kompilieren
Entweder mit dem Maven-Kommando:
``mvn install``

Oder in Netbeans direkt mit "Run/Build Project" ausführen.

# Taschengeldbörse starten
Wenn es beim Kompilieren zu keinen Fehlern kam, dann kann nun in Netbeans mit "Run/Run Project" die Taschengeldbörse gestartet werden. 
Nach einigen Augenblicken sollte sich der Browser mit folgender URL öffen: [http://localhost:8080/taschengeldboerse](http://localhost:8080/taschengeldboerse)
