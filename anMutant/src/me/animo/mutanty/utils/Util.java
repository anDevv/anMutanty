package me.animo.mutanty.utils;

import java.util.ArrayList;
import java.util.List;

public class Util {
	public static String fix(String s) {
		return s.replace("&", "§");
	}
    public static List<String> fix(final List<String> listString) {
        final List<String> list = new ArrayList<String>();
        listString.forEach(s -> list.add(fix(s)));
        return list;
    }

}

