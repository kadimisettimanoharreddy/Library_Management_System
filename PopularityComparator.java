package com.FrameWorkProject;

import java.util.Comparator;

public class PopularityComparator implements Comparator {
	public int compare(Object o1,Object o2)
	{
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		if(b1.getRating()==b2.getRating())
			return b1.getTitle( ).compareTo(b2.getTitle());
		return (int)(b2.getRating()-b1.getRating());
	}

}