import java.util.Scanner

fun main(){
    val square1 = Square("Square1")
    val circle1 = Circle("Circle1")
    val triangle1 = Triangle("Triangle1")
    val equilateralTriangle1 = EquilateralTriangle("EquilateralTriangle1")

    val scanner = Scanner(System.`in`)

    println("Enter the length and height for Square:")
    val square1Length = scanner.nextDouble()
    val square1Height = scanner.nextDouble()
    square1.setDimensions(square1Length, square1Height)

    // Input and set dimensions for Circle
    println("Enter the radius for Circle:")
    val circle1Radius = scanner.nextDouble()
    circle1.setDimensions(circle1Radius)

    // Input and set dimensions for Triangle
    println("Enter the three sides for Triangle:")
    val triangle1Side1 = scanner.nextDouble()
    val triangle1Side2 = scanner.nextDouble()
    val triangle1Side3 = scanner.nextDouble()
    triangle1.setDimensions(triangle1Side1, triangle1Side2, triangle1Side3)

    // Input and set dimensions for Equilateral Triangle
    println("Enter the side length for Equilateral Triangle:")
    val equilateral1Side = scanner.nextDouble()
    equilateralTriangle1.setDimensions(equilateral1Side)



    println("\nShape: ${square1.name}")
    square1.printDimensions()
    println("Area: ${square1.getArea()}")

    println("\nShape: ${circle1.name}")
    circle1.printDimensions()
    println("Area: ${circle1.getArea()}")

    println("\nShape: ${triangle1.name}")
    triangle1.printDimensions()
    println("Area: ${triangle1.getArea()}")

    println("\nShape: ${equilateralTriangle1.name}")
    equilateralTriangle1.printDimensions()
    println("Area: ${equilateralTriangle1.getArea()}")
}