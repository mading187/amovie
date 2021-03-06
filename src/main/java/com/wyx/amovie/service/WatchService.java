package com.wyx.amovie.service;

import com.wyx.amovie.entity.Watch;

/**
 * @author wyx
 */
public interface WatchService {

    /**
     * 添加到列表
     *
     * @param watch
     * @return
     */
    int addWatch(Watch watch);

    /**
     * 从列表中移除
     *
     * @param movieId
     * @return
     */
    int deleteWatch(Integer movieId);

    /**
     * 查询某电影是否存在列表中
     *
     * @param userId
     * @param movieId
     * @return
     */
    Watch getWatchByIds(Integer userId, Integer movieId);
}
