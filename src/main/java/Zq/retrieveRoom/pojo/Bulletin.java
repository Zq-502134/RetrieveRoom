package Zq.retrieveRoom.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * bulletin
 *
 * @author
 */
@Data
public class Bulletin implements Serializable {
    private Integer id;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Integer uId;

    private static final long serialVersionUID = 1L;
}