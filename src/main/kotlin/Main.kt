class Player(var str:Int = 0, var dex:Int = 0, var XP:Int = 0, var lvl:Int = 1, var nextLvlUp:Int = 10){
    fun recieveXp (xp:Int){
        XP += xp
        while (XP >= nextLvlUp) {
            XP -= nextLvlUp
            lvlUp ()
        }
        println ("str:$str dex:$dex lvl:$lvl         XP:$XP  nextLvlUp:$nextLvlUp" )
    }
    fun lvlUp () {
        lvl += 1
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        nextLvlUp += 100
        if (lvl == 2) nextLvlUp = 100

    }
}
fun main() {
    var p:Player = Player()

    p.recieveXp(10)
    p.recieveXp(100)
    p.recieveXp(100)
    p.recieveXp(120)


}