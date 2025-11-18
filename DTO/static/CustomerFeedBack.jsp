<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Feedback</title>
</head>
<body>
<h2>Customer Feedback</h2>
<form action="feedback" method="post">
    Name: <input type="text" name="name"><br><br>
    Email: <input type="email" name="email"><br><br>
    Comments: <textarea name="comments"></textarea><br><br>
    Rating: <input type="number" name="rating" min="1" max="5" required><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
