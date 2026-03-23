def count_evens(numbers):
    count = 0
    for index in range(len(numbers)):

        if(numbers[index] % 2 == 0):

            count += 1
    return count




def get_target(numbers,target):

    for index in range(len(numbers)):

        if numbers[index] == target:
            return numbers 
    return -1



def get_if_array_is_equal(first_array,second_array):

    for index in range(len(first_array)):
        for count in range(len(second_array)):

            if first_array[index] == second_array[count]:
        
                return True
    return False
        
