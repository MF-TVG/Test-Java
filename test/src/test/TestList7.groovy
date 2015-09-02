package test

class TestList7 {
	static void main(args){
		def alist = [1, 2, 3, 4, 5]
		println alist.collect{it * 10}
	}
}
