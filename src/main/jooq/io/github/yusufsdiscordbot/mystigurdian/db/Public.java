/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db;


import io.github.yusufsdiscordbot.mystigurdian.db.tables.AmountOfBans;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.AmountOfKicks;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.AmountOfTimeOuts;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.AmountOfWarns;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.Ban;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.Kick;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.ReloadAudit;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.TimeOut;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.Warns;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class Public extends SchemaImpl {

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>public.amount_of_bans</code>.
     */
    public final AmountOfBans AMOUNT_OF_BANS = AmountOfBans.AMOUNT_OF_BANS;

    /**
     * The table <code>public.amount_of_kicks</code>.
     */
    public final AmountOfKicks AMOUNT_OF_KICKS = AmountOfKicks.AMOUNT_OF_KICKS;

    /**
     * The table <code>public.amount_of_time_outs</code>.
     */
    public final AmountOfTimeOuts AMOUNT_OF_TIME_OUTS = AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS;

    /**
     * The table <code>public.amount_of_warns</code>.
     */
    public final AmountOfWarns AMOUNT_OF_WARNS = AmountOfWarns.AMOUNT_OF_WARNS;

    /**
     * The table <code>public.ban</code>.
     */
    public final Ban BAN = Ban.BAN;

    /**
     * The table <code>public.kick</code>.
     */
    public final Kick KICK = Kick.KICK;

    /**
     * The table <code>public.reload_audit</code>.
     */
    public final ReloadAudit RELOAD_AUDIT = ReloadAudit.RELOAD_AUDIT;

    /**
     * The table <code>public.time_out</code>.
     */
    public final TimeOut TIME_OUT = TimeOut.TIME_OUT;

    /**
     * The table <code>public.warns</code>.
     */
    public final Warns WARNS = Warns.WARNS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
                AmountOfBans.AMOUNT_OF_BANS,
                AmountOfKicks.AMOUNT_OF_KICKS,
                AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS,
                AmountOfWarns.AMOUNT_OF_WARNS,
                Ban.BAN,
                Kick.KICK,
                ReloadAudit.RELOAD_AUDIT,
                TimeOut.TIME_OUT,
                Warns.WARNS
        );
    }
}
