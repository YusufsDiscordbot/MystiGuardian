/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.records;


import io.github.yusufsdiscordbot.mystigurdian.db.tables.SoftBan;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SoftBanRecord extends UpdatableRecordImpl<SoftBanRecord> implements Record6<String, String, String, Integer, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.soft_ban.reason</code>.
     */
    public SoftBanRecord setReason(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.reason</code>.
     */
    public String getReason() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.soft_ban.user_id</code>.
     */
    public SoftBanRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.user_id</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.soft_ban.guild_id</code>.
     */
    public SoftBanRecord setGuildId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.guild_id</code>.
     */
    public String getGuildId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.soft_ban.days</code>.
     */
    public SoftBanRecord setDays(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.days</code>.
     */
    public Integer getDays() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.soft_ban.id</code>.
     */
    public SoftBanRecord setId(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.id</code>.
     */
    public Long getId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.soft_ban.time</code>.
     */
    public SoftBanRecord setTime(OffsetDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.soft_ban.time</code>.
     */
    public OffsetDateTime getTime() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, Integer, Long, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, Integer, Long, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return SoftBan.SOFT_BAN.REASON;
    }

    @Override
    public Field<String> field2() {
        return SoftBan.SOFT_BAN.USER_ID;
    }

    @Override
    public Field<String> field3() {
        return SoftBan.SOFT_BAN.GUILD_ID;
    }

    @Override
    public Field<Integer> field4() {
        return SoftBan.SOFT_BAN.DAYS;
    }

    @Override
    public Field<Long> field5() {
        return SoftBan.SOFT_BAN.ID;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return SoftBan.SOFT_BAN.TIME;
    }

    @Override
    public String component1() {
        return getReason();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public String component3() {
        return getGuildId();
    }

    @Override
    public Integer component4() {
        return getDays();
    }

    @Override
    public Long component5() {
        return getId();
    }

    @Override
    public OffsetDateTime component6() {
        return getTime();
    }

    @Override
    public String value1() {
        return getReason();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public String value3() {
        return getGuildId();
    }

    @Override
    public Integer value4() {
        return getDays();
    }

    @Override
    public Long value5() {
        return getId();
    }

    @Override
    public OffsetDateTime value6() {
        return getTime();
    }

    @Override
    public SoftBanRecord value1(String value) {
        setReason(value);
        return this;
    }

    @Override
    public SoftBanRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public SoftBanRecord value3(String value) {
        setGuildId(value);
        return this;
    }

    @Override
    public SoftBanRecord value4(Integer value) {
        setDays(value);
        return this;
    }

    @Override
    public SoftBanRecord value5(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SoftBanRecord value6(OffsetDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public SoftBanRecord values(String value1, String value2, String value3, Integer value4, Long value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SoftBanRecord
     */
    public SoftBanRecord() {
        super(SoftBan.SOFT_BAN);
    }

    /**
     * Create a detached, initialised SoftBanRecord
     */
    public SoftBanRecord(String reason, String userId, String guildId, Integer days, Long id, OffsetDateTime time) {
        super(SoftBan.SOFT_BAN);

        setReason(reason);
        setUserId(userId);
        setGuildId(guildId);
        setDays(days);
        setId(id);
        setTime(time);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised SoftBanRecord
     */
    public SoftBanRecord(io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos.SoftBan value) {
        super(SoftBan.SOFT_BAN);

        if (value != null) {
            setReason(value.getReason());
            setUserId(value.getUserId());
            setGuildId(value.getGuildId());
            setDays(value.getDays());
            setId(value.getId());
            setTime(value.getTime());
            resetChangedOnNotNull();
        }
    }
}
