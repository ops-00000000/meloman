fun main(){
    var summ = 2000.0
    val meloman = true
        var sell =
            if(summ >= 1001 && summ <= 10000){
                100.0
            }
            else if(summ >= 10001 ){
                summ - 100
                summ * 0.05
            }
            else{
                0.0
            }

     summ -= sell

    if (meloman){
       sell = summ * 0.01
        summ -= sell

    }
    println("Итоговая сумма к оплате: $summ")
}