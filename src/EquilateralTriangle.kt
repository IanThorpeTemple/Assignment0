import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {
    fun setDimensions(_sides: Double){
        if(_sides <= 0){
            println("Invalid lengths for $name.")
        } else {
            super.setDimensions(_sides, _sides, _sides)
        }

    }
    override fun printDimensions(){
        println("Triangle $name's dimensions are Side 1: ${getSide1()}, Side 2: ${getSide2()}, Side 3: ${getSide3()}")
    }

    override fun getArea(): Double {
        return super.getArea()
    }
}