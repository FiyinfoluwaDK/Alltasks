def print_stars(count):
    print('*' * count, end='')

def print_spaces(count):
    print(' ' * count, end='')

rows = 9
mid = rows // 2 + 1

for count in range(1, mid + 1):
    print_spaces(mid - count)
    print_stars(2 * count - 1)
    print()

for i in range(mid - 1, 0, -1):
    print_spaces(mid - count)
    print_stars(2 * count - 1)
    print()
