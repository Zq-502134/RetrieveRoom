package Zq.retrieveRoom.service.impl;

import Zq.retrieveRoom.dao.BulletinDao;
import Zq.retrieveRoom.pojo.Bulletin;
import Zq.retrieveRoom.service.BulletinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BulletinServiceImpl
 * @Description 具体实现方法
 * @Author Zhang Qing
 * @Date 2021/4/25 0:30
 */
@Service
public class BulletinServiceImpl implements BulletinService {

    @Resource
    private BulletinDao bulletinDao;

    public int addBulletin(Bulletin bulletin) {
        return bulletinDao.insert(bulletin);
    }

    public int delBulletin(Integer id) {
        return bulletinDao.deleteByPrimaryKey(id);
    }

    public int modifyBulletin(Bulletin bulletin) {
//        修改内容，更新管理员
        return bulletinDao.updateByPrimaryKeySelective(bulletin);
    }

    public List<Bulletin> selectAllBulletin() {
        return bulletinDao.selectAllBulletin();
    }
}
