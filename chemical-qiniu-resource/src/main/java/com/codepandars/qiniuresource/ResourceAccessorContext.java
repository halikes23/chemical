package com.codepandars.qiniuresource;

public interface ResourceAccessorContext<T> {

	public void init() ;
	
	Accessor getAccessor( T param ) ;
	
}
