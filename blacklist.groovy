def blacklist = new XmlSlurper().parseText(new File('blacklist.xml').text)
blacklist.list.num.eachWithIndex { it, idx ->
	println "${it.text()},Callcap: ${Integer.toString(idx+1).padLeft(5, '0')}"
}
