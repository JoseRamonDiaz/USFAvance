package ultimateStarfighter;

import screens.USFLoadingScreen;
import framework.Screen;
import framework.impl.AndroidGame;

public class MrNomGame extends AndroidGame {
    public Screen getStartScreen() {
        return new USFLoadingScreen(this); 
    }
} 
