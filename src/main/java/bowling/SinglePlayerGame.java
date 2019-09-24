package bowling;

import java.util.ArrayList;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancés successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class SinglePlayerGame {
        private final ArrayList<Integer> quilleWin = new ArrayList<>();
        
	/**
	 * Constructeur
	 */
	public SinglePlayerGame() {            
	}

	/**
	 * Cette méthode doit être appelée à chaque lancé de boule
	 *
	 * @param nombreDeQuillesAbattues le nombre de quilles abattues lors de
	 * ce lancé
         * On ajoute le nombre de quille tombé à chaques lancé dans une arraylist
	 */
	public void lancer(int nombreDeQuillesAbattues) {
                quilleWin.add(nombreDeQuillesAbattues);
	}

	/**
	 * Cette méthode donne le score du joueur
	 *
	 * @return Le score du joueur
	 */
	public int score() {
		int score = 0;
		int tourActuel = 0;
		
                for (int i = 0; i < 10; i++){
                    
                    if(quilleWin.get(tourActuel) == 10){
                        score += 10 + (quilleWin.get(tourActuel+1) + quilleWin.get(tourActuel+2));
                        tourActuel ++;
                    }
                    
                    else if ((quilleWin.get(tourActuel) + quilleWin.get(tourActuel+1)) == 10){
				score += 10 + quilleWin.get(tourActuel+2);
				tourActuel += 2;
                    }
                    else{
                        score += (quilleWin.get(tourActuel) + quilleWin.get(tourActuel+1));
			tourActuel += 2;
                    }
		}
		return score;
	}
}
