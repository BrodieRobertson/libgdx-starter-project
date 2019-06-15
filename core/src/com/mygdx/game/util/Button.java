package com.mygdx.game.util;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Abstract super class representing a ui button
 */
public abstract class Button {
    /**
     * The collider for this button
     */
    private Rectangle collider;

    /**
     * Button constructor, with no parameters
     */
    public Button() {
        collider = new Rectangle();
    }

    /**
     * Button constructor
     * @param x The x coordinate
     * @param y The y coordinate
     * @param width The width
     * @param height The height
     */
    public Button(float x, float y, float width, float height) {
        this.collider = new Rectangle(x, y, width, height);
    }

    /**
     * Button constructor
     * @param shape The shape of the button
     */
    public Button(Rectangle shape) {
        this.collider = shape;
    }

    /**
     * Gets the collider for this button
     * @return The collider
     */
    public Rectangle getCollider() {
        return collider;
    }

    /**
     * Gets the x coordinate of the button
     * @return The x coordinate
     */
    public float getX() {
        return collider.x;
    }

    /**
     * Gets the y coordinate of the button
     * @return
     */
    public float getY() {
        return collider.y;
    }

    /**
     * Gets the location of the button
     * @return The location
     */
    public Vector2 getLocation() {
        return new Vector2(getX(), getY());
    }

    /**
     * Gets the width of the button
     * @return The width
     */
    public float getWidth() {
        return collider.width;
    }

    /**
     * Gets the height of the button
     * @return The height
     */
    public float getHeight() {
        return collider.height;
    }

    /**
     * Sets the collider for this button
     * @param collider The new collider
     */
    public void setCollider(Rectangle collider) {
        this.collider = collider;
    }

    /**
     * Sets the collider fot this button
     * @param x The x coordiante
     * @param y The y coordinate
     * @param width The width
     * @param height The height
     */
    public void setCollider(float x, float y, float width, float height) {
        this.collider.x = x;
        this.collider.y = y;
        this.collider.width = width;
        this.collider.height = height;
    }

    /**
     * Sets the x coordinate of the button
     * @param x The x coordinate
     */
    public void setX(float x) {
        this.collider.x = x;
    }

    /**
     * Sets the y coordinate of the button
     * @param y The y coordinate
     */
    public void setY(float y) {
        this.collider.y = y;
    }

    /**
     * Sets the location of the button
     * @param x The x coordinate
     * @param y The y coordinate
     */
    public void setLocation(float x, float y) {
        this.collider.x = x;
        this.collider.y = y;
    }

    /**
     * The width of the button
     * @param width The width
     */
    public void setWidth(float width) {
        this.collider.width = width;
    }

    /**
     * The height of the button
     * @param height The height
     */
    public void setHeight(float height) {
        this.collider.height = height;
    }

    /**
     * Checks if a set of points is touching this button
     * @param x The x coordinate
     * @param y The y coordinate
     * @return True if touching, false otherwise
     */
    public boolean isTouching(float x, float y) {
        return collider.contains(x, y);
    }

    /**
     * Checks if a rectangle collider is overlapping this button
     * @param collider The collider
     * @return True if overlapping, false otherwise
     */
    public boolean isTouching(Rectangle collider) {
        return collider != null && this.collider.overlaps(collider);
    }

    /**
     * Renders the button to the screen
     * @param batch The batch
     * @param alpha The alpha level of the button
     */
    public abstract void render(SpriteBatch batch, float alpha);

    /**
     * Updates the state of the button
     * @param elapsedTime The time elapsed since the previous frame
     * @param checkTouch Check if the button is touched
     */
    public abstract void update(float elapsedTime, boolean checkTouch);

    /**
     * Disposed of the button resources
     */
    public abstract void dispose();
}
