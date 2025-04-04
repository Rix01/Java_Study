package com.sec11.myutil02;

import java.util.Locale;

public class LocaleTest {
	// 예전에는 다국어 사이트 만들 때 사용했었지만
	// 요즘은 위성에서 받아와서 사용하기 때문에 잘 사용하지 않는다.
	public static void main(String[] args) {
		// Locale m_locale = Locale.getDefault();
		Locale m_locale = Locale.CANADA_FRENCH;
		System.out.println("  Language, Country, Variant, Name");
		System.out.println("Default locale: ");
		System.out.println("   " + m_locale.getLanguage() + ", "
				+ m_locale.getCountry() + ", " + m_locale.getVariant() + ", "
				+ m_locale.getDisplayName());

	
		}
	}

