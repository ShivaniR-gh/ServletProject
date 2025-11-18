<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cafeteria Form</title>
</head>
<body>
<h2>Cafeteria Details</h2>

<form action="cafeteria" method="post">

    Name:
    <input type="text" name="name" required><br><br>

    Location:
    <input type="text" name="location" required><br><br>

    Type:
    <input type="text" name="type" required><br><br>

    Price:
    <input type="number" name="price" min="1" required><br><br>

    Franchise Name:
    <input type="text" name="franchise" required><br><br>

    Owner Name:
    <input type="text" name="owner" required><br><br>

    GST No:
    <input type="text" name="gst" required><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>
