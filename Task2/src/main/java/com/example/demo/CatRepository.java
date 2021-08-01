package com.example.demo;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CatRepository {

	
	 java.util.List<Entity> catSelect();

}
