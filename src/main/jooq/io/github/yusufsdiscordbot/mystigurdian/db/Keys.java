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
import io.github.yusufsdiscordbot.mystigurdian.db.tables.SoftBan;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.TimeOut;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.Warns;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AmountOfBansRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AmountOfKicksRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AmountOfTimeOutsRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AmountOfWarnsRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.BanRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.KickRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.ReloadAuditRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.SoftBanRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.TimeOutRecord;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.WarnsRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AmountOfBansRecord> PK_AMOUNT_OF_BANS = Internal.createUniqueKey(AmountOfBans.AMOUNT_OF_BANS, DSL.name("pk_amount_of_bans"), new TableField[] { AmountOfBans.AMOUNT_OF_BANS.ID }, true);
    public static final UniqueKey<AmountOfBansRecord> UK_AMOUNT_OF_BANS = Internal.createUniqueKey(AmountOfBans.AMOUNT_OF_BANS, DSL.name("uk_amount_of_bans"), new TableField[] { AmountOfBans.AMOUNT_OF_BANS.GUILD_ID, AmountOfBans.AMOUNT_OF_BANS.USER_ID, AmountOfBans.AMOUNT_OF_BANS.ID }, true);
    public static final UniqueKey<AmountOfKicksRecord> PK_AMOUNT_OF_KICKS = Internal.createUniqueKey(AmountOfKicks.AMOUNT_OF_KICKS, DSL.name("pk_amount_of_kicks"), new TableField[] { AmountOfKicks.AMOUNT_OF_KICKS.ID }, true);
    public static final UniqueKey<AmountOfKicksRecord> UK_AMOUNT_OF_KICKS = Internal.createUniqueKey(AmountOfKicks.AMOUNT_OF_KICKS, DSL.name("uk_amount_of_kicks"), new TableField[] { AmountOfKicks.AMOUNT_OF_KICKS.GUILD_ID, AmountOfKicks.AMOUNT_OF_KICKS.USER_ID, AmountOfKicks.AMOUNT_OF_KICKS.ID }, true);
    public static final UniqueKey<AmountOfTimeOutsRecord> PK_AMOUNT_OF_TIME_OUTS = Internal.createUniqueKey(AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS, DSL.name("pk_amount_of_time_outs"), new TableField[] { AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.ID }, true);
    public static final UniqueKey<AmountOfTimeOutsRecord> UK_AMOUNT_OF_TIME_OUTS = Internal.createUniqueKey(AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS, DSL.name("uk_amount_of_time_outs"), new TableField[] { AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.GUILD_ID, AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.USER_ID, AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.ID }, true);
    public static final UniqueKey<AmountOfWarnsRecord> PK_AMOUNT_OF_WARNS = Internal.createUniqueKey(AmountOfWarns.AMOUNT_OF_WARNS, DSL.name("pk_amount_of_warns"), new TableField[] { AmountOfWarns.AMOUNT_OF_WARNS.ID }, true);
    public static final UniqueKey<AmountOfWarnsRecord> UK_AMOUNT_OF_WARNS = Internal.createUniqueKey(AmountOfWarns.AMOUNT_OF_WARNS, DSL.name("uk_amount_of_warns"), new TableField[] { AmountOfWarns.AMOUNT_OF_WARNS.GUILD_ID, AmountOfWarns.AMOUNT_OF_WARNS.USER_ID, AmountOfWarns.AMOUNT_OF_WARNS.ID }, true);
    public static final UniqueKey<BanRecord> PK_BAN = Internal.createUniqueKey(Ban.BAN, DSL.name("pk_ban"), new TableField[] { Ban.BAN.ID }, true);
    public static final UniqueKey<BanRecord> UK_BAN = Internal.createUniqueKey(Ban.BAN, DSL.name("uk_ban"), new TableField[] { Ban.BAN.GUILD_ID, Ban.BAN.USER_ID, Ban.BAN.ID }, true);
    public static final UniqueKey<KickRecord> PK_KICK = Internal.createUniqueKey(Kick.KICK, DSL.name("pk_kick"), new TableField[] { Kick.KICK.ID }, true);
    public static final UniqueKey<KickRecord> UK_KICK = Internal.createUniqueKey(Kick.KICK, DSL.name("uk_kick"), new TableField[] { Kick.KICK.GUILD_ID, Kick.KICK.USER_ID, Kick.KICK.ID }, true);
    public static final UniqueKey<ReloadAuditRecord> PK_RELOAD_AUDIT = Internal.createUniqueKey(ReloadAudit.RELOAD_AUDIT, DSL.name("pk_reload_audit"), new TableField[] { ReloadAudit.RELOAD_AUDIT.ID }, true);
    public static final UniqueKey<SoftBanRecord> PK_SOFT_BAN = Internal.createUniqueKey(SoftBan.SOFT_BAN, DSL.name("pk_soft_ban"), new TableField[] { SoftBan.SOFT_BAN.ID }, true);
    public static final UniqueKey<TimeOutRecord> PK_TIME_OUT = Internal.createUniqueKey(TimeOut.TIME_OUT, DSL.name("pk_time_out"), new TableField[] { TimeOut.TIME_OUT.ID }, true);
    public static final UniqueKey<TimeOutRecord> UK_TIME_OUT = Internal.createUniqueKey(TimeOut.TIME_OUT, DSL.name("uk_time_out"), new TableField[] { TimeOut.TIME_OUT.GUILD_ID, TimeOut.TIME_OUT.USER_ID, TimeOut.TIME_OUT.ID }, true);
    public static final UniqueKey<WarnsRecord> PK_WARNS = Internal.createUniqueKey(Warns.WARNS, DSL.name("pk_warns"), new TableField[] { Warns.WARNS.ID }, true);
    public static final UniqueKey<WarnsRecord> UK_WARNS = Internal.createUniqueKey(Warns.WARNS, DSL.name("uk_warns"), new TableField[] { Warns.WARNS.GUILD_ID, Warns.WARNS.USER_ID, Warns.WARNS.ID }, true);
}
