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


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables {

    /**
     * The table <code>public.amount_of_bans</code>.
     */
    public static final AmountOfBans AMOUNT_OF_BANS = AmountOfBans.AMOUNT_OF_BANS;

    /**
     * The table <code>public.amount_of_kicks</code>.
     */
    public static final AmountOfKicks AMOUNT_OF_KICKS = AmountOfKicks.AMOUNT_OF_KICKS;

    /**
     * The table <code>public.amount_of_time_outs</code>.
     */
    public static final AmountOfTimeOuts AMOUNT_OF_TIME_OUTS = AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS;

    /**
     * The table <code>public.amount_of_warns</code>.
     */
    public static final AmountOfWarns AMOUNT_OF_WARNS = AmountOfWarns.AMOUNT_OF_WARNS;

    /**
     * The table <code>public.ban</code>.
     */
    public static final Ban BAN = Ban.BAN;

    /**
     * The table <code>public.kick</code>.
     */
    public static final Kick KICK = Kick.KICK;

    /**
     * The table <code>public.reload_audit</code>.
     */
    public static final ReloadAudit RELOAD_AUDIT = ReloadAudit.RELOAD_AUDIT;

    /**
     * The table <code>public.time_out</code>.
     */
    public static final TimeOut TIME_OUT = TimeOut.TIME_OUT;

    /**
     * The table <code>public.warns</code>.
     */
    public static final Warns WARNS = Warns.WARNS;
}
