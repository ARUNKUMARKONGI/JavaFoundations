
n1 = 12
n2 = 8
while n1 != n2:
    if n1 > n2:
        n1 = n1 - n2
    else:
        n2 = n2 - n1


print(f"GCD of the numbers is: {n2}")

#worst case O(log(max(a,b)) best case (O(logn(min(a,b)