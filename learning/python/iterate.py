example = [1, 2, 3, 4]

# How to iterate over a list
for val in example:
    print(val)

# We can iterate over a range from 0 to length and print the content of each
# position in the array.
for pos in range(len(example)):
    print(example[pos])

# We can iterate over an array using the counter strategy and accessing the content
# of each position in the array
while pos < len(example):
    print(example[pos])
    pos += 1

# We can also use list comprehension to output the content of the array.
[print(pos) for pos in example]

# We can use the method enumerate to output the key and value of the array.
for key, val in enumerate(example):
    print(key, " : ", val)