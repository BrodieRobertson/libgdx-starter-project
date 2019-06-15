package com.mygdx.game.util;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TextButton extends Button {
    /**
     * The text of the button
     */
    private Text text;

    /**
     * TextButton constructor with no parameters
     */
    public TextButton() {
        super();
        this.text = new Text();
    }

    /**
     * Gets the text of the text button
     * @return The text
     */
    public Text getText() {
        return text;
    }

    /**
     * Sets the text of the text button
     * @param text The text
     * @return The new text
     */
    public void setText(Text text) {
        this.text = text;
        setCollider(text.getX(), text.getY(), text.getWidth(), text.getHeight());
    }

    /**
     * Renders the button to the screen
     *
     * @param batch The batch
     * @param alpha The alpha level of the button
     */
    @Override
    public void render(SpriteBatch batch, float alpha) {

    }

    /**
     * Updates the state of the button
     *
     * @param elapsedTime The time elapsed since the previous frame
     * @param checkTouch  Check if the button is touched
     */
    @Override
    public void update(float elapsedTime, boolean checkTouch) {

    }

    /**
     * Disposed of the button resources
     */
    @Override
    public void dispose() {

    }
}
