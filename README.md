# Travel Agency Management System
This software system is designed to assist travel agencies in maintaining their travel packages' itinerary and managing passengers. It provides functionalities to create and manage travel packages, destinations, activities, and passengers, while also allowing passengers to sign up for activities according to their passenger type.

## Specification
**Travel Package**: Each travel package has the following attributes:

    Name: The name of the travel package.
    Passenger capacity: The maximum number of passengers allowed in the package.
    Itinerary: A list of destinations included in the package.
    Passenger list: A list of passengers enrolled in the package.
        
**Destination**: Each destination has the following attributes:

    Name: The name of the destination.
    Activities: A list of activities available at the destination.
    
**Activity**: Each activity has the following attributes:

    Name: The name of the activity.
    Description: A brief description of the activity.
    Cost: The cost of the activity.
    Capacity: The maximum number of passengers that can sign up for the activity.
    Destination: The destination where the activity takes place.

**Passenger**: Each passenger has the following attributes:

    Name: The name of the passenger.
    Passenger number: A unique identifier for the passenger.
    Passenger type: The type of passenger (standard, gold, or premium).
        Standard passenger:
            Balance: The remaining balance the passenger has.
            Activity sign-up: A list of activities the passenger has signed up for.
        Gold passenger:
            Balance: The remaining balance the passenger has (with a 10% discount applied).
            Activity sign-up: A list of activities the passenger has signed up for.
        Premium passenger:
            Activity sign-up: A list of activities the passenger has signed up for.

**Functionality**:

**Print itinerary**: Prints the itinerary of a travel package, including the package name and details of activities available at each destination.

**Print passenger list**: Prints the list of passengers enrolled in a travel package, including the package name, passenger capacity, current enrollment count, and details of each passenger.

**Print individual passenger details**: Prints the details of an individual passenger, including their name, passenger number, balance (if applicable), and a list of activities they have signed up for (including destination and price).

**Print available activities**: Prints the details of all activities that still have spaces available, including the number of available spaces.

### Classes and How I implement
1. The flow start with the login i.e. confirmation to ask for booking or exit
2. A sample data is load with passengers and travel package and all its details
3. Packages are printed in console
4. After that for successful booking, it ask for name
5. If the name is in the data, it will go with that otherwise, it will create a new passenger
6. To booking an activity, a person must has balance, sample data customer has balance, but new passengers don't have any balance
7. At the end after the booking, all the details will be printed

There is also a functionality to add an activity only on one destination
If you add new activity through that function and the dataset contain redundant activites, it will not add that

In Travel package, a list is made which furthur has a list of destinations in it and ad the end each destination is mapped with more a list which has activities at that place.
