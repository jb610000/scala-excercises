

//operators
/*def numbers ( no1: Int, no2: Int): Int ={
var no3 = no1 + no2
return no3
}
println(numbers(1,2))
*/

//conditionals
/*def numbers ( no1: Int, no2: Int, no3: Boolean): Int ={
if (no3 == true){
	var answer = no1 + no2
	return answer
}
else { 
	var answer = no1 * no2
	return answer
}
}


println(numbers(1,2,no3 = false))
*/

//conditionals 2
/*def numbers ( no1: Int, no2: Int, no3: Boolean): Int ={
	var a = 0
	var answer = 0
if (no1 == 0) {
	 a += 1
	 answer = no2
	return answer
}
 if (no2 == 0){
 	 a += 1
 	 answer = no1
 	return answer
}
if (no3 == true && a == 0){
	 answer = no1 + no2
}
else { 
	 answer = no1 * no2
}
return answer
}


println(numbers(1,0,no3 = true))
*/

// iteration
/*def iteration(num: Int, word: String){
	var i = 0
	while (i < num){
		i += 1
		println(word)
	}
}
iteration(3, "hello")
*/

//iteration 2

/*def iteration2( num:Int, word: String){
	var i = 0
	while (i < num){
		i += 1
		println(word+word+word+word)
	}
}
iteration2(3, "t")
*/

//iteration3
/*def iteration3(num:Int, fizz: String, buzz:String){
	var i = 1
	while (i <= num){
		if (i%3 == 0 && i%5 != 0){
			println(fizz)
		}
		else if(i%5 == 0 && i%3 != 0)
		{
		println(buzz)
		}
		else if (i%5 == 0 && i%3 == 0){
		println(fizz+buzz)
		}
		else{
		println(i)
	}
	i += 1
	}
}
iteration3(15, "fizz", "buzz")
*/
//blackjack
/*def blackjack(num1: Int, num2: Int): Int ={
	var limit = 21
	var higher = 0
	if(num1 > limit && num2 > limit){
		return higher
	}
	else if (num1 > num2 && num1 <= limit){
		higher = num1
		return higher
	}
	else if(num2 > num1 && num2 <= limit){
		higher = num2
		return higher
	}
} 
println(blackjack(10,19))
*/

// unique sum
/*var userInput = Array.fill(3) {
     readInt()
    }
     userInput = userInput.distinct
    var total = userInput.sum
    println(total)
*/
//toohot
/*def toohot(temp: Int, isSummer: Boolean): Boolean ={
	if (isSummer == true) {
		if (temp >= 60 && temp <= 90){
	return true
	}
	else{
		return false
	}
	}
	if(isSummer == false){
		if(temp>= 60 && temp <= 100){
			return false
			}
		else{
			return true
	}
}
}
println(toohot(70, isSummer = true))
*/

def readFile(filename: String): Seq[String] = {
    var bufferedSource = io.Source.fromFile(filename)
    var lines = (for (line <- bufferedSource.getLines()) yield line).toList
    bufferedSource.close
    lines
}
}

