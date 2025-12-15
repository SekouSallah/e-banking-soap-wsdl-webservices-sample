Parfait, dans ce cas il faut **intégrer les images directement dans le README via Markdown** pour qu’elles **s’affichent
** (et pas seulement être listées).

Voici la **version corrigée** avec les captures **visibles**, en supposant que les images sont dans un dossier `images/`
à la racine du projet
(adapte le chemin si nécessaire).

---

```md
# E-Banking SOAP Web Service – Demo Project

Ce projet est une démonstration d’un Web Service SOAP en Java simulant un système bancaire simple.  
Il illustre l’implémentation et la consommation de services SOAP (JAX-WS) dans une architecture multi-modules Maven,
sans utilisation de frameworks tels que Spring Boot.

---

## Fonctionnalités

Le système bancaire simulé expose les opérations suivantes :

- Création de comptes bancaires
- Consultation de la liste des comptes
- Conversion Euro vers Dirham
- Exposition d’un Web Service SOAP via un serveur applicatif

---

## Architecture du projet

```

e-banking-soap-wsdl-webservices-sample
│
├── e-banking-server → Producteur du Web Service SOAP
└── e-banking-client → Consommateur du Web Service SOAP

````

---

## Technologies utilisées

- Java 21
- Maven
- JAX-WS (SOAP)
- WSDL / XSD
- WSImport / Plugin Maven JAX-WS
- Serveur applicatif (ex : Tomcat, Jetty, GlassFish)

---

## Démarrage de l’application

### Prérequis

- Java 21
- Maven 3.x
- Serveur applicatif compatible JAX-WS

### Lancer le serveur SOAP

```bash
cd e-banking-server
mvn clean package
````

Déployer ensuite l’artefact généré (`.war`) sur le serveur applicatif.

---

## Accès au Web Service

### WSDL

```
http://localhost:8282/ws/ebanking/?wsdl
```

Capture du WSDL exposé par le serveur :

![WSDL e-banking](images/ebanking-wsdl.png)

---

### XSD

```
http://localhost:8282/ws/ebanking?xsd=1
```

Schéma XSD exposé par le Web Service :

![XSD e-banking](images/ebanking.xsd.png)

---

## Tests du Web Service avec SOAP UI

Le Web Service SOAP est testé via **SOAP UI** en important le WSDL.

```
http://localhost:8282/ws/ebanking/?wsdl
```

SOAP UI génère automatiquement les requêtes correspondant aux opérations exposées.

---

### Conversion Euro vers Dirham

Cette requête permet de convertir un montant en Euro vers le Dirham depuis SOAP UI.

![Conversion Euro vers Dirham](images/1.png)

---

### Récupération des comptes

Cette requête permet de récupérer la liste des comptes bancaires existants.

![Récupération des comptes](images/2.png)

---

### Création d’un compte bancaire

Cette requête permet de créer un nouveau compte bancaire via SOAP UI.

![Création de compte](images/3.png)

---

## Consommation du Web Service

Le module `e-banking-client` consomme le Web Service exposé par le serveur en important le WSDL.

### Génération des classes clientes

```bash
wsimport -keep -p com.example.client \
http://localhost:8282/ws/ebanking/?wsdl
```

---

## Organisation des ressources

```
images/
├── ebanking-wsdl.png
├── ebanking.xsd.png
├── 1.png
├── 2.png
└── 3.png
```

---

## Notes

Ce projet est destiné à un usage éducatif et démonstratif.
Il ne couvre pas les aspects avancés tels que la sécurité SOAP (WS-Security), la gestion des transactions ou la montée
en charge.

---

