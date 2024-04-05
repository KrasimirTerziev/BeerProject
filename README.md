# BeerProject

## Description
This project is designed to showcase the capabilities of a software application for managing and tracking 
beer-related information. It aims to provide users with a convenient way to keep track of their favorite beers, 
breweries, and tasting notes.

## Functional Requirements
•	Each user must have a name, email, and profile picture.
•	Each beer must have a name, description, origin country, brewery that produces it, style (pre-defined), ABV, and a picture. Beer names must be unique.

## Public Part
The public part must be accessible without authentication i.e., for anonymous users. 
Anonymous users must be able to browse all beers and their details. They must be able to filter by style and country of origin, and sort by name, ABV and rating.
Also, anonymous users must have the ability to register.

## Private part
Accessible only if the user is authenticated.
Registered users must be able to create new beers, add a beer to their wish list and drunk list and rate beers. They must be able to edit and delete their own beers. Registered users should be able to modify their personal information as well.

## Administrative part
Available to administrators only.
Administrators must be able to edit/delete all beers, users, breweries, and styles.

## REST API
To provide other developers with your service, you need to develop a REST API. It should leverage HTTP as a transport protocol and clear text JSON for the request and response payloads.
A great API is nothing without great documentation. The documentation holds the information that is required to successfully consume and integrate with an API. You must use Swagger to document yours.
The REST API provides the following capabilities:
1.	Countries
•	Read operations (must)
•	Create, Update, Delete operations (should)
2.	Breweries
•	Read operations (must)
•	Create, Update, Delete operations (should)
3.	Styles
•	Read operations (must)
•	Create, Update, Delete operations (should)
4.	Beers
•	CRUD operations (must)
•	Filter by name, ABV and/or style (must)
•	Sort by name, ABV or style(must)
•	Rate beer (must)
5.	Parcels
•	CRUD operations (must)
•	Add beer to wish list (must)
•	Get wish list beers (must)
•	Add beer to drunk list (must)
•	Get drunk list beers (must)
