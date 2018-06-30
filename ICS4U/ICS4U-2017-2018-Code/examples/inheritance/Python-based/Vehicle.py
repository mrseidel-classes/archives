class Vehicle:
	''' Documentation needed here
	'''

	def __init__(self, numberOfTires, colorOfVehicle):
		''' Documentation needed here
		'''
		self.numberOfTires = numberOfTires
		self.colorOfVehicle = colorOfVehicle
		
	def start(self):
		'''  This function starts the vehicle
		
		'''
		print("I started!")
		
	def drive(self):
		'''  This function drives the vehicle
		
		'''
		print("I'm driving!")
		
	def setColor(color):
		'''  This function updates the color of the vehicle based
			 on the pass in information
			 
			 Parameters:
				Color -> a color to update the vehicle's color with
				
		'''
		this.colorOfVehicle = color
	
	def __repr__(self):
		return "I'm a Vehicle!"
		