# NoSQL (spezifisch MongoDB)

---

### Aufbau
- Wofür steht NoSQL überhaupt?
- Was ist NoSQL?
- Datenmodelle
- Vorteile/Nachteile
- Teil 2~1: Was ist MongoDB
- Teil 2~2: Vorteile und Nachteile von MongoDB
- Teil 2~3: Praxisbeispiel von MongoDB

---

### 1. Wofür steht NoSQL überhaupt?
Der Begriff NoSQL heutzutage ist eigentlich sehr einfach erklärt, 
NoSQL steht heute für "Not Only SQL" und bezieht sich auf Datenbanken, 
die ganz einfach nicht die traditionelle Struktur von relationalen Datenbanken verwenden.

Früher stand NoSQL nur für wörtlich "Kein SQL" und bezog sich auf Datenbanken,
welche keine Abfragesprache wie SQL verwendeten. Ungefähr in den 2000er Jahren 
wurde es jedoch erweitert, da es nicht mehr "Zeitgemäß" war.

### 2. Was ist NoSQL?
"NoSQL" ist eine Art oder auch Klasse von Datenbanken, 
welche nicht die relationale Datenbankstruktur verwenden.

Diese Datebanken hingegen benutzen dann unstructured oder semi-structured Datenmodelle, welche flexibler und skalierbarer 
und dazubei großen Datenmengen eine bessere Leistung bietet.

> Ein unstructured Datenmodell ist ein Modell, bei dem die Daten nicht in einer Struktur oder Formatierung gespeichert werden. Es gibt keine Spalten, Typen oder Beziehungen.

> Ein semi-strukturiertes Datenmodell ist ein Datenmodell, bei dem die Daten teilweise in einer vorbestimmten Struktur oder Formatierung gespeichert werden. Es kann feste Typen oder Beziehungen zwischen Datenelementen geben, aber die Daten können trotzdem frei formuliert und in unterschiedlicher Form gespeichert werden. Ein semi-strukturiertes Datenmodell bietet mehr Struktur als ein unstructuriertes Datenmodell, aber ist trotzdem flexibler als ein vollständig strukturiertes Datenmodell wie eine relationale Datenbank. Es ist besonders geeignet für Daten, die sowohl eine hohe Flexibilität als auch eine gewisse Struktur erfordern, wie beispielsweise bei XML- oder JSON-Dokumenten.

### 3. Datenmodelle
Es gibt viele verschiedene Arten, wie eine das NoSQL-Konzept in einer Datenbank umgesetzt werden kann.

| Datenmodell                     | Beispiele                                                               | Leistung | Skalierbarkeit  | Flexibilität | Komplexität |
|---------------------------------|-------------------------------------------------------------------------|----------|-----------------|--------------|-------------|
| Dokumentenorientierte Datenbank | CouchDB, eXist, HCL Notes, MongoDB, IrentDB                             | hoch     | variiert (hoch) | hoch         | gering      |
| Graphdatenbanken                | Neo4j, OrientDB, Amazon Neptune, InfoGrid, HyperGraphDB, COre Data, DEX | variiert | variiert        | hoch         | hoch        |
| Key-Value Datenkbanken          | Google BigTable, Redis, memcached,                                      | hoch     | hoch            | hoch         | keine       |
| Spaltenorientierte Datenbanken  | Apache Cassandra, Google BigTable, SimpleDB, Scylla                     | hoch     | hoch            | mittel       | gering      |
| Datenstrom                      | Apache Kafka, RethinkDB, PipelineDB                                     | N/A      | N/A             | N/A          | N/A         |

### 4. Vorteile/Nachteile
**Vorteile von NoSQL im Vergleich zu relationalen Datenbanken:**

> **Skalierbarkeit**: NoSQL-Datenbanken können leichter horizontal skaliert werden, um eine größere Datenmenge und mehr Anfragen zu verarbeiten.

