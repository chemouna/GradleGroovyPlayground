

String[] strArray = new String[2]
strArray[0] = 'str1'
strArray[1] = 'str2'

strArray.eachWithIndex { value, idx -> println strArray[idx] }

def strList = strArray.toList()
println strList.class.name
