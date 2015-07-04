input = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def reversed(input_list):
    output = []
    i = len(input_list) - 1
    while i >= 0:
        output.append(input_list[i])
        i -= 1

    return output

result = reversed(input)
print(result)
