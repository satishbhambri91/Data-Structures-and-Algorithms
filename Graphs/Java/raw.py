#!/usr/bin/python


#!/usr/bin/python

# Open a file
fo = open("foo.txt", "r")
#fo.write("Python is a great language !");
print fo.read()
print "Name of the file: ", fo.name
fo.close()
print "Closed or not : ", fo.closed
print "Opening mode : ", fo.mode
print "Softspace flag : ", fo.softspace

