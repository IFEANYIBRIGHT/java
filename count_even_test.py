from unittest import TestCase
import count_even

class TestEvenCounter(TestCase):

    def test_if_it_counts_even(self):
        numbers = [1,2,3,4,5,67,8,9]
            
        even_counter = count_even

        actual = even_counter.count_evens(numbers)

        expected = 3

        self.assertEqual(actual,expected)



    def test_if_search(self):

        numbers = [1,23,4,5,76,7]

        target = 23

        linear_search = count_even

        actual = linear_search.get_target(numbers,target)

 

        self.assertTrue(actual)


    def test_if_array_equals(self):

        first_array = [1,23,45,67,88]

        second_array = [1,23,45,67,88]

        arrays_equals = count_even

        actual = arrays_equals.get_if_array_is_equal(first_array,second_array)

        self.assertTrue(actual)
