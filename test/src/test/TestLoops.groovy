package test

class TestLoops {
	static void main(args){
		5.times{
			println "Hello"
		}
		
		['cat', 'dog', 'hamster'].each{
			name -> println name
		}
		
		(6..10).each {
			number -> println number
		}
		
		[fruit: 'Apple', veggie: 'Carrot', car: 'Sedan'].each {
			key, value -> println "${key} = ${value}"
		}
	}
}
