package com.vogella.groovy.strings

	def name = "John"
	def s1 = "Hello $name"
	def s2 = 'Hello $name'
	println s1
	println s2
	println s1.class
	println s2.class
	
	def date = new Date()
	println "We meet at $date"
	println "We meet at ${date.format('MM/dd/yy')}"