numbers = []

for count in range(5):
    number = int(input(f"Enter number {count + 1} (1-30): "))
    numbers.append(number)

print("\nBar chart:")
for number in numbers:
    print('*' * number)
