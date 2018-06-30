from Vehicle import *

class Car(Vehicle):
	''' Documentation needed here
	'''
	
	def __init__(self, colorOfVehicle):
		''' This function creates a car based on the inherited information
		
			Parameters:
				colorOfVehicle -> This passes along the color given to the new car made
				
		'''
		super().__init__(self, 4, colorOfVehicle)
		
		'''
			This class will have all of the functions and instance variables that are
			available to the Vehicle class (the parent class)
			
		'''
		
		
	def __repr__(self):
		return "I'm a Car!"
