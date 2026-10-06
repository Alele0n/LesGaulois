package test_fonctionnel;

import personages.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Gaulois Obelix = new Gaulois("Obelix", 16);

		Asterix.parler("Bonjour Obelix");
		Obelix.parler("Bonjour Asterix. Ca te dirais d'aller chaser des sangliers?");
		Asterix.parler("Oui tres bonne idee");
	}
}
