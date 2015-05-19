def blacklist = new XmlSlurper().parseText(new File('blacklist.xml').text)
blacklist.list.num.eachWithIndex { it, idx ->
	String number = it.text()
	if (number.length() == 9) {
		number = "1${number}"
	}
	println "${number},Callcap: ${Integer.toString(idx+1).padLeft(5, '0')}"
}
