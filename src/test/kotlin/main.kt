fun main(){
    val summ = 2000
    val meloman = true
    fun sell() : Double {
        val sell1 =
            if(summ >= 1001 && summ <= 10000){
                100.0
            }
            else if(summ >= 10001){
                val summ1 = summ - 100.0
                summ1 * 0.05
            }
            else{
                0.0
            }
        return sell1
    }

    val resSumm = summ - sell()
    if (meloman){
        val sellM = resSumm * 0.01
        val resSum1 = resSumm - sellM
         println("Итоговая сумма к оплате: $resSum1")
    }
    else{
        println("Итоговая сумма к оплате: $resSumm")
    }
}