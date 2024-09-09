import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    private var side1: Double = 0.0
    private var side2: Double = 0.0
    private var side3: Double = 0.0

    fun setDimensions(_side1: Double, _side2: Double, _side3: Double){
        if(_side1 <= 0 || _side2 <= 0 || _side3 <= 0 || //sides must have length
            _side1 + _side2 <= _side3 || _side1 + _side3 <= _side2 || _side2 + _side3 <= _side1){
            //two sides combined must be greater than the third
            println("Invalid Triangle lengths for $name.")
        } else {
            side1 = _side1
            side2 = _side2
            side3 = _side3
        }
    }

    fun getSide1() = side1
    fun getSide2() = side2
    fun getSide3() = side3

    override fun printDimensions(){
        println("Triangle $name's dimensions are Side 1: $side1, Side 2: $side2, Side 3: $side3")
    }

    override fun getArea(): Double {
        val s = 0.5 * (side1 + side2 + side3)
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }
}