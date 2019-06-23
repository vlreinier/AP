Dijkstra Shortest Path Algorithm


Omdat ik bij de opdracht in canvas niet precies snapte wat er bedoeld en gevraagd werd
(en ik ook niet veel tijd meer had) heb ik een eigen geschreven uitwerking van het algoritme gemaakt.

Ik heb zo goed mogelijk proberen uit te leggen welke stappen het algoritme neemt, en waarom. De basis van het algoritme is:

Elke stad heeft een kortste afstand van beginpunt naar zichzelf.
Elke stad heeft een beste vorige stad qua afstand.

Door bovenstaande berekeningen uit te voeren, kan voor elke stad de korste route van het startpunt naar zichzelf 
berekend worden.


Ik was eerst begonnen met handmatig steden aan te maken in de main class, tot ik erachter kwam dat de steden ook 
automatisch aan de hand van de gegeven stadsconnecties aangemaakt konden worden. Daarom heb ik 2 packages. 
Package DijkstraAlgorithm is de definitieve uitwerking waar ik op verder gegaan ben, DijkstraManualCitiesOlD is de 
oudere variant.

(geen dependencies vereist voor package DijkstraAlgorithm. klassen, functies en variabelen zijn package-private)