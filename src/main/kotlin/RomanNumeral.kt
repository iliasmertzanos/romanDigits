class RomanNumeral {
	
	companion object{
		fun value(inputNr:Int):String{
			var romanDigits:String=""
			
			var listOfRomanDigits=listOf(
					Pair(1,"I"),
				Pair(5,"V"),
				Pair(10,"X"),
				Pair(50,"L"),
				Pair(100,"C"),
				Pair(500,"D"),
				Pair(1000,"M")				
			)
			
			while(inputNr!=0){
//				var dividor=listOfRomanDigits.findLast{it.first.compareTo(inputNr)==1 && ((it.first/inputNr) =<3 )}
//				var modulo=
			}
			return "";
		}
	}
}