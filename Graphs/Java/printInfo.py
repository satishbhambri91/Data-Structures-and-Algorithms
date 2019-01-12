def printInfo(arg1, *vartuple):
	print "The arguments passed are as follows : "
	print arg1, " : This is the first argument, the constant one"
	for i in vartuple:
		print i
	return;

printInfo(12)
printInfo(12, [12,13,14,15])

# Function definition is here
sum = lambda arg1, arg2: arg1 + arg2;

 

# Now you can call sum as a function
print "Value of total : ", sum( 10, 20 )
print "Value of total : ", sum( 20, 20 )