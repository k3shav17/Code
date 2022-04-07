Requirement

	Build a reusable/scalable search algorithm that is not specific to an entity or entities but 
	something generic that can be reused for any data set. For this assessment, use the dataset
	mentioned at the end of this document.


Data can be pre-populated.

	Application to have a REST API endpoint for search - E.g /search
	
	Search can be performed on a single field or multiple fields.
	
	Search is case insensitive.
	In case of multiple field searches, it has to be an AND condition. E.g actor=’Hugh
	Jackman’ AND director = ‘Christopher Nolan’
	
	Sort option on the result set to be implemented.
	
	Brownie points -
		○ Implementing OR condition combined with AND.
		○ Pagination of results
		
Technology Requirement:

Java 8+
Spring Boot
ORM Framework like Hibernate/JPA
DB - InMemory/MySQL/Postgres
Dataset - https://www.kaggle.com/shivamb/netflix-shows
Expected turnaround time: 3 days