import static org.junit.Assert.assertEquals;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

public class ComparaisonSecteurTest {
	private static final Logger logger = (Logger) LogManager.getLogger(AppTest.class);


	@Test 
	public void ComparerSecteurs() throws AnimalDansMauvaisSecteurException
	{
        BasicConfigurator.configure();

		Secteur secteur1 = new Secteur(TypeAnimal.CHAT);
		logger.info (" Nouveau secteur : " +
				secteur1.getClass().toString() );
		Secteur secteur2 = new Secteur(TypeAnimal.CHAT);
		
		Chat chat1 = new Chat("chat1",TypeAnimal.CHAT);
		logger.info (" Nouvel animal : " +
				chat1.getClass().toString() );
		Chat chat2 = new Chat("chat2",TypeAnimal.CHAT);
		Chat chat3 = new Chat("chat3",TypeAnimal.CHAT);
		Chat chat4 = new Chat("chat4",TypeAnimal.CHAT);
		logger.info (" Nouvel animal : " +
				chat2.getClass().toString() );
		
		secteur1.ajouterAnimal(chat1);
		secteur1.ajouterAnimal(chat2);
		secteur1.ajouterAnimal(chat3);
		
		secteur2.ajouterAnimal(chat4);
		
		logger.info (" Nouvel animal : " +
				chat1.getClass().toString() );
		
		ComparaisonSecteur cs = new ComparaisonSecteur();
		assertEquals(cs.compare(secteur1, secteur2),1);
		assertEquals(secteur1.compareTo(secteur2),1);

		
		
	}
	
}