package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends Game {

	public BitmapFont font;

	MainMenuScreen menu;
	GameOver over;

	public SpriteBatch batch;

	@Override
	public void create () {
		font = new BitmapFont();
		batch = new SpriteBatch();
		menu = new MainMenuScreen(this);
		this.setScreen(menu);
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
		try {
			menu.gameScreen.dispose();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
