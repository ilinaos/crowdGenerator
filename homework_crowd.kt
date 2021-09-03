fun main() {
    val colours: List<String> = listOf("Красный", "Черный", "Белый", "Серый", "Индиго")
 val cars: List<String> = listOf("Lada", "Opel", "Skoda", "Volvo", "Toyota")
 
 class Auto() {
     val name: String = cars.get((0..4).random())
     val colour: String = colours.get((0..4).random())
     val tankCapacity: Int = (15..40).random()
     val maxSpeed: Int = (120..334).random()
     
     fun info(){
        println("Название - $name")
        println("Цвет - $colour")
        println("Объем бака - $tankCapacity")
        println("Максимальная скорость - $maxSpeed")
    }
 
 }
 
 
 
 class Generator(){
     val minCount: Int = (1..5).random()
     val maxCount: Int = (minCount+1..minCount*2).random()
     var crowd: MutableList<Auto> = mutableListOf()
     
     fun makeCars(){
         val count: Int = (minCount..maxCount).random()
         for (n in (1..count)){
             crowd.add(Auto())
         }
 //         println("min - $minCount")
 //         println("max - $maxCount")
     }
         
      fun info2 (){
         for (n in crowd){
             n.info()
             println("---------------")
         }
     }
   
     
     
 }
 
 // var example = Auto ()
 // example.info()
 
 var example = Generator()
 example.makeCars()
 example.info2()
 
 
 }
