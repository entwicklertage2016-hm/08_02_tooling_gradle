package org.gradle;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;

public class Utils {
	
	public static <T> Collection<T> getIntersection(Collection<T> first, Collection<T> second){
		
		Collection<T> union = CollectionUtils.intersection(first, second);
		return union;
		
	}
	
	public static void main(String[] args) {
		System.out.println("somethings");
	}
	
}
