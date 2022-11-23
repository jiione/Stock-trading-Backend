package com.KWdatabase.teamProject.dao;

import com.KWdatabase.teamProject.Model.ItemTimeCondition;
import com.KWdatabase.teamProject.dto.ItemInfoResponseDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ItemTimeConditionDao {
    public ItemTimeCondition getItemTimeCondition(@Param("condition") ItemTimeCondition itemTimeCondition);
    public void insertItemTimeCondition(@Param("condition") ItemTimeCondition itemTimeCondition);
    public ItemTimeCondition getNewCondition(String itemCode);
    public List<ItemInfoResponseDto>getVolumeRank();
}