<h1>ORM JDBC JPA Hibernate Spring Data</h1>
<h2>Introduction</h2>
<p>Les Technologies ORM (Object Relational Mapping) sont des outils
permattant de simplifier l'interaction entre les applications Java et les 
bases de données relationnelles comme MySQL.</p>
<p>JDBC (Java Database Connectivity) est une API Java standard pour la gestion des 
bases de données relationnelles. JPA (Java Persistence API) est une spécification
JEE qui définit une interface pour la gestion des entités et des relations entre
les objets Java et les bases de données.</p>
<p>Hibernate est un framework ORM populaire qui implémente la spécification
JPA, facilitant ainsi la persistance des objets Java dans les bases de données.
 Spring Data simplifie encore d'avantage l'accès aux données en fournissant une couche
d'abstraction pour la persistance des données, facilitant l'intégration
de JDBC, JPA, Hibernate et d'autres technologies de gestion de données dans les applications
Spring.</p>
<h2>Énoncé</h2>
<ol>
    <li>Installer IntelliJ Ultimate</li>
    <li>Créer un projet Spring Initializer avec les dépendances JPA,H2,Spring Web et Lombock</li>
    <li>Créer l'entité JPA Patient ayant les attributs :</li>
        <ul>
            <li>id de type Long</li>
            <li>nom de type String</li>
            <li>date de naissance de type Date</li>
            <li>malade de type booléen</li>
            <li>score de type int</li>
        </ul>
    <li>Configurer l'unité de persistance dans le fichier application.properties</li>
    <li>Créer l'interface JPA Repository basée sur Spring Data</li>
    <li>Tester quelques opérations de gestion</li>
        <ul>
            <li>Ajouter des patients</li>
            <li>Consulter tous les patients</li>
            <li>Consulter un patient</li>
            <li>Chercher des patients</li>
            <li>Mettre à jour un patient</li>
            <li>supprimer un patient</li>
        </ul>
    <li>Migrer de h2 Database vers MySQL</li>
</ol>

<h2>Code</h2>
<p>Après installation d'IntelliJ Ultimate, j'ai créé un projet qui porte le
nom <b>jpa-tp</b> avec Spring Initializer en choisissant les dépendances
suivantes :</p>
<ul>
<li>JPA</li>
<li>H2</li>
<li>Spring Web</li>
<li>Lombock</li>
</ul>
<p>Si on consulte le fichier pom.xml, on remarque que les dépendances
ont été ajouté</p>
<img src="captures/dependencies.png" alt="dependencies">
<p>Ensuite, on crée l'entité JPA Patient avec les attributs demandés</p>
<img src="captures/Patient_Class.png" alt="classe patient">
<p>Maintenant, on doit stocker ces données dans une base de données H2.</p>
<p>Il faut préciser à Spring quelle unité de persistence on va utiliser.</p>
<p>fichier application.properties :</p>
<img src="captures/application_properties.png" alt="application.properties">
<p>La base de donnée qui va être créé portera le nom patient-db.</p>
<p><b>spring.h2.console.enabled=true</b> nous permet d'accéder à l'interface
de la base de donnée h2, lorsqu'on saisit localhost:8082/h2-console</p>
<p>Voici comment on crée l'interface JPA Repository basée sur Spring
Data de l'entité Patient.</p>
<img src="captures/JPARepository.png" alt="JPArepository">
<p>On a ajouté quelques méthodes pour les utiliser ensuite lors du test des
fonctionnalité de gestion des patients. </p>
<p>Test des opérations : </p>
<ul>
<li>Ajouter des patients</li>
<img src="captures/ajouterDesPatients.png" alt="ajout des patients">
<li>Consulter tous les patients</li>
<img src="captures/ConsulterToutLesPatients.png" alt="consulter les patients">
<li>Consulter un patient</li>
<img src="captures/consulter_un_patient.png" alt="consulter un patient" >
<li>Chercher des patients</li>
<img src="captures/chercherDesPatients.png" alt="chercher des patients">
<li>Mettre à jour un patient</li>
<img src="captures/mettre_a_jour_patient.png" alt="mettre à jour un patient">
<li>supprimer un patient</li>
<img src="captures/supprimerUnPatient.png" alt="supprimer un patient">
</ul>