import math

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def gcd_of_four(a, b, c, d):
    return gcd(gcd(a, b), gcd(c, d))


a, b, c, d = 24, 36, 48, 60
result = gcd_of_four(a, b, c, d)
print(f"GCD of {a}, {b}, {c}, and {d} is: {result}")