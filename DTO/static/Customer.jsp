<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Customer Form</title>
</head>
<body>
<h2>Customer Details</h2>
<form action="customer" method="post">
    Name: <input type="text" name="name" required><br><br>
    Mobile: <input type="text" name="mobile" required><br><br>
    Coffee Flavour: <input type="text" name="flavour" required><br><br>
    Quantity: <input type="number" name="quantity" required><br><br>
    Payment Mode: <input type="text" name="payment" required><br><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
