# Cahier des charges : Le cercle des Scribouillards ! 
----

## Sommaire 
* Cadrage et périmètre 
    * Présentation du site
* Fonctionnalités du site 
    * Inscription
    * Connexion
    * Consulter Thème
    * Ajouter un thème 
* Méthodes et contraintes
    * Méthode agile 
    * Division du groupe
* Délais et parties prenantes
---

# Cadrage et périmètre
## Le but du site

### Public ciblé
Notre site "Le cercle des Scribouillards" reprends grossièrement le principe du site "Reddit". Il vise des jeunes adultes entre 20 ans et 40 ans assez à l'aise avec la technologie. Les amateurs de littérature seront majoritairement les utilisateurs à long terme du site. Les curieux pourront effectuer leur premier pas sans avoir un jugement ni code à respecter : c'est une écriture libre.

### Le but
Le site permet à tout amateur de s'initier à la rédaction. Le site impose aux lecteurs et aux écrivains de créer un compte. Au travers de leur compte, ils pourront proposer un thème et rédiger des articles. 

### La particularité du site
Les articles peuvent être votés. Le thème est cloturé automatiquement au bout d'un certains délais, passé ce délais c'est l'article qui a le plus vote qui l'emporte. 

Ainsi nous laissons libre pouvoir aux utilisateurs du site de produire gérer les thèmes et articles. D'autres fonctionnalités supplémentaires peuvent être ajoutés aux services proposé par le site. 

---
# Fonctionnalités du site 
## Inscription

En tant que client, je veux pouvoir **me créer un compte** pour accéder au site.
En tant que client, je veux pouvoir avoir un compte pour **renseigner mes informations**.

## Connexion

En tant que client, je veux pouvoir me connecter pour **accéder au site**.

## Créer thème

En tant que client, je veux pouvoir me connecter pour **créer des thèmes**.

## Consulter thème 

En tant que client connecté, je veux **consulter les thèmes en cours**. 
En tant que client connecté, je veux **consulter les thèmes archivés**. 

## Créer article

En tant que client, je veux pouvoir me connecter pour **créer des articles**.

## Consulter article

En tant que client, je veux pouvoir me connecter pour  **consulter un/des article(s)**.



---
# Méthodes et contraintes

