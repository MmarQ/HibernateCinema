package com.mmarq.manage;

public interface Manager<T> {
	public void add(T record);
	public void delete(int id);
	public T find(int id);
	public void update(T record);
}
