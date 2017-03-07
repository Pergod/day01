package com.itcast.beanutils;


import java.util.Date;
import java.util.Locale;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;


public class Demo1 {
	
	@Test
	public void test1() throws Exception{
		String birthday="1994-08-01";
		String age="12";
		User user=new User();
		ConvertUtils.register(new DateLocaleConverter(Locale.CHINA,"yyyy-MM-dd"), Date.class);
		BeanUtils.copyProperty(user, "age", age);
		BeanUtils.copyProperty(user, "birthday", birthday);
		System.out.println(user.getBirthday());
		System.out.println(user.getAge());
	}
}