## Méthode agile
Nous avons fait le choix de travailler en méthode agile. Nos sprints sont fixés à 2 semaines. Nous procédons à chaque séance par : 
* Un point d'équipe (5 à 10 min)
* Division du groupe 
    * Partie développement 
        * back-end
        * front-end
    * Partie documentation / gestion
        * maintenance du cahier des charges
        * mise à jour du Trello [Lien vers le tableau de bord](https://trello.com/b/EGMybPUS "Tableau de bord Trello")
        * mise à jour du compte rendu à chaque séance
        
## Contraintes

Nous disposons d'une séance commune de 3h30 par semaine. Ce temps est consacré à des discussions sur l'avancé du projet. Il nous sert également à régler les soucis techniques qui sont difficiles à gérer à distance.

---
# Délais et parties prenantes 
## Le délais
Le projet est à rendre pour fin janvier. Nous disposons ainsi 3 mois pour réaliser notre application et préparer la soutenance.

Afin d'anticiper une baisse d'activité durant la fin décembre - début janvier, nous avancerons un maximum sur le développement de l'application. Durant cette période critique, il sera plus facile d'avancer sur la documentation (nécessite moins de communication ni prise de décision commune). 

---
# Test d'acceptation

## Condition de satisfaction

Les conditions de satisfaction permettent d'indiquer la réalisation d'une user story. En effet, si toutes les conditions sont satisfaites alors la story est acceptée et est considérée comme terminée.

| Story    | Condition de satisfaction    | 
| ------------- |:----------------:| 
| Inscription|   1.  **Inscription validée** : son inscription a été validée (login et mot de passe correctes), le client peut se connecter au site. 2.  **Inscription refusée** :le mail indiqué par le client est déjà utilisé, l'utilisateur n'a saisi aucun champs, le login ou mot de passe saisi par l'utilisateur est erroné | 
| Connexion | 1. **Connexion validée** : (inscription validée) le client a saisi des identifiants correctes, il peut accéder au site 2. **Connexion refusée** : le login et/ou mot de passe indiqués sont erronés, le client ne peut pas accéder au site|
| Créer thème |  1. **Création de thèmes**: le client peut créer un nouveau thème et  le client ne peut créer plusieurs fois un thème avec le même titre    |
| Consulter thème | 1. **Affichage des thèmes** : le client peut consulter les thèmes | 
| Créer article |  1. **Création d'articles**: le client peut accéder à un thème puis créer un nouvel article |
| Consulter article |  1. **Affichage des articles**: le client peut consulter les articles   |
 


## Storytests
### Inscription et Connexion
* Inscription validée

Étant donné l'utilisateur Sami connecté et qu'il existe des thèmes
Quand Sami veut consulter les thèmes
Alors la liste des thèmes disponibles s'affiche

Étant donné l'utilisateur Sami connecté et qu'il n'existe pas de thèmes
Quand Sami veut créer un thème
Alors une pop-up apparaît et lui permets de créer un thème

Étant donné l'utilisateur Sami connecté et qu'il existe des articles dans un thème
Quand Sami veut créer un article
Alors une pop-up apparaît et lui permets de créer un article dans un thème

Étant donné l'utilisateur Sami connecté et qu'il n'existe pas d'articles dans un thème
Quand Sami veut créer un article
Alors une pop-up apparaît et lui permets de créer un article dans un thème


* Inscription refusée

Étant donné l'utilisateur Sami déjà inscrit avec l'adresse mail bg@mail.com
Quand Marina essaye de s'inscrire avec la même adresse mail
Alors l'inscription de Marina est refusée et le message "Cette adresse mail est déjà utilisée par un autre utilisateur" apparaît.

Étant donné l'utilisateur Sami qui essaye de s'inscrire 
Quand Sami saisit un mot de passe différent lors de la confirmation de mot de passe
Alors l'inscription de Sami est refusée et le message "DEMANDER A MOHA" apparaît.

* Connexion acceptée

Étant donné l'utilisateur Moha qui essaye de se connecter
Quand Moha saisit une adresse mail et un mot de passe correcte
Alors la connexion au site est établie.

* Connexion refusée

Étant donné l'utilisateur Moha qui essaye de se connecter
Quand Moha saisit une adresse mail erronée
Alors la connexion de Moha est refusée et le message "DEMANDER A MOHA" apparaît.

Étant donné l'utilisateur Moha qui essaye de se connecter
Quand Moha saisit un mot de passe erroné
Alors la connexion de Moha est refusée et le message "DEMANDER A MOHA" apparaît.

### Création thème

* Création thème

Étant donné l'utilisateur Marina connecté et qu'il existe des thèmes
Quand Marina veut ajouter un nouveau thème
Alors un bouton lui permets d'ouvrir une pop-up qui lui permettra de le faire

Étant donné l'utilisateur Sami connecté et qu'il existe le thème "Les rohingyas"
Quand Sami veut ajouter un nouveau thème avec le même titre
Alors le message "Ce thème a déjà été proposé" est affiché à Sami

### Consulter thème

* Consulter thème

Étant donné l'utilisateur Betti connecté 
Quand Betti veut consulter les thèmes disponibles 
Alors la liste des thèmes disponibles apparaît

### Création article

* Création d'article

Étant donné l'utilisateur Marina connecté et le thème "Sauver les pingouins" choisi
Quand Marina veut créer un article
Alors un formulaire s'affiche et lui permets de le faire

### Consulter article

* Consulter articles

Étant donné l'utilisateur Marina connecté et le thème "Sauver les pingouins" choisi
Quand Marina veut consulter un article
Alors l'article choisi apparaît

## Passage des storytests


