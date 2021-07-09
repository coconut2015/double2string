/*
 * Copyright (c) 2021 Heng Yuan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yuanheng.double2string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author	Heng Yuan
 */
public class Double2StringTest
{
	@Test
	public void testDouble () throws Exception
	{
		Assert.assertEquals ("0", Double2String.getDoubleString (0));
		Assert.assertEquals ("0.1", Double2String.getDoubleString (0.1));
		Assert.assertEquals ("0.2", Double2String.getDoubleString (0.2));
		Assert.assertEquals ("0.23", Double2String.getDoubleString (0.23));
		Assert.assertEquals ("2.3", Double2String.getDoubleString (2.3));

		Assert.assertEquals (Double.toString (Double.NaN), Double2String.getDoubleString (Double.NaN));
		Assert.assertEquals (Double.toString (Double.POSITIVE_INFINITY), Double2String.getDoubleString (Double.POSITIVE_INFINITY));
		Assert.assertEquals (Double.toString (Double.NEGATIVE_INFINITY), Double2String.getDoubleString (Double.NEGATIVE_INFINITY));
		Assert.assertEquals ("0", Double2String.getDoubleString (0.0));
		Assert.assertEquals ("1", Double2String.getDoubleString (1.0));
		Assert.assertEquals ("12", Double2String.getDoubleString (12.0));
		Assert.assertEquals ("1234", Double2String.getDoubleString (1234.0));
		Assert.assertEquals ("1234.1234", Double2String.getDoubleString (1234.1234));
		Assert.assertEquals ("0.1234", Double2String.getDoubleString (0.1234));
		Assert.assertEquals ("0.01234", Double2String.getDoubleString (0.01234));
		Assert.assertEquals ("0.001234", Double2String.getDoubleString (0.001234));
		Assert.assertEquals ("0.0001234", Double2String.getDoubleString (0.0001234));
		Assert.assertEquals ("1.234e-5", Double2String.getDoubleString (0.00001234));
		Assert.assertEquals ("1.1234", Double2String.getDoubleString (1.1234));
		Assert.assertEquals ("5e-100", Double2String.getDoubleString (5e-100));
		Assert.assertEquals ("5e100", Double2String.getDoubleString (5e100));
		Assert.assertEquals ("12345678980123456", Double2String.getDoubleString (12345678980123456L));
		Assert.assertEquals ("1.2345678980123456e17", Double2String.getDoubleString (123456789801234567L));
		Assert.assertEquals ("-1", Double2String.getDoubleString (-1.0));
		Assert.assertEquals ("-12", Double2String.getDoubleString (-12.0));
		Assert.assertEquals ("-1234", Double2String.getDoubleString (-1234.0));
		Assert.assertEquals ("-1234.1234", Double2String.getDoubleString (-1234.1234));
		Assert.assertEquals ("-0.1234", Double2String.getDoubleString (-0.1234));
		Assert.assertEquals ("-0.01234", Double2String.getDoubleString (-0.01234));
		Assert.assertEquals ("-0.001234", Double2String.getDoubleString (-0.001234));
		Assert.assertEquals ("-0.0001234", Double2String.getDoubleString (-0.0001234));
		Assert.assertEquals ("-1.1234", Double2String.getDoubleString (-1.1234));
		Assert.assertEquals ("-5e-100", Double2String.getDoubleString (-5e-100));
		Assert.assertEquals ("-5e100", Double2String.getDoubleString (-5e100));
		Assert.assertEquals ("-12345678980123456", Double2String.getDoubleString (-12345678980123456L));
		Assert.assertEquals ("-1.2345678980123456e17", Double2String.getDoubleString (-123456789801234567L));
		Assert.assertEquals (Integer.toString (Integer.MIN_VALUE), Double2String.getDoubleString (Integer.MIN_VALUE));
		Assert.assertEquals (Integer.toString (Integer.MAX_VALUE), Double2String.getDoubleString (Integer.MAX_VALUE));
		Assert.assertEquals ("1.7976931348623157e308", Double2String.getDoubleString (Double.MAX_VALUE));
		Assert.assertEquals ("2.2250738585072014e-308", Double2String.getDoubleString (Double.MIN_NORMAL));
		Assert.assertEquals ("-1.7976931348623157e308", Double2String.getDoubleString (-Double.MAX_VALUE));
		Assert.assertEquals ("-2.2250738585072014e-308", Double2String.getDoubleString (-Double.MIN_NORMAL));
		// it should be noted that 5e-324 is the same as 4.9e-324 in binary
		// representation
		Assert.assertEquals ("5e-324", Double2String.getDoubleString (Double.MIN_VALUE));
	}

