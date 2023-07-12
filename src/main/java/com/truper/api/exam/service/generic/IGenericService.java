package com.truper.api.exam.service.generic;

import java.util.Optional;

public interface IGenericService <T> {
	
	Optional<T> saveList (T t);
	Optional<T> getEntity (Long id);
	Optional<T> updateList (T t, Long id);
	Optional<T> deleteList (Long id);

}
