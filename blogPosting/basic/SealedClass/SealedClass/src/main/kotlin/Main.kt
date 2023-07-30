fun main(args: Array<String>) {

    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Rectangle(3.0, 6.0),
        Triangle(4.0, 7.0)
    )

    shapes.forEach { shape ->
        val area = when(shape){
            is Circle -> calculateCircleArea(shape.radius)
            is Square -> calculateSquareArea(shape.side)
            is Rectangle -> calculateRectangleArea(shape.width, shape.height)
            is Triangle -> calculateTriangleArea(shape.base, shape.height)
        }
        println("Area of ${shape.javaClass.simpleName}: $area")
    }
}


fun calculateCircleArea(radius: Double): Double {
    return 3.14 * radius * radius
}

fun calculateSquareArea(side: Double): Double {
    return side * side
}

fun calculateRectangleArea(width: Double, height: Double): Double {
    return width * height
}

fun calculateTriangleArea(base: Double, height: Double): Double {
    return 0.5 * base * height
}