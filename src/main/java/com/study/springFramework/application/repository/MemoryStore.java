package com.study.springFramework.application.repository;

import java.util.HashMap;
import java.util.Map;

public class MemoryStore<T> {
	private final Map<Long, T> memoryMap = new HashMap<>();
	private Long id;
	
	public Long put(T target) {
		memoryMap.put(id, target);
		return id;
	}
	
	public T find(Long id) {
		return memoryMap.get(id);
	}
	
	public static MemoryStore getInstance() {
		return new MemoryStore();
	}
	
	public Long getCurrentId() {
		return id;
	}
}
