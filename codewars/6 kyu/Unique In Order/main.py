def unique_in_order(iterable):
    if len(iterable) == 0:
        return []
    result = []
    temp = iterable[0]
    for each in iterable:
        if each != temp:
            result.append(temp)
            temp = each
    result.append(temp)
    return result

print(unique_in_order('AAAABBBCCDAABBB'))