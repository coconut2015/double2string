# Double2String

This package only contains a single class called
``org.yuanheng.Double2String`` that contains two utility functions:
``getDoubleString(double value)`` and ``getFloatString(float value)``.  These
two functions essentially return the equivalent of ``"%g"`` output of
C [printf](https://www.cplusplus.com/reference/cstdio/printf/) for 64-bit and 32-bit floating point values.

# Algorithm

The algorithm and code used here are from
Jaffer, Aubrey. "Easy Accurate Reading and Writing of Floating-Point
Numbers." arXiv preprint arXiv:1310.8121 (2013). [PDF](https://arxiv.org/pdf/1310.8121.pdf).

# License

Please see LICENSE.txt.  It contains the license from Aubrey Jaffer
for his code, and the Apache License for the extensions.
