day = int(input("Enter an integer: "))

if day % 7 == 0:
    print("Sunday")
elif day % 7 == 1:
    print("Monday")
elif day % 7 == 2:
    print("Tuesday")
elif day % 7 == 3:
    print("Wednesday")
elif day % 7 == 4:
    print("Thursday")
elif day % 7 == 5:
    print("Friday")
elif day % 7 == 6:
    print("Saturday")
else:
    print("invalid input")

