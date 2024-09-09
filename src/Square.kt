class Square(_name: String) : Shape(_name) {

    private var length: Double = 0.0
    private var height: Double = 0.0

    fun setDimensions(_length: Double, _height: Double){
        if(_length <= 0 || _height <= 0){
            println("Invalid side length and height for $name.")
        } else {
            length = _length
            height = _height
        }

    }

    override fun printDimensions(){
        println("Square $name's sides Length: $length, Height: $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}