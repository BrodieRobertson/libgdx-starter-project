package com.mygdx.game.util;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Wrapper class to display text
 */
public class Text {
    /**
     * The text layout
     */
    private GlyphLayout layout;
    /**
     * The rendered string
     */
    private String text;
    /**
     * The font used by this text
     */
    private BitmapFont font;
    /**
     * The x position
     */
    private float x;
    /**
     * The y position
     */
    private float y;

    /**
     * Default constructor for text
     */
    public Text() {

    }

    /**
     * Constructor for Text
     *
     * @param layout The text layout
     * @param font The font of the text
     * @param text The rendered string
     * @param x The x position
     * @param y The y position
     */
    public Text(GlyphLayout layout, BitmapFont font, String text, float x, float y) {
        this.layout = layout;
        this.font = font;
        this.text = text;
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the x position
     * @return The x position
     */
    public float getX() {
        return x;
    }

    /**
     * Gets the y position
     * @return The y position
     */
    public float getY() {
        return y;
    }
    /**
     * Gets the width of the text
     * @return The width of the text
     */
    public float getWidth() {
        return layout.width;
    }

    /**
     * Gets the height of the text
     * @return The height of the text
     */
    public float getHeight() {
        return layout.height;
    }

    /**
     * Gets the font of the button
     * @return The font
     */
    public BitmapFont getFont() {
        return font;
    }

    /**
     * Gets the text layout
     * @return The text layout
     */
    public GlyphLayout getLayout() {
        return layout;
    }

    /**
     * Gets the text string
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the x position
     * @param x The x position
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Sets the y position
     * @param y The y position
     */
    public void setY(float y) {
        this.y = y;
    }

    /**
     * Sets the font of the button
     * @param font The font
     */
    public void setFont(BitmapFont font) {
        this.font = font;
    }

    /**
     * Sets the text layout
     * @param layout The new layout
     */
    public void setLayout(GlyphLayout layout) {
        this.layout = layout;
    }

    /**
     * Sets the rendered text
     * @param text The new text
     */
    public void setText(String text) {
        layout.setText(font, text);
        this.text = text;
    }

    /**
     * Sets the text and a new font
     * @param text The new text
     * @param font The new font
     */
    public void setText(String text, BitmapFont font) {
        this.font = font;
        setText(text);
    }

    /**
     * Sets the text, a new font and a new layout
     * @param text The new text
     * @param font The new font
     * @param layout The new layout
     */
    public void setText(String text, BitmapFont font, GlyphLayout layout) {
        this.layout = layout;
        setText(text, font);
    }

    /**
     * Renders the text on the screen
     * @param batch The sprite batch
     */
    public void render(SpriteBatch batch) {
        font.draw(batch, layout, x, y);
    }

    /**
     * Renders the text on the screen, with a different font
     * @param batch The sprite batch
     * @param font The font
     */
    public void render(SpriteBatch batch, BitmapFont font) {
        font.draw(batch, layout, x, y);
    }

    /**
     * Updates the state of the text
     */
    public void update(float elapsedTime) {

    }

    /**
     * Disposes of the Text resources
     */
    public void dispose() {

    }
}
