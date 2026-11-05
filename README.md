# SmartQueue – Système de gestion des files d'attente

## 1. Présentation du projet

SmartQueue est une application web permettant de gérer les files d'attente et les tickets des clients. Elle facilite l'organisation des services et le suivi des clients.

## 2. Technologies utilisées

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST API
- Postman

## 3. Entités principales

Le projet contient six entités :

1. Client
2. Service
3. Agent
4. Queue (File d'attente)
5. Ticket
6. Notification

Ces entités sont liées entre elles à l'aide des relations JPA.

## 4. Fonctionnalités

- Ajouter, consulter, modifier et supprimer des clients.
- Gérer les services.
- Gérer les agents.
- Gérer les files d'attente.
- Créer et suivre les tickets.
- Gérer les notifications.
- Rechercher les tickets par statut ou par client.
- Rechercher les files d'attente par statut.
- Valider les données saisies et gérer les erreurs.

## 5. API REST

Les principales routes sont :

| Ressource | Endpoint |
|---|---|
| Clients | `/api/clients` |
| Services | `/api/services` |
| Agents | `/api/agents` |
| Files d'attente | `/api/queues` |
| Tickets | `/api/tickets` |
| Notifications | `/api/notifications` |

## 6. Base de données

Nom de la base de données : `smartqueue_db`

SGBD : MySQL.

La configuration de connexion est définie dans `application.properties`.

## 7. Lancement du projet

1. Démarrer MySQL.
2. Ouvrir le projet dans Spring Tools Suite.
3. Vérifier la configuration de la base de données.
4. Lancer `SmartQueueApplication.java`.
5. Tester les endpoints avec Postman.

## 8. Tests

Les API REST sont testées avec Postman à travers les méthodes GET, POST, PUT et DELETE.

## 9. Auteur

Projet académique – Développement Web avec Spring Boot.