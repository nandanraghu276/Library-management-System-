## 🔗 API Documentation

This section provides a detailed overview of all available REST APIs in the Digital Library System.

---

## 👤 User Management APIs

### ➤ Create User
Registers a new user in the system.

```
POST /user/create
```

**Request Body**
```json
{
  "name": "John Doe",
  "email": "john@example.com"
}
```

**Response**
```json
{
  "message": "User created successfully",
  "status": "SUCCESS"
}
```

---

### ➤ Get All Users
Fetches the list of all registered users.

```
GET /user/all
```

**Response**
```json
[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com"
  }
]
```

---

## 📖 Book Management APIs

### ➤ Add Book
Adds a new book to the library.

```
POST /book/add
```

**Request Body**
```json
{
  "title": "Java Programming",
  "author": "James Gosling",
  "available": true
}
```

**Response**
```json
{
  "message": "Book added successfully",
  "status": "SUCCESS"
}
```

---

### ➤ Get All Books
Retrieves all books from the library.

```
GET /book/all
```

---

### ➤ Delete Book
Deletes a book by its ID.

```
DELETE /book/delete/{id}
```

---

## 🔄 Transaction APIs

### ➤ Borrow Book
Allows a user to borrow a book.

```
POST /transaction/borrow
```

**Request Body**
```json
{
  "userId": 1,
  "bookId": 101
}
```

---

### ➤ Return Book
Allows a user to return a borrowed book.

```
POST /transaction/return
```

**Request Body**
```json
{
  "userId": 1,
  "bookId": 101
}
```

---

## ⚠️ Notes

- All APIs follow REST principles  
- Data is exchanged in JSON format  
- Proper HTTP status codes are returned  
- Tested using Postman  

---

## 🧪 Testing

You can test all APIs using Postman:

1. Select HTTP method (GET/POST/DELETE)
2. Enter endpoint URL
3. Add JSON body (if required)
4. Send request and verify response

---
