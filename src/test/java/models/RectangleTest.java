package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle testRectangle;

    @BeforeEach
    void setUp() {
        testRectangle = new Rectangle(2,4);
    }

    @Test
    @DisplayName("Rectangle class should instantiate correctly")
    void newRectangle_instantsCorrectly() {
        assertEquals(true,testRectangle instanceof Rectangle);
    }

    @Test
    @DisplayName("Rectangle class should get length correctly")
    void newRectangle_getsLength_2() {
        assertEquals(2,testRectangle.getLength());
    }

    @Test
    @DisplayName("Rectangle class should get width correctly")
    void newRectangle_getsWidth_4() {
        assertEquals(4,testRectangle.getWidth());
    }

    @Test
    @DisplayName("To check the rectangle is not a square")
    void isSquare_whenNotASquare_false(){
        assertEquals(false,testRectangle.isSquare());
    }

    @Test
    @DisplayName("To check the rectangle is  a square")
    void isSquare_allSidesEqual_true(){
        testRectangle = new Rectangle(2,2);
        assertEquals(true,testRectangle.isSquare());
    }


}