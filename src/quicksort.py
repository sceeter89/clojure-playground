def qsort(list):
    if not list:
        return []
    else:
        pivot = list[0]
        less = [x for x in list     if x <  pivot]
        more = [x for x in list[1:] if x >= pivot]
        return qsort(less) + [pivot] + qsort(more)

input_list = [3, 5, 4, 5, 2, 1, 2]
expected_list = [1, 2, 2, 3, 4, 5, 5]

print(expected_list == qsort(input_list))
