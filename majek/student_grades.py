a_count = 0
b_count = 0
c_count = 0
d_count = 0

for i in range(5):
    name = input("Enter student name: ")
    grade = input("Enter grade (A/B/C/D): ").upper()

    match grade:
        case "A":
            a_count += 1
        case "B":
            b_count += 1
        case "C":
            c_count += 1
        case "D":
            d_count += 1
        case _:
            print("Invalid grade entered")

print(f"\nNumber of A's: {a_count}")
print(f"Number of B's: {b_count}")
print(f"Number of C's: {c_count}")
print(f"Number of D's: {d_count}")
