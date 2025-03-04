# Smart Campus Management System

## Overview
This is a multi-module Java EE application designed to manage various aspects of a campus environment. The system includes:
- **Presentation Layer:** JSP/HTML pages, Servlets (with GET/POST forms and session management)
- **Business Layer:** EJBs with business logic and bean validation (including a one-to-one mapping between Student and Profile)
- **Data Access Layer:** JPA entities with Hibernate as the ORM provider and external JNDI data source configuration
- **REST Module:** JAX-RS endpoints to expose functionalities
- **Admin Panel:** Secure admin login and CRUD operations

## Modules
- **smart-campus-ejb:** Contains EJBs and JPA entity classes.
- **smart-campus-web:** Contains the presentation layer (Servlets, JSPs, HTML, CSS).
- **smart-campus-rest:** Contains RESTful web services.
- **smart-campus-ear:** Packages the entire application for deployment.

## Build Instructions
1. Ensure you have JDK 8 (or later) and Maven installed.
2. From the project root, run:

