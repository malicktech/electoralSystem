# Le problème a résoudre

==========================================
Elle demandera les renseignements suivants à l'utilisateur :
- nombre de sièges à pourvoir
- nombre de listes en compétition
- pour chaque liste : son nom, son nombre de voix

Avec ces renseignements, l'application calcule les sièges obtenus par chacune des listes et les affiche.

Elimine les listes n'ayant pas atteint la barre du % minimum défini


# TODO LIST


# module API : 
	virer le mapping JOSN qui est fait automatiquement si on renvoi les entités
	faile le mapping si on renvois un reponse autre


# L'algorithme : 
	use map may be more easiest
	

# code 
	* variable, comment and method in english
	* recupération seuil and siege : reunir dans une mêm fonction
	* change elimine to status or .. / and isElimine to getElimi
	* change primitive type to wrapper
	* définir les niveau de log spring sur fihcier properties
	https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-logging.html
	* use : classe exceptions, enum, ClasseTest

# les cas spécfiques a gérer : 
	egalité aux niveaux des voix
	égalité aux niveaux des moyennes	



# module CORE
	link : liste and elections 
	vire les tableaus 
	change crudreposiroty to jpareposiroty



USE JAVA 8 / Stream sur les list / Sort /
delete : List.newArrayList() by source.forEach(target::add)
delete guava of all projet

add bean validation
add client side validation / JQUERY

Gestion de plusieurs département
Répartition des résusltats par département : sur carte interracif
Classement par département/Région/pays

Appliquer aux elections légistative Française
gérer plusieur election / chaue lection ses property / ses listes / ses résultats

ajout tables résultats : au cloture des lection
ajout status sur elections / date début / date fin
les bureau de vote liée à une election 

ajouter des graphes charts / avec spring MVC / Angualr


virer maven surfire : 
utilisé pour <!-- pour l'installation de l'artifact du projet dans le dépôt local Maven -->
check maven-assembly-plugin ???