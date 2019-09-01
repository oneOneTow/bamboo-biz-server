/*
 * This file is generated by jOOQ.
*/
package com.luzhiqing.bamboo.entity;


import com.luzhiqing.bamboo.entity.tables.TExpressOrder;
import com.luzhiqing.bamboo.entity.tables.records.TExpressOrderRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>dev</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TExpressOrderRecord, Integer> IDENTITY_T_EXPRESS_ORDER = Identities0.IDENTITY_T_EXPRESS_ORDER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TExpressOrderRecord> KEY_T_EXPRESS_ORDER_PRIMARY = UniqueKeys0.KEY_T_EXPRESS_ORDER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<TExpressOrderRecord, Integer> IDENTITY_T_EXPRESS_ORDER = Internal.createIdentity(TExpressOrder.T_EXPRESS_ORDER, TExpressOrder.T_EXPRESS_ORDER.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<TExpressOrderRecord> KEY_T_EXPRESS_ORDER_PRIMARY = Internal.createUniqueKey(TExpressOrder.T_EXPRESS_ORDER, "KEY_t_express_order_PRIMARY", TExpressOrder.T_EXPRESS_ORDER.ID);
    }
}
