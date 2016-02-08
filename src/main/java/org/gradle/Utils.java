package org.gradle;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;

public class Utils {
	
	public static <T> Collection<T> getIntersection(Collection<T> aFirstCollection, Collection<T> aSecondCollection){
		
		Collection<T> union = CollectionUtils.intersection(aFirstCollection, aSecondCollection);
		return union;
		
	}
	
	public static void main(String[] args) {
		System.out.println("somethings");
	}
	
}
