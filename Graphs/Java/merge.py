def mergeStrings(a, b):
	min = ""
	max = ""
	res = ""

	if(len(a) > len(b)):
		min = b
		max = a
	else:
		min = a
		max = b

	for i in range(0, len(min)):
		res += a[i] + b[i]
	res += max[len(min) :]
	print res


mergeStrings("abc", "def")