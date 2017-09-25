# COMP 271 F17 002 Lab 2

# Daria Derda


# Questions

1. What is the complexity of each of the four search methods in terms of array or list size n?-
- A: The complexity can be found by looking at the loops, since they only go through one loop, the complexity would be O(n)
2. What happens in the case of binary search if the array is not sorted?
- A: It technically won't work because binary searches use the middle value of the array. It must be guarranteed that it is the most middle value since
the array later cuts in half (bigger than middle and smaller than middle). If it isn't sorted, the value that we might be looking for could potentially
be in the wrong half and later on deleted, so we would never be able to find it, therefore rendering the binary search pretty useless.
3. What is the purpose of constructor argument validity checking?
- A: This really justs make sure that there won't be any errors regarding input or logic errors. It makes sure that the value going through the methods is 
one that is actually useful and sensical with the parameter. 
4 . What is the purpose of using the keyword `final` with variables and arguments?
-A: So that values cannot be changed later on, they are permanetly set.
5 . What are alternatives to using `Optional` and how do they compare?