fun main() {
    println(listIndexed(listOf("john","Kendy","Mary","Marie","Irene","Sarah","Veronica","Michelle","Juliet","Grace")))
    println(peoples(listOf(5.8,8.9,5.9,4.7)))
    var personList= listOf(Person("Jon",33,2,55),
        Person("Maina",25,1,60),
    Person("Jane",42,1,43))
    println(personList)
    var sortedPerson=personList.sortedByDescending { person->person.age }
    println(sortedPerson)
var cars= listOf(Cars("Mazida","KVW",20),Cars("Toyota","KBC",10),Cars("Tshuzuki","KPL",15))
println(carsList(cars))
}
fun listIndexed(names:List<String>):List<String>{
    var elements= mutableListOf<String>()
   for (name in names)
  if( names.indexOf(name)%2==0){
      elements.add(name)
  }
    return elements
}
data class Heights(var total:Double,var average:Double)


    fun peoples(heights: List<Double>): Heights {
        var totalHeights = heights.sum()
        var averageHeight = heights.average()
        var join = Heights(totalHeights, averageHeight)
        return join

    }

data class Person (var name:String,var age:Int,var height:Int,var weigh:Int)


data class People(var name:String,var age: Int,var height: Int,var weight:Int)
fun addLists() {


    var listOfPeople= mutableListOf(People("Sarah",23,2,67),
        People("Kendy",20,1,70),People("Constance",19,1,59))
    listOfPeople.addAll(mutableListOf(People("sarah", 21, 2, 67),
        People("Ann", 19, 1, 80,)))
    println(listOfPeople)
}

data class Cars(var carName:String,var registratioon:String,var mileage:Int)

fun  carsList(macars:List<Cars>):Int{
    var totalMileage= 0
    for (car in macars){
        totalMileage+=car.mileage
    }
    var average=totalMileage/macars.count()
    return average

}