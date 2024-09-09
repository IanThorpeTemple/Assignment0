import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.0

    fun setDimensions(_radius: Double){
        if(_radius <= 0){
            println("Invalid radius length for $name.")
        } else {
            radius = _radius
        }
    }

    override fun printDimensions(){
        println("Circle $name's Radius: $radius")
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}