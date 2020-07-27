package MazeGame.desktop;

import com.badlogic.gdx.Files.FileType;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import MazeGame.MazeGame;

/** Launches the desktop (LWJGL) application. */
import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
public class DesktopLauncher
{
	public static void main (String[] args)
	{
		Game myGame = new MazeGame();
		LwjglApplication launcher = new LwjglApplication( myGame, "Maze Runman", 768, 700 );
	}
}