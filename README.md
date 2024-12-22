Library Management System
Overview
The Library Management System (LMS) is a Java-based application designed to manage library operations efficiently. This system allows users to manage books, track their availability, and facilitate borrowing and returning processes, ensuring a smooth library experience.
Features:
Book Management: Add, update, and delete books in the library.
User Management: Register new users and manage user accounts (conceptual, as the current implementation does not have user management).
Borrowing System: Allow users to borrow and return books, with tracking of ratings.
Search Functionality: Search for books by title, author, or ISBN.
Popularity Tracking: Evaluate the popularity of books based on user ratings.
Technologies Used:
Java: Core programming language for application development.
Collections Framework: Used to store and manage books in memory with a TreeSet to maintain a sorted collection based on ratings.
Usage:
Launch the application.
Use the following options:
1: Add a new book (input title, author, ISBN, and rating).
2: Update the rating of a book by providing its ISBN.
3: Display all books in the library.
4: Display the top-rated book.
5: Exit the application.
Code Structure:
Book.java: Represents a book with attributes such as title, author, ISBN, and rating.
BookDAO.java: Data access object for managing the collection of books.
LibraryService.java: Service class that contains business logic for book management.
LibraryApp.java: Main application class that provides a user interface for interacting with the system.
PopularityComparator.java: Comparator class used to sort books based on their ratings.
Contributing:
Contributions are welcome! If you have suggestions or improvements, please create a pull request or open an issue.
