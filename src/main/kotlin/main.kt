fun main() {
var account= CurrentAccount(23567898,"Equity", 100000.00)
    account.deposit(3000.50)
    account.withdraw(20000.50)
    account.details()
   var saving= SavingAccount(4567868,"Family", 305000.99 )
    saving.deposit(50000.99)
    saving.withdraw(40000.00)
    saving.details()

    Product("cabbage", 5.0, 50,"vegitable")

    var s=statement("Establish")

    println(s)

}
open class CurrentAccount(var accountnumber:Int, var accountname:String,var balance:Double){
    fun deposit(amount:Double){
        var d= amount + balance
        println(d)
    }
    fun withdraw(Amount:Double){
        var c=balance-Amount
        println(c)
    }
    fun details(){
        var name=("Account number is $accountnumber with balance $balance is operated by $accountname")
    println(name)
    }
}
class SavingAccount(  accountnumber:Int, accountanme:String, balance:Double):CurrentAccount(accountnumber,accountanme, balance){
fun check(withdraw:Int) {


}


}
data class Product(var name:String, var weight:Double, var price:Int , var category:String)

fun statement(word:String){
    var s="Establishment"
    println(s)
}
