p = 11
q = 13

n = p * q

phi = (p-1)*(q-1)

e = 7

d = inverse_mod(e, phi)

M = 9
C = power_mod(M, e, n)
M1 = power_mod(C, d, n)
print("Public key (e,n):", (e,n))
print("Private key (d,n):", (d,n))
print("Encrypted message:", C)
print("Decrypted message:", M1)
