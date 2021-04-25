package Zq.retrieveRoom.service;

import Zq.retrieveRoom.pojo.Bulletin;

import java.util.List;

/**
 * @ClassName BulletinService
 * @Description 公告栏相关功能(增 ： 添加公告 、 删 ： 删除 （ 不展示 ） 过期公告 、 改 ： 修改公告内容 、 查 ： 用于展示公告 （ 类似轮播图 ）)
 * @Author ASUS
 * @Date 2021/4/25 0:06
 */
public interface BulletinService {

    int addBulletin(Bulletin bulletin);

    int delBulletin(Integer id);

    int modifyBulletin(Bulletin bulletin);

    List<Bulletin> selectAllBulletin();
}
