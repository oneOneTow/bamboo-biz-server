/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity;


import com.luzhiqing.bamboo.entity.tables.TExpressOrder;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dev extends SchemaImpl {

    private static final long serialVersionUID = 772428665;

    /**
     * The reference instance of <code>dev</code>
     */
    public static final Dev DEV = new Dev();

    /**
     * The table <code>dev.t_express_order</code>.
     */
    public final TExpressOrder T_EXPRESS_ORDER = TExpressOrder.T_EXPRESS_ORDER;

    /**
     * No further instances allowed
     */
    private Dev() {
        super("dev", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            TExpressOrder.T_EXPRESS_ORDER);
    }
}
