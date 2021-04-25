package Zq.retrieveRoom.dao;

import Zq.retrieveRoom.pojo.Bulletin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BulletinDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Bulletin record);

    int insertSelective(Bulletin record);

    Bulletin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bulletin record);

    int updateByPrimaryKey(Bulletin record);

    List<Bulletin> selectAllBulletin();
}