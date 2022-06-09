# Premier Micro-service avec spring
Dans ce tp on crée un micro service qui s'appelle compteSrvice dans lesquel on gére les comptes.

la notation @data ajoute automatiquement les setters et les getters 
@NoArgsConstructor ajoute un construicteur son arguments
@AllArgConstructor ajoute un constructeur avec tout les arguments
@Id @GenerateVakue(Strategy=GenerateType.IDENTITY) pour générer un id qui s'incrémente automatiquement
@Enumerate(EnumType.STRING) le type de l'enumeration est un string dans la base de données.

### test
![c7](https://user-images.githubusercontent.com/82270887/163655312-259ba696-6f81-4746-bf30-e281a404134a.png)

si nous voulons voir ce qui se passe dans la base de données,dans notre navigateur on appelle le lien suivant
localhost:8080/h2-console
![c8](https://user-images.githubusercontent.com/82270887/163655362-a31853ae-8f26-47e3-bec6-e05576b3c67c.png)

cette interface nous a permis d'accedée à notre base de données

![c9](https://user-images.githubusercontent.com/82270887/163655385-857489ca-ce3b-46cc-9c63-3e58d53263b7.png)
On remarque que notre table comptre à été crée.
On crée un Rest Controller (la classe CompteRestController),dans cette classe on crée une méthode qui récupére la liste des comptes
@GetMapping(path="/comptes") pour accéder à cette méthode avec la requet Get
lorsque on travail avec les micro service on crée plusieurs services dans notre machine ,ce qui fait que nous avons besoin d'attribuer
un numero de port pour chaque service.
Dans notre exemple on test avec un navigateur avec le lien localhost:8082/comptes on récupére la liste des comptes en format JSon

![c10](https://user-images.githubusercontent.com/82270887/163655611-a6e1bc63-986b-4e17-88f3-bdaa760b7b5f.png)
Pour consulter un compte on utilise @GetMapping(path="/compte/{id}"}

![c11](https://user-images.githubusercontent.com/82270887/163655712-5f802485-62fa-4624-aff8-5caf8fd33d41.png)

Notre MicroService permet de récupérer liste des comptes,un compte par id,mettre à jour un compte,supprimer un compte

## POSTMAN
### AJOUTER UN COMPTE AVEC POSTMAN

![c13](https://user-images.githubusercontent.com/82270887/163655768-0ab061d7-129c-42d8-9b56-cf520e40ee51.png)

### MODIFIER UN COMPTE AVEC POSTMAN

![c14](https://user-images.githubusercontent.com/82270887/163655803-ec2bb613-a3b1-4259-9e6f-2212ee0f1d6f.png)

## SWAGGER
On peut aussi tester avec swagger 

![c15](https://user-images.githubusercontent.com/82270887/163655836-7144fd0c-e1f9-4537-93db-7832bf852bd0.png)

### liste des comptes

![c16](https://user-images.githubusercontent.com/82270887/163655853-d983ac6c-c107-4a3f-a174-c1af996ff2e3.png)

### AJOUTER UN COMPTE AVEC SWAGGER

![c17](https://user-images.githubusercontent.com/82270887/163655873-a2edc2f3-81f7-438f-a472-63eb7a184483.png)

### AFFICHER UN COMPTE PAR SON ID

![c18](https://user-images.githubusercontent.com/82270887/163655892-d0a26dea-1cb6-4619-9928-e3d07a3d31ae.png)

### SUPPRIMER UN COMPTE AVEC SWAGGER

![c19](https://user-images.githubusercontent.com/82270887/163655898-20cf47c8-45c5-4f80-9029-e1b90a0199d0.png)
### Projection
Puis on va créer une interface pour faire une projection qui s'appelle p1 et qui permet d'afficher le code et le solde ,la commande suivant http://localhost:8082/comptes/1?projection=p1 affiche le résultat avec la projection p1 :

![image](https://user-images.githubusercontent.com/82270887/172942214-b4fa737d-a85c-40ce-8177-4ee1d5edecda.png)

. Après on va créer une projection 2 qui permet d'afficher le solde et le type de compte, la commande suivant http://localhost:8082/comptes/1?projection=p2 affiche le résultat avec la projection p2 :
![image](https://user-images.githubusercontent.com/82270887/172942673-7e025db5-8f6c-4b27-a47b-323183139ca5.png)



