package test

class TestMaps {
	static void main(args){
		def emptyMap = [:]
		def mapWithValues = [fruit: 'Apple', veggie: 'Carrot']
		
		def alist = [fruit: 'Apple', 'veggie': 'Carrot']
		alist['car'] = 'Sedan'
		alist.put('book', 'Novels')
		alist << [pet: 'Dog']
		println alist['fruit']
		println alist.'veggie'
		println alist.get('car')
		println alist.get('book')
		println alist.get('pet')
	}
}
