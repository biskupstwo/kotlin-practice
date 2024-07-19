package exercises.CarpetCostCalculator

class Floor (
    var width: Double,
    var length: Double
){
   init {
       when{
           width < 0.0 -> width = 0.0
           length < 0.0 -> length = 0.0
       }
   }

   fun getArea(): Double = width*length
}