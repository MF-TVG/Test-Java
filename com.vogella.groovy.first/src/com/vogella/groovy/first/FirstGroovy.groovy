package com.vogella.groovy.first

class FirstGroovy {
	static void main(def args){
		def myList = [1, 2, "Lars", "4"]
		myList.each {
			println it
		}
	}
}
