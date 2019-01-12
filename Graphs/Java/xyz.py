class Employee: 
	empCount = 0

	def __init__(self, name, salary):
		self.name = name
		self.salary = salary
		Employee.empCount += 1

	def displayCount(self):
		print "Total Employee Count : ", Employee.empCount

	def displayEmployee(self):
		print "Name : ", self.name, "Salary :",self.salary

try:
	emp1 = Employee("ABC", 20000)
	#emp1.displayCount()
	emp1.displayEmployee()
	emp2 = Employee("Satish", 50000)
	emp2.displayCount()
	emp2.displayEmployee()

	emp1.age = 24
	emp2.age = 25

	print emp2.age

	del emp2.age
	print emp2.age
except:
	
finally:
	print "End of program"