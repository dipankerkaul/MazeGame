package MazeGame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.Input.Keys;

public class LevelScreen extends BaseScreen
{
    Maze maze;

    public void initialize()
    {
        BaseActor background = new BaseActor(0,0,mainStage);
        background.loadTexture("white.png");
        background.setColor(Color.GRAY);
        background.setSize(768, 700);
        maze = new Maze(mainStage);
    }
    public void update(float dt)
    { }
    public boolean keyDown(int keyCode)
    {
        if ( keyCode == Keys.R )
            BaseGame.setActiveScreen( new LevelScreen() );
        return false;
    }
}
