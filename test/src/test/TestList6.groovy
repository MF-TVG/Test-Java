package test

class TestList6 {
	static void main(args){
		def alist = [10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
		println alist.findAll{it % 2 == 0}
	}

}
