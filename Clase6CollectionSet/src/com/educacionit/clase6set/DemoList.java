package com.educacionit.clase6set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		List  list = Collections.synchronizedList(new ArrayList());
		List  linkedlist = Collections.synchronizedList(new LinkedList());

	}

}