> **Flexibilität**: NoSQL-Datenbanken ermöglichen es, unstructurierte oder semi-strukturierte Daten zu speichern, ohne dass eine feste Struktur oder Formatierung erforderlich ist.

> **Leistung**: NoSQL-Datenbanken können in einigen Anwendungsfällen eine höhere Leistung bieten als relationale Datenbanken, insbesondere bei großen Datenmengen.

> **Verfügbarkeit:** Einige NoSQL-Datenbanken sind für eine hohe Verfügbarkeit und Redundanz konzipiert, um Datenverlust zu vermeiden.


**Nachteile von NoSQL im Vergleich zu relationalen Datenbanken:**

> **Abfragesprache**: Einige NoSQL-Datenbanken verfügen nicht über eine leistungsstarke Abfragesprache wie SQL, was es schwieriger macht, komplexe Abfragen zu erstellen.

> **Transaktionsverarbeitung**: Einige NoSQL-Datenbanken unterstützen keine Transaktionsverarbeitung, was es schwieriger macht, konsistente Daten sicherzustellen.

> **Datenintegrität**: Ohne eine feste Struktur oder Beziehungen zwischen Datenelementen kann es schwieriger sein, Datenintegrität sicherzustellen.

> **Fehlen von JOIN-Operationen**: Einige NoSQL-Datenbanken unterstützen keine JOIN-Operationen, was es schwieriger macht, Daten aus verschiedenen Quellen zu integrieren.

### Teil 2~1: Was ist MongoDB
**MongoDB** ist eine Implementierung einer **NoSQL-Datenbank** in Form einer **Dokumenten-Datenbank**.

MongoDB speichert Daten in Form von Dokumenten, welche **ähnlich wie JSON- oder XML-Dokumenten** aussehen, anstatt in Tabellen wie einer relationalen Datenbank.
Außerdem unterstützt MongoDB eine eigene Abfragesprache namens **MongoDB Query Language** (kurz: **MQL**) und bietet auch eine API für verschiedene Programmiersprachen an.

### Teil 2~2: Vorteile und Nachteile von MongoDB
**Vorteile von MongoDB:**

> Flexibilität: MongoDB ermöglicht es, unstructurierte oder semi-strukturierte Daten ohne feste Struktur oder Formatierung zu speichern.

> Skalierbarkeit: MongoDB kann leicht horizontal skaliert werden, um eine größere Datenmenge und mehr Anfragen zu verarbeiten.

> Leistung: MongoDB kann in einigen Anwendungsfällen eine höhere Leistung bieten als relationale Datenbanken, insbesondere bei großen Datenmengen.

> Verfügbarkeit: MongoDB ist für eine hohe Verfügbarkeit und Redundanz konzipiert, um Datenverlust zu vermeiden.

> Benutzerfreundlichkeit: MongoDB verfügt über eine einfache und intuitive Abfragesprache, die es Entwicklern erleichtert, Daten zu verwalten und abzufragen.

**Nachteile von MongoDB:**

> Datenintegrität: Da MongoDB keine feste Struktur oder Beziehungen zwischen Datenelementen unterstützt, kann es schwieriger sein, Datenintegrität sicherzustellen.
 
> Transaktionsverarbeitung: MongoDB unterstützt keine Transaktionsverarbeitung, was es schwieriger macht, konsistente Daten sicherzustellen.

## Teil 2~3: Praxisbeispiel von MongoDB

https://cloud.mongodb.com/v2/63d70c049dc31c0bdcf0ae06#/clusters?fastPoll=true

### Quellen
- https://de.wikipedia.org/wiki/NoSQL
- https://de.wikipedia.org/wiki/Skalierbarkeit#Horizontale_Skalierung
- https://aws.amazon.com/de/nosql/#:~:text=Was%20sind%20NoSQL-Datenbanken%3F,einfache%20Entwicklung%2C%20Funktionalität%20und%20Skalierbarkeit.
- https://www.bigdata-insider.de/was-ist-nosql-a-615718/
