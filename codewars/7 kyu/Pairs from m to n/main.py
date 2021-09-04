def generate_pairs(m, n):
    return [(x, y) for x in range(m, n+1) for y in range(x, n+1)]

def print_arr(arr):
    for a in arr:
        print(a)

print(generate_pairs(2, 4))