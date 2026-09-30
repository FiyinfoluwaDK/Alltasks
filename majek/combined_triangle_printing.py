def print_stars(count):
    print('*' * count, end='')

def print_spaces(count):
    print(' ' * count, end='')

rows = 10
width = 11

for count in range(1, rows + 1):
    print_stars(count)
    print_spaces(width - count)

    print_stars(rows - count + 1)
    print_spaces(width - (rows - count + 1))

    print_spaces(count - 1)
    print_stars(rows - count + 1)
    print_spaces(width - (count - 1) - (rows - count + 1))

    print_spaces(rows - count)
    print_stars(count)

    print()
