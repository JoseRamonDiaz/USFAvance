package screens;

import com.ultimateStarfighter.Assets;
import com.ultimateStarfighter.Settings;

import framework.Game;
import framework.Graphics;
import framework.Graphics.PixmapFormat;
import framework.Screen;

public class USFLoadingScreen extends Screen {
    public USFLoadingScreen(Game game) {
        super(game);
    }

    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.background = g.newPixmap("spacebg.gif", PixmapFormat.RGB565);
        Assets.logo = g.newPixmap("usfLogo.png", PixmapFormat.ARGB4444);
        Assets.mainMenu = g.newPixmap("usfMainMenu.png", PixmapFormat.ARGB4444);
        Assets.buttons = g.newPixmap("usfButtons.png", PixmapFormat.ARGB4444);
        Assets.enemyAircraft = g.newPixmap("e_f1.png", PixmapFormat.ARGB4444);
        Assets.pause = g.newPixmap("usfPauseMenu.png", PixmapFormat.ARGB4444);
        Assets.gameOver = g.newPixmap("usfGameOver.png", PixmapFormat.ARGB4444);
        Assets.aircraft = g.newPixmap("spriteF1.png",PixmapFormat.ARGB4444);
        //No nos sirve
        Assets.help1 = g.newPixmap("help1.png", PixmapFormat.ARGB4444);
        Assets.help2 = g.newPixmap("help2.png", PixmapFormat.ARGB4444);
        Assets.help3 = g.newPixmap("help3.png", PixmapFormat.ARGB4444);
        Assets.numbers = g.newPixmap("numbers.png", PixmapFormat.ARGB4444);
        Assets.ready = g.newPixmap("ready.png", PixmapFormat.ARGB4444);
        Assets.headUp = g.newPixmap("headup.png", PixmapFormat.ARGB4444);
        Assets.headLeft = g.newPixmap("headleft.png", PixmapFormat.ARGB4444);
        Assets.headDown = g.newPixmap("headdown.png", PixmapFormat.ARGB4444);
        Assets.headRight = g.newPixmap("headright.png", PixmapFormat.ARGB4444);
        Assets.tail = g.newPixmap("tail.png", PixmapFormat.ARGB4444);
        Assets.stain1 = g.newPixmap("stain1.png", PixmapFormat.ARGB4444);
        Assets.stain2 = g.newPixmap("stain2.png", PixmapFormat.ARGB4444);
        Assets.stain3 = g.newPixmap("stain3.png", PixmapFormat.ARGB4444);
        Assets.click = game.getAudio().newSound("click.ogg");
        Assets.eat = game.getAudio().newSound("eat.ogg");
        Assets.bitten = game.getAudio().newSound("bitten.ogg");
        
        Settings.load(game.getFileIO());
        game.setScreen(new USFMainMenuScreen(game));
    }
    
    public void present(float deltaTime) {

    }

    public void pause() {

    }

    public void resume() {

    }

    public void dispose() {

    }
}
