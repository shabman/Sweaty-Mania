package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainMenuScreen implements Screen {

    final MyGdxGame game;

    public GameScreen gameScreen;

    private final OrthographicCamera camera;

    public MainMenuScreen(MyGdxGame game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0.2f, 1);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.font.draw(game.batch, "Welcome to Sweaty Mania", 800 / 2 - 64, 480 - 64);
        game.font.draw(game.batch, "Tap anywhere to  begin!", 800 / 2 - 64, 480 / 2 - 64);
        game.batch.end();

        if (Gdx.input.isTouched()) {
            gameScreen = new GameScreen(game);
            game.setScreen(gameScreen);
            dispose();
        }
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {
        System.out.println("paused");
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
