def recursive_fib(n):
    if n <= 1:
        return n
    else:
        return recursive_fib(n-1) + recursive_fib(n-2)
    
def non_recursive_fib(n):
    first = 0
    second = 1

    print(first)
    print(second)

    for i in range (n-2):
        third = first + second
        first = second
        second = third
        print (third)

iNo = int(input("Enter the value: "))

print("Recursive Fib: ")

for i in range (iNo):
    print(recursive_fib(i))

print("Non_recursive fib: ")

non_recursive_fib(iNo)