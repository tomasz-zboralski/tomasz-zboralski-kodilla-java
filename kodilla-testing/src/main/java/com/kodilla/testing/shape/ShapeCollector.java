package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapesCollection = new ArrayList<>();

    public void addFigure(Shape shape){
        shapesCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesCollection.contains(shape)){
            shapesCollection.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n){
        Shape theFigure = null;
        if (n >= 0 && n < shapesCollection.size()){
            theFigure = shapesCollection.get(n);
        }
        return theFigure;
    }

    public String showFigures(){
        String s = shapesCollection.toString();
        return s;
    }

    public int getShapesCollectionQuantity() {
        return shapesCollection.size();
    }
}
