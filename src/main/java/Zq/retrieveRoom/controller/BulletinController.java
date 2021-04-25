package Zq.retrieveRoom.controller;

import Zq.retrieveRoom.pojo.Bulletin;
import Zq.retrieveRoom.service.BulletinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName BulletinController
 * @Description 公告功能接口
 * @Author Zhang Qing
 * @Date 2021/4/25 0:45
 */
@RestController
@RequestMapping("/bulletin")
public class BulletinController {

    @Resource
    private BulletinService bulletinService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Bulletin> showAllBulletin() {
        return bulletinService.selectAllBulletin();
    }


}
