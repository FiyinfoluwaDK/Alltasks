def print_stars(count):
    print('*' * count, end='')

def print_spaces(count):
    print(' ' * count, end='')

rows = -1
while rows < 1 or rows > 19 or rows % 2 == 0:
    rows = int(input("Enter an odd number between 1 and 19: "))

mid = rows // 2 + 1

for i in range(1, mid + 1):
    print_spaces(mid - i)
    print_stars(2 * i - 1)
    print()

for i in range(mid - 1, 0, -1):
    print_spaces(mid - i)
    print_stars(2 * i - 1)
    print()
