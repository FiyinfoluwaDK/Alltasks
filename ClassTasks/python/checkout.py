checklist = True

total_bill = 0


while checklist == True:
    product_name = input("""
======================================
=============SHOP LIST================
======================================
PRODUCT---------PRICE-----------------
apple           100
milk            1200
bread           500
banana          700
butter          1400
======================================
--------------TO SELECT---------------
----TYPE product name (e.g, apple)----
-----------TO STOP SHOPPING-----------
-------------TYPE done----------------
======================================
    """)



    if product_name == "apple":
        quantity = int(input("What quantity of apples?" ))
        price = 100 * quantity
        total_bill += price
        
    elif product_name == "milk":
        quantity = int(input("What quantity of milk?" ))
        price = 1200 * quantity
        total_bill += price
        
    elif product_name == "bread":
        quantity = int(input("What quantity of bread?" ))
        price = 500 * quantity
        total_bill += price
        
    elif product_name == "banana":
        quantity = int(input("What quantity of bananas?" ))
        price = 700 * quantity
        total_bill += price
        
    elif product_name == "butter":
        quantity = int(input("What quantity of butter?" ))
        price = 1400 * quantity
        total_bill += price
        
    elif product_name == "done":
        checklist = False
        print("The total amount is", total_bill)
        
    else:
        print("Invalid input")
        
    
                

