package com.luzhiqing.bamboo.dao;

import java.util.List;

public interface BaseJooqDao<P> {
    /**
     * 向数据库插入一条记录
     *
     * @param pojo
     * @return
     */
    long insert(P pojo);

    /**
     * 删除满足条件的记录
     *
     * @param pojo
     * @return
     */
    long delete(P pojo);

    /**
     * 根据主键修改记录
     *
     * @param pojo
     * @return
     */
    P update(P pojo);

    /**
     * 查询满足条件的记录
     *
     * @param pojo
     * @return
     */
    List<P> select(P pojo);

    /**
     * 查询满足条件的单条记录
     *
     * @param pojo
     * @return
     */
    P selectOne(P pojo);

    /**
     * 批量插入数据
     *
     * @param pojos
     * @return
     */
    int bachInsert(List<P> pojos);
}
