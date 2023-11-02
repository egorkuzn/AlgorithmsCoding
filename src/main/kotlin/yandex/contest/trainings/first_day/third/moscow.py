# python solution
from math import atan2
from math import pi


Xa, Ya, Xb, Yb = map(int, input().split())

if Xa == Xb and Ya == Yb:
    print(0)
elif Xa == 0 and Ya == 0:
    print((Xb**2 + Yb**2)  0.5)
elif Xb == 0 and Yb == 0:
    print((Xa**2 + Ya**2)  0.5)
else:
    Ra = (Xa**2 + Ya**2)  0.5
    Rb = (Xb**2 + Yb**2)  0.5

    alpha1 = atan2(Ya, Xa)
    alpha2 = atan2(Yb, Xb)

    alpha = min(abs(alpha1 - alpha2), abs(2 * pi - abs(alpha1 - alpha2)))

    D = alpha * min(Ra, Rb) + abs(Ra - Rb)
    print(min(D, Ra + Rb))