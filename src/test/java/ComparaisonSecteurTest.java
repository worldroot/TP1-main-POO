import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ComparaisonSecteurTest {

	@Test 
	public void ComparerSecteurs() throws AnimalDansMauvaisSecteurException
	{
		Secteur secteur1 = new Secteur(TypeAnimal.CHAT);
		Secteur secteur2 = new Secteur(TypeAnimal.CHAT);
		
		Chat chat1 = new Chat("chat1",TypeAnimal.CHAT);
		Chat chat2 = new Chat("chat2",TypeAnimal.CHAT);
		Chat chat3 = new Chat("chat3",TypeAnimal.CHAT);
		Chat chat4 = new Chat("chat4",TypeAnimal.CHAT);
		
		secteur1.ajouterAnimal(chat1);
		secteur1.ajouterAnimal(chat2);
		secteur1.ajouterAnimal(chat3);
		
		secteur2.ajouterAnimal(chat4);
		
		ComparaisonSecteur cs = new ComparaisonSecteur();
		assertEquals(cs.compare(secteur1, secteur2),1);
		assertEquals(secteur1.compareTo(secteur2),1);

		
		
	}
	
}