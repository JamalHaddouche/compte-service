# Premier Micro-service avec spring
Dans ce tp on crée un micro service qui s'appelle compteSrvice dans lesquel on gére les comptes.
la notation @data ajoute automatiquement les setters et les getters 
@NoArgsConstructor ajoute un construicteur son arguments
@AllArgConstructor ajoute un constructeur avec tout les arguments
@Id @GenerateVakue(Strategy=GenerateType.IDENTITY) pour générer un id qui s'incrémente automatiquement
@Enumerate(EnumType.STRING) le type de l'enumeration est un string dans la base de donnée
### test
![c7](https://user-images.githubusercontent.com/82270887/163655312-259ba696-6f81-4746-bf30-e281a404134a.png)
si nous voulons voir ce qui se passe dans la base de données,dans notre navigateur on appelle le lioen suivant
localhost:8080/h2-console
![c8](https://user-images.githubusercontent.com/82270887/163655362-a31853ae-8f26-47e3-bec6-e05576b3c67c.png)
cette interface nous a permis d'accedée à notre base de données
![c9](https://user-images.githubusercontent.com/82270887/163655385-857489ca-ce3b-46cc-9c63-3e58d53263b7.png)
On remarque que notre table comptre à été crée.
On cre=ée un Rest Controller (la classe CompteRestController),dans cette classe on crée une méthode qui récupére la liste des comptes
@GetMapping(path="/comptes") pour accéder à cette méthode avec la requet Get
lorsque on travail avec les micro service on crée plusieurs services dans notre machine ,ce qui fait que nous avons besoin d'attribuer
un numero de port pour chaque service.
Dans notre exemple on test avec un navigateur avec le lien localhost:8082/comptes on récupére la liste des comptes en format JSon

![c10](https://user-images.githubusercontent.com/82270887/163655611-a6e1bc63-986b-4e17-88f3-bdaa760b7b5f.png)
