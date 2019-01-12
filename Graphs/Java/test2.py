
tuple1 = ( 'abcd', 786 , 2.23, 'john', 70.2  )
tinytuple = (123, 'john')

print tuple1           # Prints complete list
print tuple1[0]        # Prints first element of the list
print tuple1[1:3]      # Prints elements starting from 2nd till 3rd 
print tuple1[2:]       # Prints elements starting from 3rd element
print tinytuple * 2   # Prints list two times
print tuple1 + tinytuple # Prints concatenated lists


tuple = ( 'abcd', 786 , 2.23, 'john', 70.2  )
list = [ 'abcd', 786 , 2.23, 'john', 70.2  ]
tuple[2] = 1000    # Invalid syntax with tuple
list[2] = 1000     # Valid syntax with list


