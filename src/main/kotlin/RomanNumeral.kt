class RomanNumeral {
	
	companion object{
		fun value(inputNr:Int):String{			
			var listOfRomanDigits=listOf(
				Pair(1,"I"),
				Pair(4,"IV"),
				Pair(5,"V"),
				Pair(9,"IX"),
				Pair(10,"X"),
				Pair(40,"XL"),
				Pair(50,"L"),
				Pair(90,"XC"),
				Pair(100,"C"),
				Pair(400,"CD"),
				Pair(500,"D"),
				Pair(900,"CM"),
				Pair(1000,"M")				
			)
			
			if(inputNr!=0){
				var basePair =listOfRomanDigits.findLast{it.first.compareTo(inputNr)<1}				
				if(basePair!=null){
					var quotient=inputNr/basePair.first;
					var modulo=inputNr%basePair.first;
					return basePair.second.repeat(quotient) + value(modulo);
				}
			}else{
				return "";
			}
			
			return "";
		}
	}
}