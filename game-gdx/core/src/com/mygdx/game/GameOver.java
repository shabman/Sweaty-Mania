package com.mygdx.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class GameOver implements Screen {

    private final GameScreen gs;

    private final OrthographicCamera camera;

    public GameOver(GameScreen gs) {
        this.gs = gs;

        this.camera = new OrthographicCamera();
        this.camera.setToOrtho(false,800, 480);

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        gs.game.batch.setProjectionMatrix(camera.combined);

        gs.game.batch.begin();
        gs.game.font.draw(gs.game.batch, "Game over!", 800 / 2 - 64, 480 / 2);
        gs.game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
