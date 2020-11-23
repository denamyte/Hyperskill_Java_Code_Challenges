//import java.util.List;

import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        for (Shape shape : array) {
            if (shape instanceof Square) {
                squares.add((Square) shape);
            } else if (shape instanceof Polygon) {
                polygons.add((Polygon) shape);
            } else if (shape instanceof Circle) {
                circles.add((Circle) shape);
            } else {
                shapes.add(shape);
            }
        }
    }

//    public static void main(String[] args) {
//        List<Shape> shapes = new ArrayList<>();
//        List<Polygon> polygons = new ArrayList<>();
//        List<Square> squares = new ArrayList<>();
//        List<Circle> circles = new ArrayList<>();
//        sortShapes(new Shape[]{
//                new Shape(), new Shape(),   // 2 instances of Shape
//                new Polygon(),              // 1 instance of Polygon
//                new Square(), new Square(), // 2 instances of Square
//                new Circle()                // 1 instance of Circle
//        }, shapes, polygons, squares, circles);
//        Stream.of(shapes, polygons, squares, circles).forEach(list -> {
//            System.out.printf("List<%s> size = %d%n", list.get(0).getClass().getSimpleName(), list.size());
//        });
//    }

}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }