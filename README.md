# 🛒 Gestion des produits — Spring Boot & JPA

## 📌 Description du projet

Ce projet consiste à développer une API REST permettant de gérer des produits à l'aide de **Spring Boot**, **Spring Data JPA**, **H2 Database** et **Lombok**.

L'application permet d'effectuer les opérations CRUD (*Create, Read, Update, Delete*) sur les produits.

## 🗂️ Structure du projet

<img width="464" height="740" alt="Screenshot 2026-10-24 at 16 16 00" src="https://github.com/user-attachments/assets/2c23d89a-5f17-4fa0-b27d-a9729a4f41fe" />

## ▶️  Lancement de l'application

<img width="1405" height="961" alt="Screenshot 2026-10-22 at 21 42 27" src="https://github.com/user-attachments/assets/4d8ca2bb-1734-473e-93e8-5b25a9a7bc1d" />

 ## Console H2

<img width="811" height="410" alt="Screenshot 2026-10-22 at 21 44 09" src="https://github.com/user-attachments/assets/5ea019a0-a4d6-4cfc-bc3a-17cb7fb847bc" />

-----------------------------

## 🛠️ Technologies utilisées

| Technologie | Description |
|---|---|
| Java | Langage de programmation |
| Spring Boot | Création de l'application |
| Spring Web | Développement de l'API REST |
| Spring Data JPA | Accès aux données et opérations CRUD |
| Hibernate | Implémentation de JPA |
| H2 Database | Base de données relationnelle en mémoire |
| Lombok | Réduction du code répétitif |
| swagger | visualiser et tester facilement une API REST |
| IntelliJ IDEA Ultimate | Environnement de développement |
| Maven | Gestion des dépendances |


### Explication du fichier application properties

- `jdbc:h2:mem:products-db` : crée une base de données H2 en mémoire.
- `ddl-auto=update` : met à jour le schéma de la base selon les entités JPA.
- `show-sql=true` : affiche les requêtes SQL dans la console.
- `h2.console.enabled=true` : active la console Web H2.

**Remarque :** la base en mémoire est réinitialisée à l'arrêt de l'application.

## 🧩 1. Création du Repository

Créer l'interface `ProductRepository` dans le package `repository`.

Elle étend `JpaRepository<Product, Long>`, ce qui permet d'utiliser les opérations CRUD fournies par Spring Data JPA sans écrire manuellement les requêtes SQL de base.

Exemples d'opérations disponibles :

- `save(product)` : ajouter ou mettre à jour un produit.
- `findAll()` : récupérer tous les produits.
- `findById(id)` : rechercher un produit par son identifiant.
- `deleteById(id)` : supprimer un produit.

Pour effectuer des recherches personnalisées, il est également possible de définir des méthodes comme `findByNameContaining(String name)`.

## 🌐 2. Création de l'API REST

Créer un contrôleur REST `ProductRestController` dans le package `web`.

Les endpoints permettent de manipuler les produits à travers des requêtes HTTP.

| Méthode HTTP | Endpoint | Description |
|---|---|---|
| `POST` | `/products` | Ajouter un produit |
| `GET` | `/products` | Consulter tous les produits |
| `GET` | `/products/{id}` | Consulter un produit par son ID |
| `GET` | `/products/search?keyword=...` | Rechercher des produits |
| `PUT` | `/products/{id}` | Mettre à jour un produit |
| `DELETE` | `/products/{id}` | Supprimer un produit |

Les endpoints exacts dépendent des annotations et des chemins définis dans le contrôleur.

## 🧪 3. Tests des opérations CRUD avec Swagger

L'API est testée avec Swagger.

### Ajouter un produit

<img width="1441" height="996" alt="Screenshot 2026-10-23 at 16 54 02" src="https://github.com/user-attachments/assets/07ef1025-8a74-4aed-8b71-9bb9d060374d" />
<img width="782" height="695" alt="Screenshot 2026-10-23 at 17 03 16" src="https://github.com/user-attachments/assets/e3e64020-9bf0-4044-ad75-5d5085feead4" />

-------------------------------

### Consulter tous les produits

<img width="784" height="650" alt="Screenshot 2026-10-23 at 16 44 31" src="https://github.com/user-attachments/assets/61dbaf29-05ad-401c-90b9-414070075f1a" />

-------------------------------

### Consulter un produit par son ID

<img width="785" height="639" alt="Screenshot 2026-10-23 at 16 45 04" src="https://github.com/user-attachments/assets/5fe2c744-a856-4bef-b79d-8c4c075690bb" />

-------------------------------

### Rechercher des produits

<img width="788" height="832" alt="Screenshot 2026-10-23 at 16 45 50" src="https://github.com/user-attachments/assets/2e511d62-cf85-49ab-b7e4-3263529ed68b" />

-------------------------------

### Mettre à jour un produit

<img width="708" height="695" alt="Screenshot 2026-10-24 at 16 05 57" src="https://github.com/user-attachments/assets/5f963f56-8c5a-4eed-a60c-576981b85542" />
<img width="351" height="417" alt="Screenshot 2026-10-24 at 16 06 11" src="https://github.com/user-attachments/assets/81f6520d-2391-4d49-893f-7a326f919711" />

-------------------------------

### Supprimer un produit

<img width="794" height="894" alt="Screenshot 2026-10-24 at 15 51 59" src="https://github.com/user-attachments/assets/b0bcb2b9-e059-4a1c-911a-b178566c97a1" />

-------------------------------

## 📚 Conclusion

Ce projet permet de comprendre les principes fondamentaux de **JPA et ORM**, l'utilisation de **Spring Data JPA**, la configuration d'une base de données H2 et la création d'une API REST avec Spring Boot.

Il constitue une première étape vers le développement d'applications Java connectées à une base de données relationnelle.

---
