package test

class TestString {
	static void main(args){	
		def firstName = 'John'
		def lastName = 'Doe'
		def a = 3
		def b = 7
		
		println "${lastName}, ${firstName}"
		println "a + b = ${a + b}"
		println '${lastName}, ${firstName}'
		println 'a + b = ${a + b}'
	}
}
