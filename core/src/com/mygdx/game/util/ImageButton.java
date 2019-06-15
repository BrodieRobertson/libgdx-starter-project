package com.mygdx.game.util;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Class representing a ui button with an image on it
 */
public class ImageButton extends Button {
    /**
     * The image used by the button
     */
    private Texture image;

    /**
     * ImageButton constructor with no parameters, this constructor does not initialize the image
     */
    public ImageButton() {
        super();
    }

    /**
     * ImageButton constructor
     * @param image The image shown on the button
     * @param x The x coordinate of the button
     * @param y The y coordinate of the button
     */
    public ImageButton(Texture image, float x, float y) {
        super(x, y, image.getWidth(), image.getHeight());
    }

    /**
     * Gets the image of the button
     * @return The image
     */
    public Texture getImage() {
        return image;
    }

    /**
     * Sets the image of the button
     * @param image The image
     */
    public void setImage(Texture image) {
        this.image = image;
        this.setHeight(image.getHeight());
        this.setWidth(image.getWidth());
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
        image.dispose();
    }
}
