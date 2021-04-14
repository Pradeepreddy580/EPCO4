<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student CRUD OPERATIONS</title>
</head>
<body>
<h1> Student CRUD OPERATIONS</h1>
<h2>Add a Student</h2>
<form action="addStudent">
Student ID: <input type="text" name="sno"/><br/> 
Student Name: <input type="text" name="sname"/><br/> 
Email : <input type="text" name="email"/><br/>
<input type="submit" name="Add Student"/><br/>
</form>
<br/><br/>
<h2>Update a Student</h2>
<form action="updateStudent">
Student ID: <input type="text" name="sno"/><br/> 
Student Name: <input type="text" name="sname"/><br/> 
Email : <input type="text" name="email"/><br/>
<input type="submit" name="Update Student"/><br/>
</form>
<br/><br/>
<h2>Delete a Student</h2>
<form action="deleteStudent">
Student ID: <input type="text" name="sno"/><br/> 

<input type="submit" name="Delete Student"/><br/>
</form>

<br/><br/>
<h2>View  Student</h2>
<form action="viewStudent">
Student ID: <input type="text" name="sno"/><br/> 

<input type="submit" name="View Student"/><br/>
</form>

</body>
</html>