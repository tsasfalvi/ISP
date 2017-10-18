package com.cache;

public interface Cache<T> {

	// Basic cache operations
	void put(String key, T value);

	T get(String key);

	void clear(String key);

	void clearAll();
}
