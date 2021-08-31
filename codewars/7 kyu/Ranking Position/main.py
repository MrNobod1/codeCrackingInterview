'''
This is an example of the structure that people will follows up.
[
  {
    name: "John",
    points: 100,
  },
  {
    name: "Bob",
    points: 130,
  },
  {
    name: "Mary",
    points: 120,
  },
  {
    name: "Kate",
    points: 120,
  },
]
'''
def ranking(people):
    if len(people) == 0:
        return people
    sorted_people = sorted(people, key = lambda row : (-row['points'], row['name']))
    position = 1
    sorted_people[0]['position'] = position
    
    for pos in range(1, len(sorted_people)):
        if sorted_people[pos - 1]['points'] == sorted_people[pos]['points']:
            sorted_people[pos]['position'] = position
        else:
            position = pos+1
            sorted_people[pos]['position'] = position

    return sorted_people

def print_arr(arr):
    for a in arr:
        print(a)
    return

input = [
      {
        "name": "John",
        "points": 100,
      },
      {
        "name": "Bob",
        "points": 130,
      },
      {
        "name": "Mary",
        "points": 120,
      },
      {
        "name": "Kate",
        "points": 120,
      },
]

print_arr(ranking(input))