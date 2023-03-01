# cmsc389T-spring23

# Pacman - move()
## Written by Ashwath Rajesh.
This move function will store a list of valid locations it can move to by calling its getValidLocs() function.
If this list of valid locations Pacman can move to is greater than 0 then Pacman will be moved to the first location in the list and true will be returned.
If Pacman cannot be moved then false will be returned.
The test will do the following:
Create an empty map
Put Pacman at 3,4
If Pacman can move then pass test

# Ghost - move()
## Written by Ashwath Rajesh.
This move function will store a list of valid locations it can move to by calling its getValidLocs() function.
If this list of valid locations Pacman can move to is greater than 0 then Pacman will be moved to the first location in the list and true will be returned.
If the Ghost cannot be moved then false will be returned.
The test will do the following:
Create an empty map
Put Ghost at 3,4
If Ghost can move then pass test

# Location - getLoc()
## Written by Ashwath Rajesh
First this function stores a set of objects at the location specified by calling this.field.get(loc).
The function then returns this set.
The test will do the following:
Create an empty map
Put a ghost at 5,5.
Iterate through contents of getLoc to check if there is a Ghost.
Assert true if there is a ghost, assert false if there is no ghost.