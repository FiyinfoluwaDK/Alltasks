rows = 10

# Pattern (a): left-aligned increasing
for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print('*', end='')
    print()
print()

# Pattern (b): left-aligned decreasing
for i in range(1, rows + 1):
    for j in range(1, rows - i + 2):
        print('*', end='')
    print()
print()

# Pattern (c): right-aligned decreasing
for i in range(1, rows + 1):
    for s in range(1, i):
        print(' ', end='')
    for j in range(1, rows - i + 2):
        print('*', end='')
    print()
print()

# Pattern (d): right-aligned increasing
for i in range(1, rows + 1):
    for s in range(1, rows - i + 1):
        print(' ', end='')
    for j in range(1, i + 1):
        print('*', end='')
    print()
