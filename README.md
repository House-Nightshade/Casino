# Casino
Belegarbeit für den HTW Kurs B42 Softwareengineering und Softwarearchitekturen im Wintersemester 2026/27


    Die Abgabe muss eine README.md mit Projektbeschreibung, Nutzungsanweisung, Installations- und
    Build-Anleitung sowie Autorenangaben enthalten.
    Eine Creative-Commons-Lizenz sollte optional ergänzt werden

## Projektbeschreibung
Wir bauen eine Casino-Simulation mit virtuellem Spielgeld. Das Projekt besteht aus zwei REST-Microservices mit jeweils einer eigenen PostgreSQL-Datenbank.

- **Banking-Service (`8080`)** verwaltet Nutzer und Transaktionen. Der Code wird nach `User` und `Transaction` organisiert (Vertical Slice).
- **Spiel-Service (Slots-Service) (`8081`)** verarbeitet eine vollständige Spielrunde pro Anfrage. Der Code wird in Schichten organisiert, etwa Controller, Spiellogik und Datenzugriff.

**Erster Meilenstein**  
Wir schicken über Swagger einen Einsatz an den Slots-Service und erhalten die gezogenen Symbole und die berechnete Auszahlung. Danach verbinden wir diese Runde mit dem Banking-Service.

## Nutzungsanweisung

## Installations- und Build-Anleitung

## Autorenangaben

## Lizenz