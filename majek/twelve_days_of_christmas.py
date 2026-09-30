def print_day(day):
    days = {
        1: "first", 2: "second", 3: "third", 4: "fourth",
        5: "fifth", 6: "sixth", 7: "seventh", 8: "eighth",
        9: "ninth", 10: "tenth", 11: "eleventh", 12: "twelfth"
    }
    print(days[day], end='')

def print_verse(day):
    gifts = {
        12: "Twelve drummers drumming",
        11: "Eleven pipers piping",
        10: "Ten lords a-leaping",
        9: "Nine ladies dancing",
        8: "Eight maids a-milking",
        7: "Seven swans a-swimming",
        6: "Six geese a-laying",
        5: "Five golden rings",
        4: "Four calling birds",
        3: "Three French hens",
        2: "Two turtle doves",
    }

    for i in range(day, 0, -1):
        if i == 1:
            if day == 1:
                print("A partridge in a pear tree")
            else:
                print("And a partridge in a pear tree")
        else:
            print(gifts[i])

for day in range(1, 13):
    print("On the ", end='')
    print_day(day)
    print(" day of Christmas my true love sent to me:")
    print_verse(day)
    print()
