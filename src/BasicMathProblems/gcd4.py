a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))


def gcd(x, y):
    while y:
        x, y = y, x % y
    return x

result = gcd(a, b)

print("The GCD of", a, "and", b, "is", result)

#(O(log(min(a,b)))