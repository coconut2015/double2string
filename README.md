# Double2String [![Build Status](https://circleci.com/gh/coconut2015/double2string.svg?style=shield)](https://app.circleci.com/pipelines/github/coconut2015/double2string)[![codecov](https://codecov.io/gh/coconut2015/double2string/branch/master/graph/badge.svg?token=fNdJPszCMB)](https://codecov.io/gh/coconut2015/double2string)[![Maven Central](https://img.shields.io/maven-central/v/org.yuanheng/double2string.svg?label=Maven%20Central)](https://search.maven.org/artifact/org.yuanheng/double2string/1.0.0/jar)[![javadoc](https://javadoc.io/badge2/org.yuanheng/double2string/javadoc.svg)](https://javadoc.io/doc/org.yuanheng/double2string)[![Apache License, Version 2.0](https://img.shields.io/badge/license-Apache--2.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)

This Java library only contains a single class
[Double2String](https://javadoc.io/static/org.yuanheng/double2string/1.0.0/org/yuanheng/double2string/Double2String.html)
that contains two utility functions:
``getDoubleString(double value)`` and ``getFloatString(float value)``.

These two functions essentially return the equivalent of ``"%g"`` output of
C [printf](https://www.cplusplus.com/reference/cstdio/printf/) for 64-bit
and 32-bit floating point values.  The resulting strings are compact
representations of the floating values.

The necessity of this library is because Java's
[printf](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax)
and
[NumberFormat](https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html)
do not have equivalent functionalities.  For instance, the output of
``System.out.printf ("%g", 1.1)`` is ``1.10000``.  The compact representation
should be ``1.1``.

# Maven

```xml
	<dependency>
		<groupId>org.yuanheng</groupId>
		<artifactId>double2string</artifactId>
		<version>1.0.0</version>
	</dependency>
```

# Algorithm

The algorithm and code used here are from
Jaffer, Aubrey. "Easy Accurate Reading and Writing of Floating-Point
Numbers." arXiv preprint arXiv:1310.8121 (2013). [PDF](https://arxiv.org/pdf/1310.8121.pdf).

# License

Please see LICENSE.txt.  It contains the license from Aubrey Jaffer
for his code, and the Apache License for the extensions.
