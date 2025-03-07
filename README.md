Library Management System 

Overview

This report shows the working of the Liberary Management System(LMS) using java. The main agenda of system is to manage books, members and other related library operations. The main feature includes are: book borrowing, book returning managing member data, book searching and softcopy request management.The code also showcases the administrative functionalities for a librarian such as searching for books and managing records.This code is implemented with Object oriented programming language concepts.

Purpose

The purpose of the Library Management System (LMS) is to work on library operations, like:

1.Managing the collection of books.
2.Keeping track of book availability.
3.Handling book borrowing and returning operations.
4.Storing and updating member details.
5.Supporting administrative actions such as searching for books and managing records.
The code also simulates managing library books and users, including creating softcopy requests for books and updating member data.

Explanation of the Problem

The primary problem addressed by this system is managing the various aspects of a library's operations, such as:

Book Management: Tracking books, borrowing, and returning them.
Member Management: Storing members information and allowing actions like borrowing books.
File-based Data Storage: The system stores books and user information in text files (e.g., databaseBook.library, databaseMembers.library), taking care that data persists even after the application terminates.
Administrative Actions: The librarian can search for books, manage records, and update the member database.
Key challenges include managing that the data is consistently synchronized in all different components of the system and handling file I/O operations efficiently.



Methodology

This code is designed using object-oriented principles in the following classes and components:

1. Class Structure:
All Documents (abstract): This is a parent class with methods for processing documents. It contains abstract methods photocopier() and emailBook(), which are overridden in subclasses.
Book (class): This class represents a book in the library, the main purpose of creating this class is to actually list all the properties at one place . It includes properties such as title, author, bookID, publication year, and availability status. Methods for borrowing and returning books are implemented in this class. This class also interacts with the DatabaseManager to fetch book data.
DatabaseManager (class): Responsible for reading and writing book and user data from and to files (databaseBook.library and databaseMembers.library). It manages the list of books and members and includes methods for updating lists.It also stores all the books at one place.
User (interface & abstract class): It represents a library member, be it be a student or staff. It includes: user ID, name, gender, and the number of books in possession.
Librarian (class): A subclass of User, implements the Member interface and has methods for searching books and performing administrative tasks.
Gender (enum): Represents the gender of library users, with values like MALE, FEMALE, NON_BINARY, and UNDISCLOSED.
2. File I/O Operations:
The DatabaseManagement class handles loading books and user data from text files and saving updates. Each record is shown in a text format with pipe (|) delimiters.
Books are stored in databaseBook.library, and members are stored in databaseMembers.library.
3. Book Borrowing and Returning:
Books can be borrowed if they are available. When a book is borrowed, its availability is set to false. When returned, the availability is reset to true.
The system checks the availability status before allowing borrowing and provides feedback to the user about the availibility of book.
4. Administrative Functions:
The Librarian class allows a librarian to search for the books.
The DatabaseManager includes methods for updating the member database and writing softcopy requests for books.
