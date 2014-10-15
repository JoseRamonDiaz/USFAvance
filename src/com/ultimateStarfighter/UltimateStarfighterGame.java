package com.ultimateStarfighter;

import screens.USFLoadingScreen;
import framework.Screen;
import framework.impl.AndroidGame;

public class UltimateStarfighterGame extends AndroidGame {
    public Screen getStartScreen() {
        return new USFLoadingScreen(this); 
    }
} 