	@Test
	public void testFloat () throws Exception
	{
		Assert.assertEquals ("0", Double2String.getFloatString (0f));
		Assert.assertEquals ("0.1", Double2String.getFloatString (0.1f));
		Assert.assertEquals ("0.2", Double2String.getFloatString (0.2f));
		Assert.assertEquals ("0.23", Double2String.getFloatString (0.23f));
		Assert.assertEquals ("0.233", Double2String.getFloatString (0.233f));
		Assert.assertEquals ("0.2333", Double2String.getFloatString (0.2333f));
		Assert.assertEquals ("0.23333", Double2String.getFloatString (0.23333f));
		Assert.assertEquals ("0.233333", Double2String.getFloatString (0.233333f));
		Assert.assertEquals ("0.2333333", Double2String.getFloatString (0.2333333f));
		Assert.assertEquals ("0.23333333", Double2String.getFloatString (0.23333333f));
		Assert.assertEquals ("0.23333333", Double2String.getFloatString (0.233333333f));
		Assert.assertEquals ("2.3", Double2String.getFloatString (2.3f));

		Assert.assertEquals ("4.999997", Double2String.getFloatString (4.999997f));
		Assert.assertEquals ("4.999998", Double2String.getFloatString (4.999998f));
		Assert.assertEquals ("4.999999", Double2String.getFloatString (4.999999f));
		Assert.assertEquals ("5", Double2String.getFloatString (4.9999999f));
		Assert.assertEquals ("5", Double2String.getFloatString (5f));
		Assert.assertEquals ("5.000001", Double2String.getFloatString (5.000001f));
		Assert.assertEquals ("5.000002", Double2String.getFloatString (5.000002f));
		Assert.assertEquals ("5.000003", Double2String.getFloatString (5.000003f));
		Assert.assertEquals ("5.000004", Double2String.getFloatString (5.000004f));
		Assert.assertEquals ("5.0000043", Double2String.getFloatString (5.0000043f));
		Assert.assertEquals ("5.000005", Double2String.getFloatString (5.000005f));

		Assert.assertEquals (Float.toString (Float.NaN), Double2String.getFloatString (Float.NaN));
		Assert.assertEquals (Float.toString (Float.POSITIVE_INFINITY), Double2String.getFloatString (Float.POSITIVE_INFINITY));
		Assert.assertEquals (Float.toString (Float.NEGATIVE_INFINITY), Double2String.getFloatString (Float.NEGATIVE_INFINITY));
		Assert.assertEquals ("0", Double2String.getFloatString (0.0f));
		Assert.assertEquals ("1", Double2String.getFloatString (1.0f));
		Assert.assertEquals ("12", Double2String.getFloatString (12.0f));
		Assert.assertEquals ("1234", Double2String.getFloatString (1234.0f));
		Assert.assertEquals ("1234.1234", Double2String.getFloatString (1234.1234f));
		Assert.assertEquals ("12345", Double2String.getFloatString (12345f));
		Assert.assertEquals ("12345", Double2String.getFloatString (12345f));
		Assert.assertEquals ("123456", Double2String.getFloatString (123456f));
		Assert.assertEquals ("1234567", Double2String.getFloatString (1234567f));
		Assert.assertEquals ("12345678", Double2String.getFloatString (12345678f));
		Assert.assertEquals ("0.1234", Double2String.getFloatString (0.1234f));
		Assert.assertEquals ("0.01234", Double2String.getFloatString (0.01234f));
		Assert.assertEquals ("0.001234", Double2String.getFloatString (0.001234f));
		Assert.assertEquals ("0.0001234", Double2String.getFloatString (0.0001234f));
		Assert.assertEquals ("1.234e-5", Double2String.getFloatString (0.00001234f));
		Assert.assertEquals ("1.1234", Double2String.getFloatString (1.1234f));
		Assert.assertEquals ("5e-30", Double2String.getFloatString (5e-30f));
		Assert.assertEquals ("5e30", Double2String.getFloatString (5e30f));
		Assert.assertEquals ("12000000", Double2String.getFloatString (1.2e7f));
		Assert.assertEquals ("1.2345679e8", Double2String.getFloatString (123456789));
		Assert.assertEquals ("1.2345679e17", Double2String.getFloatString (123456789801234567L));
		Assert.assertEquals ("-1", Double2String.getFloatString (-1.0f));
		Assert.assertEquals ("-12", Double2String.getFloatString (-12.0f));
		Assert.assertEquals ("-1234", Double2String.getFloatString (-1234.0f));
		Assert.assertEquals ("-1234.1234", Double2String.getFloatString (-1234.1234f));
		Assert.assertEquals ("-0.1234", Double2String.getFloatString (-0.1234f));
		Assert.assertEquals ("-0.01234", Double2String.getFloatString (-0.01234f));
		Assert.assertEquals ("-0.001234", Double2String.getFloatString (-0.001234f));
		Assert.assertEquals ("-0.0001234", Double2String.getFloatString (-0.0001234f));
		Assert.assertEquals ("-1.1234", Double2String.getFloatString (-1.1234f));
		Assert.assertEquals ("-5e-30", Double2String.getFloatString (-5e-30f));
		Assert.assertEquals ("-5e30", Double2String.getFloatString (-5e30f));
		Assert.assertEquals ("-1.234568e16", Double2String.getFloatString (-12345678980123456L));
		Assert.assertEquals ("-1.2345679e17", Double2String.getFloatString (-123456789801234567L));
		Assert.assertEquals (Short.toString (Short.MIN_VALUE), Double2String.getFloatString (Short.MIN_VALUE));
		Assert.assertEquals (Short.toString (Short.MAX_VALUE), Double2String.getFloatString (Short.MAX_VALUE));
		Assert.assertEquals ("3.4028235e38", Double2String.getFloatString (Float.MAX_VALUE));
		Assert.assertEquals ("1.1754944e-38", Double2String.getFloatString (Float.MIN_NORMAL));
		Assert.assertEquals ("-3.4028235e38", Double2String.getFloatString (-Float.MAX_VALUE));
		Assert.assertEquals ("-1.1754944e-38", Double2String.getFloatString (-Float.MIN_NORMAL));

		// Well 1.4e-15 is the same as 1e-45 floating point representation wise
		Assert.assertEquals ("1e-45", Double2String.getFloatString (Float.MIN_VALUE));
		Assert.assertEquals ("-1e-45", Double2String.getFloatString (-Float.MIN_VALUE));
	}
}
