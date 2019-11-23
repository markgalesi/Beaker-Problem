Beaker Problem
Finds all possible states of the following state space problem 

	a. Initial State
		If each of the three beakers is defined in a triplet as (a,b,c), a being the 8ml beaker, b being 5ml, and c being 3ml, then the initial state is (8,0,0)
	b. Goal State
		The goal state is defined as having 4ml of the solution in either beaker a or beaker b. Goal states are described as (1,4,3) or (4,1,3) or (4,4,0)
	c. Operators
		There are 6 total operators pouring from A to B, from A to C, from B to A, from B to C, from C to A, and from C to B. Each pour is performed by pouring contents from beaker X into beaker Y until either beaker X is empty, or beaker Y is full, whichever comes first.