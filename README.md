# cmsc389T-spring23
                         PROJECT: PACMAN
TEAM MEMBERS:
Ashwath Rajesh
Gayathri Krishnan
Venkat Kuppoor

# INSERT IMAGE OF PLAYING PACMAN




# A section on how to run the code from the command line



# Code block for command to compile and run the game



# A list of the functions you wrote with: a description of the implementation for each function a description of the test you wrote




# PACMAN CLASS
# Pacman - get valid moves


# Pacman - move()
## Written by Ashwath Rajesh.
This move function will store a list of valid locations it can move to by calling its getValidLocs() function.
If this list of valid locations Pacman can move to is greater than 0 then Pacman will be moved to the first location in the list and true will be returned.
If Pacman cannot be moved then false will be returned.
The test will do the following:
Create an empty map
Put Pacman at 3,4
If Pacman can move then pass test

# Pacman - is ghost in range
## Written by Gayathri Krishnan
This function checks if there is a ghost within a radius if 1 from Pacman. It uses the getLoc method from the map class to determine that.
This returns either true or false.
Example: If Pacman is at position (1,2) and a ghost is at (2,2), then the ghost can attack pacman.
If Pacman is at (1,2) and a ghost is at (3,4), the ghost cannot attack pacman.

# Pacman - consume
Function is given.


# GHOST CLASS


# Ghost - get_valid_moves



# Ghost - move()
## Written by Ashwath Rajesh.
This move function will store a list of valid locations it can move to by calling its getValidLocs() function.
If this list of valid locations Pacman can move to is greater than 0 then Pacman will be moved to the first location in the list and true will be returned.
If the Ghost cannot be moved then false will be returned.
The test will do the following:
Create an empty map
Put Ghost at 3,4
If Ghost can move then pass test

# Ghost - is_pacman_in_range
## Written by Gayathri Krishnan
This function checks if there is a pacman within a radius if 1 from ghost. It uses the getLoc method from the map class to determine that.
This returns either true or false.
Example: If ghost is at position (1,2) and a pacman is at (2,2), then the ghost can attack pacman.
If ghost is at (1,2) and a pacman is at (3,4), the ghost cannot attack pacman.

# Ghost - attack
Given

# MAP CLASS

# Map - move


# Map- getLoc()
## Written by Ashwath Rajesh
First this function stores a set of objects at the location specified by calling this.field.get(loc).
The function then returns this set.
The test will do the following:
Create an empty map
Put a ghost at 5,5.
Iterate through contents of getLoc to check if there is a Ghost.
Assert true if there is a ghost, assert false if there is no ghost.

# Map - attack
If the ghost was able to attack pacman return true, otherwise return false.
It takes in a name(ghost) and checks if that name(ghost) exists in the location hashmap.
Example: If Clyde, a ghost is at (1,1) and pacman is at (1,2)
When you call map.attack("clyde"), it returns true as they both are in a radius of 1 within each other.


# Map - eatCookie
Given
