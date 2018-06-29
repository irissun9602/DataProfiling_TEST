package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Columns;

@Mapper
public interface ColumnsMapper {

	List<Columns> findAll(); 
	
}
