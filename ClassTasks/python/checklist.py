user_name = input("Enter your name: ")

total_bill = 0


product_name = input("Enter product name: ")
price = int(input("What is the price: "))
quantity = int(input("Quantity: "))
product_price = quantity * price
total_bill += product_price
redo = input("Add another product (yes/no): ")
        
while redo == "yes":
    product_name = input("Enter product name: ")
    price = int(input("What is the price: "))
    quantity = int(input("Quantity: "))
    product_price = quantity * price
    total_bill += product_price
    redo = input("Add another product (yes/no): ")

print("The total bill is ", total_bill)
