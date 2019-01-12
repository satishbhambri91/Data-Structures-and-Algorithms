def solvePuzzle(num):
	count = 0
	while(num >=0):
		last = num % 10
		if(last == 0 or last == 4 or last == 6 or last == 9):
			count += 1
		elif(last == 8):
			count += 2;
		num /= 10
		if(num == 0):
			break
	print count

solvePuzzle(468)