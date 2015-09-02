package test

class TestWeakTyping {
	static void main(args){
		def a = 'John Doe'
		a = new Object()
		a = 10
		println a
	}
}
