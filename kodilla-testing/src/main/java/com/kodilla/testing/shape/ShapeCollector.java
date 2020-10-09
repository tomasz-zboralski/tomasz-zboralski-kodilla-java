package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapesCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        //do nothing
    }

    public boolean removeFigure(Shape shape) {
        return false;
    }

    public Shape getFigure(int n){
        return null;
    }

    public String showFigures(){
        return " ";
    }

    public int getShapesCollectionQuantity() {
        return shapesCollection.size();
    }
}
