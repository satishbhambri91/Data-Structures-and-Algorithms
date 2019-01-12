
str = "this is string example....wow!!!";

sub = "i";
print "str.count(sub, 4, 40) : ", str.count(sub, 4, 40)
sub = "wow";
print "str.count(sub) : ", str.count(sub)

print "str.center(40, 'a') : ", str.center(40, 'a')

suffix = "wow!!!";
print str.endswith(suffix)
print str.endswith(suffix,20)

suffix = "is";
print str.endswith(suffix, 2, 4)
print str.endswith(suffix, 2, 6)

str2 = "exam";

print str.find(str2)
print str.find(str2, 10)
print str.find(str2, 40) #Index if found and -1 otherwise.

str3 = "exam";

#Index if found otherwise raises an exception if str is not found.
print str.index(str3)
print str.index(str3, 10)
#print str.index(str3, 40)

str7 = "THIS is string example....wow!!!"; 
print str7.islower()

str8 = "this is string example....wow!!!";
print str8.islower()

#This method returns the max alphabetical character from the string str.

print "Max character: " + max(str)

print str.replace("is", "was", 3)

print str.split("is")

str55 = "Satish"

str55.replace(2,"W")

print str55

