## [PRESENTATION PPT](https://docs.google.com/presentation/d/1f3m-9Ssj3wlc6B5ywACb16q4qor5Gs7O/edit?usp=drive_link&ouid=116669777116112820978&rtpof=true&sd=true)
# Projet GatherGrid
## Configuration et Technologies Utilisées

Ce projet a été développé en utilisant IntelliJ IDEA, en plus des technologies clés suivantes :

### 1. Apache Tomcat
- **Version Utilisée:** 10.1.14
- **Configuration:** 
  - Vous pouvez télécharger et configurer Apache Tomcat depuis les [préférences d'IntelliJ IDEA](https://www.jetbrains.com/help/idea/apache-tomcat.html).

### 2. Maven
- **Version Utilisée:** 3.8.1
- **Configuration:**
  - Maven est intégré par défaut dans IntelliJ IDEA.
  - Pour construire le projet, ouvrez un terminal dans IntelliJ et exécutez la commande : `mvn clean install`.

### 3. Hibernate
- **Version Utilisée:** 6.0.2.Final
- **Raison du Choix:**
  - Hibernate est un framework de persistance ORM puissant et largement utilisé dans l'écosystème JEE.
  - Il offre une gestion facile et efficace de la persistance des objets Java dans la base de données, simplifiant ainsi le développement et la maintenance.

### 4. JPA (Java Persistence API)
- **Version Utilisée:** 3.1.4
- **Raison du Choix:**
  - JPA est une norme de persistance Java qui fournit un moyen standard de gérer la persistance des données dans les applications Java.
  - Il offre une abstraction des détails de mise en œuvre spécifiques à un fournisseur, ce qui permet de changer de fournisseur ORM (comme Hibernate) sans changer le code de l'application.

### 5. Java Enterprise Edition (JEE)
- **Version Utilisée:** 10
- **Raison du Choix:**
  - JEE fournit un ensemble d'APIs et de spécifications pour développer des applications d'entreprise robustes, extensibles et évolutives.
  - Il offre des fonctionnalités telles que les servlets, les JSP, les EJB, JPA, etc., qui sont essentielles pour développer des applications web d'entreprise.

## Configuration de l'Environnement de Développement
1. **IDE:**
   - Utilisez IntelliJ IDEA comme IDE principal pour le développement du projet.

## Build et Déploiement
- **Construire et Déployer l'Application:**
  1. Cliquez avec le bouton droit sur le projet et sélectionnez "Add Framework Support".
  2. Choisissez "Maven" pour intégrer Maven dans le projet.
  3. Configurez Tomcat dans les préférences du projet pour le déploiement.
