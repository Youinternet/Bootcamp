#Write a program that reads an integer number and prints its previous and next numbers. See the examples below for the exact format your answers should take. There shouldn't be a space before the period.
#Remember that you can convert the numbers to strings using the function . str


n = int(input())
print(n-1, n+1)
# el resultado debe mostrar algo asi The next number for the number 179 is 180.
#The previous number for the number 179 is 178.
#The next number for the number 0 is 1.

print(f'The next number for the number {n} is {n+1}.')
print(f'The previous number for the number {n} is {n-1}.')