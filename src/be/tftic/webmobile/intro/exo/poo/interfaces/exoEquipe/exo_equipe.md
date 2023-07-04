--------------------------------------------------------------------------------------
Créez une interface 'Equipier' permettant de reunir les types de Sportif pouvant jouer en equipe.

Equipier:
---------
- récupérer l'équipe dans laquelle ils jouent
- modifier l'équipe dans laquelles ils jouent

Créez la classe equipe.

Equipe:
-------
- collection de joueur
-------
- ajouter des joueurs (on ne peut ajouter que
des joueurs n'ayant pas déjà une equipe (null))
- supprimer des joueurs (son equipe devient null)

!ATTENTION! La classe equipe devrait fonctionner avec n'importe quel Sportif en equipe.


Main:
-----

testez les cas suivants:

- Créer un equipe
- Créer un Sportif pouvant jouer en equipe(Basketteur par exemple)
- ajouter un basketteur sans equipe dans une equipe (on devrait pouvoir récupérer la bonne equipe)
- supprimer le basketteur de l'equipe (son equipe devrait devenir null)
- ajouter un basketteur ayant déjà une equipe
- supprimer un basketter qui n'est pas dans l'equipe