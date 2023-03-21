# cmsc389T-spring23
                         PROJECT: PACMAN
TEAM MEMBERS:
Ashwath Rajesh
Gayathri Krishnan
Venkat Kuppoor

![Image 3-3-23 at 9 47 PM](https://user-images.githubusercontent.com/123569290/222872230-5bed7200-d236-4dc7-934d-5af84014b279.jpg)






Once this part has been completed, you should be able to see a JFrame appear that allows you to play Automonous PacMan by compiling and running your files. If you don't have Gradle installed, follow the instructions [here](https://gradle.org/install/). We will be using Gradle to build and run the project:

```bash
gradle build
gradle run
```

# PACMAN CLASS
# Pacman - get_valid_moves()
## Written by Venkat Kuppoor
This method returns a list of valid locations where a player can move in a game. It checks if the adjacent locations to the player's current location contain a wall, and if they don't, it adds the location to the list of valid locations.
The corresponding JUnit test case verifies the correctness of the get_valid_moves method of the PacMan class. It creates a new instance of the NoFrame class, adds a PacMan object to the frame at Location (1,1), creates an ArrayList of Location objects representing the valid moves PacMan can make from its initial position, and compares it to the ArrayList returned by the get_valid_moves method of the PacMan object.
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
This method returns an ArrayList of Location objects representing the valid moves a Ghost object can make on the current game map. The method first retrieves the current x and y coordinates of the Ghost object, creates a new ArrayList of Location objects named validLocations, and checks each adjacent location for the presence of a wall or another ghost. If a wall or another ghost is present in any adjacent location, the corresponding Location object is added to the validLocations ArrayList. Finally, the method returns the validLocations ArrayList.
The corresponding JUnit test case tests the get_valid_moves method of a Ghost object. The test creates a new instance of the NoFrame class, adds a new Ghost object to the game with a starting location of (1,1), and checks whether the get_valid_moves method of the Ghost object returns an ArrayList of Location objects containing the expected valid move locations. The test also checks whether the size and contents of the returned ArrayList match the expected values.

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
This method is used to move a component on the game map to a new location. It takes in three parameters: the name of the component to be moved, the new location for the component, and the type of the component being moved. It returns a boolean value indicating whether the move was successful or not.
The corresponding JUnit test creates a new NoFrame object and checks that the move() method returns false when trying to move a non-existent PacMan object to a new Location. It then adds a new PacMan object to the NoFrame object at a Location of (1, 1) and checks that the move() method returns true when trying to move the PacMan object to a new Location of (1, 2) with a Type of PACMAN. It also checks that the old Location no longer contains the PACMAN type and the new Location now contains the PACMAN type. The test then checks the same for a Ghost object, first checking that the move() method returns false when trying to move a non-existent Ghost object to a new Location. It then adds a new Ghost object to the NoFrame object at a Location of (2, 3) and checks that the move() method returns true when trying to move the Ghost object to a new Location of (1, 2) with a Type of GHOST. It also checks that the old Location no longer contains the GHOST type and the new Location now contains the GHOST type.

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
=======
Assert true if there is a ghost, assert false if there is no ghost


