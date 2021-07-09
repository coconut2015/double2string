# Double2String [![Build Status](https://circleci.com/gh/coconut2015/double2string.svg?style=shield)](https://app.circleci.com/pipelines/github/coconut2015/double2string)[![codecov](https://codecov.io/gh/coconut2015/double2string/branch/master/graph/badge.svg?token=fNdJPszCMB)](https://codecov.io/gh/coconut2015/double2string)[![Apache License, Version 2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

This package only contains a single class
``org.yuanheng.double2string.Double2String`` that contains two utility
functions:
``getDoubleString(double value)`` and ``getFloatString(float value)``.

These two functions essentially return the equivalent of ``"%g"`` output of
C [printf](https://www.cplusplus.com/reference/cstdio/printf/) for 64-bit
and 32-bit floating point values.  The resulting strings are compact
representations of the floating values.

# Algorithm

The algorithm and code used here are from
Jaffer, Aubrey. "Easy Accurate Reading and Writing of Floating-Point
Numbers." arXiv preprint arXiv:1310.8121 (2013). [PDF](https://arxiv.org/pdf/1310.8121.pdf).

# License

Please see LICENSE.txt.  It contains the license from Aubrey Jaffer
for his code, and the Apache License for the extensions.
