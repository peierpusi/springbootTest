package com.baizhi.service;

import com.baizhi.dao.AlbumDao;
import com.baizhi.entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 管理员管理
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Autowired
    private AlbumDao albumDao;

    /**
     * ]
     * 查询所有管里员
     *
     * @return
     */
    @Override
    public List<Album> selectAll() {
        List<Album> list = albumDao.selectAll();
        return list;
    }
}
