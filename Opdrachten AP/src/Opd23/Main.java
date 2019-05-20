package Opd23;

/**
 * Het grote is verschil tussen compositie en overerving:
 * Met overerving is er een 'is' relatie met een andere klasse
 * Met compositie is er een 'heeft' relatie met een andere klasse
 *
 * In dit code voorbeeld is duidelijk het verschil te zien tussen overerving en compositie:
 *
 * Overerving:
 * class One {}
 * class Two extends One {}
 *
 * Compositie:
 * class One {}
 * class Two {
 *     One een = new One()
 * }
 *
 * bij compositie wordt een klasse object bewaard in een instantie variabele.
 * class Two heeft een nieuw object opslagen onder variabele een.
 * Dit object HEEFT de inhoud van klasse One en deze kunnen ook aangeroepen en gebruikt worden.
 *
 * Bij overerving is klasse Two klasse One, de basis.
 * Hierbij wordt alle inhoud van klasse One overgenomen en door klasse Two eigen gemaakt
 * Er kan nu voor klasse Two apart nog inhoud toegevoegd worden.
 */

public class Main {
    public static void main(String[] arg) {
    }
}

