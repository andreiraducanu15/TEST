package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

public class Ship extends Character{
    
    private Polygon character;
    private Point2D movement;
    
    public Ship (int x, int y){
        super (new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }

//    public Polygon getCharacter() {
//        return character;
//    }
//    
//    public void turnLeft() {
//        this.character.setRotate(this.character.getRotate() - 5);
//    }
//    
//    public void turnRight() {
//        this.character.setRotate(this.character.getRotate() + 5);
//    }
//    
//    public void move() {
//        this.character.setTranslateX(this.character.getTranslateX() 
//                + this.movement.getX());
//        this.character.setTranslateY(this.character.getTranslateY() 
//                + this.movement.getY());
//    }
//    
//    // For moving the ship 
//    public void accelerate(){
//        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
//        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));
//        
//        changeX *= 0.05;
//        changeY *= 0.05;
//        
//        this.movement = this.movement.add(changeX, changeY);
//    }
}
