package MazeGame;

import com.badlogic.gdx.ApplicationAdapter;

public class MazeGame extends BaseGame
{
    public void create()
    {
        super.create();
        setActiveScreen( new LevelScreen() );
    }
}