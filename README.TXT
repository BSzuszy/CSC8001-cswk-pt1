------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Earthquake monitor
PURPOSE OF PROJECT: To collect, store and return details about recorded earthquakes
VERSION or DATE: 18/10/16
HOW TO START THIS PROJECT: Create Earthquake class with variables, move onto observatory
AUTHORS: B J Szuszkiewicz
USER INSTRUCTIONS:

18/10/2016  - Created Earthquake class with fields & methods appropriate
            - Created Observatory class with ArrayList using Earthquake class as element type
            - Currently issues with connecting Earthquake class to Observatory "this class cannot currently be parsed".
            - Detailed of stored earthquake instances not currently being transferred over to Observatory.
            

19/10/2016  -Figured out how to store earthquake objects in the Observatory ArryaList<Earthquake>()
            -Changed the name of the ArrayList to "list" to make it more readable.
            -Changed the variables "obsName","country", "beganObs"and "areaCov to be directly set from String parameters when making the Observatory object. (overloadin)
            -In ArrayList, changed "newEarthquake" to "e" for readability.
            -Will try and create methods for "largest magnitude", "average magnitude" and earthquakes above a set magnitude.

22/10/2016  -Figure out how to create methods for ""largest earthquake", "average magnitude" and earthquakes above a set magnitude.
            -Currently constructing "Observatory" object.
            -Have implemented the ArrayList<Observatory> which use the "Observatory" class as element type.
            -Currently attempting to manipulate Observatory "maxMag" method to sear for "largest magnitude earthquake" throughout all Observatory instances.