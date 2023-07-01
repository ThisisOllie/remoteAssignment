open class Human(var name: String){

//    private var name: String
//    init{
//        this.name = name.uppercase()
//    }
    open fun attack() {
        println("${this.name} use Fist Attack!")
    }
}

class Mega(name: String): Human( name ){

    override fun attack(){
        println("$name use Fireball!")
    }
}


fun main(){

    var human = Human("Mario")
    var mana: Int = 100

    when (mana){
        in 0..50 -> println("Not enough mana to attack!!")
        else -> human.attack()
    }

    var mega = Mega("Yoshi")
    mega.attack()

}