package com.cache;

import java.util.WeakHashMap;

public class BasicCache<T> implements Cache<T>{

	private WeakHashMap<String, T> cache = new WeakHashMap<String, T>();

	@Override
	public void put(String key, T value) {
		cache.put(key, value);
	}

	@Override
	public T get(String key) {
		return cache.get(cache);
	}

	@Override
	public void clear(String key) {
		cache.remove(key);
	}

	@Override
	public void clearAll() {
		cache.clear();
	}

}
