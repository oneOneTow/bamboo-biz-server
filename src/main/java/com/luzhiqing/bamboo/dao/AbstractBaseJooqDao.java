package com.luzhiqing.bamboo.dao;

import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;


import java.util.ArrayList;
import java.util.List;


public abstract class AbstractBaseJooqDao<R extends TableRecord<R>, T extends Table<R>, P> implements BaseJooqDao<P> {
    @Autowired
    protected DSLContext dsl;
    /**
     * 实体对应的数据库表
     */
    protected T table;
    /**
     * pojo Class
     */
    protected Class<P> clazz;

    protected abstract void setTable(T table);
    protected abstract void setClass(Class<P> clazz);

    @Override
    public long insert(P pojo) {
        R record = table.newRecord();
        record.from(pojo);
        return dsl.executeInsert(record);
    }

    @Override
    public long delete(P pojo) {
        R record = table.newRecord();
        record.from(pojo);
        List<Condition> conditions = createConditions(record);
        return dsl.delete(table).where(conditions).execute();
    }

    @Override
    public P update(P pojo) {
        return null;
    }

    @Override
    public List<P> select(P pojo) {
        R record = table.newRecord();
        record.from(pojo);
        List<Condition> conditions = createConditions(record);
        return dsl.selectFrom(table).where(conditions).fetchInto(clazz);
    }

    @Override
    public P selectOne(P pojo) {
        R record = table.newRecord();
        record.from(pojo);
        List<Condition> conditions = createConditions(record);
        return dsl.selectFrom(table).where(conditions).fetchOneInto(clazz);
    }

    @Override
    public int bachInsert(List<P> pojos) {
        return 0;
    }

    /**
     * 根据record创建查询条件
     *
     * @param record
     * @return
     */
    private List<Condition> createConditions(R record) {
        List<Condition> conditions = new ArrayList<>();
        Field<?>[] fields = record.fields();
        for (Field field : fields) {
            if (null != record.get(field)) {
                conditions.add(field.eq(record.get(field)));
            }
        }
        if(CollectionUtils.isEmpty(conditions)){
            throw new RuntimeException("条件为空");
        }
        return conditions;
    }
}

