# lambda arguments : expression

def add(x, y):
    return x + y

addLambda = lambda x, y : x + y

# This will print the type of the addLambda, which is function.
print(type(addLambda))

# map(function_object, iterable1, iterable2,...)
# When we are using iterables, we are refering to lists, dicitionaries, etc.

# Output: [2, 4, 6, 8]
example = map(lambda x: x * 2, [1, 2, 3, 4])
