/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.records;


import io.github.yusufsdiscordbot.mystigurdian.db.tables.AmountOfTimeOuts;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class AmountOfTimeOutsRecord extends TableRecordImpl<AmountOfTimeOutsRecord> implements Record4<String, String, Long, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached AmountOfTimeOutsRecord
     */
    public AmountOfTimeOutsRecord() {
        super(AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS);
    }

    /**
     * Create a detached, initialised AmountOfTimeOutsRecord
     */
    public AmountOfTimeOutsRecord(String userId, String guildId, Long id, Integer amountOfTimeOuts) {
        super(AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS);

        setUserId(userId);
        setGuildId(guildId);
        setId(id);
        setAmountOfTimeOuts(amountOfTimeOuts);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AmountOfTimeOutsRecord
     */
    public AmountOfTimeOutsRecord(io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos.AmountOfTimeOuts value) {
        super(AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS);

        if (value != null) {
            setUserId(value.getUserId());
            setGuildId(value.getGuildId());
            setId(value.getId());
            setAmountOfTimeOuts(value.getAmountOfTimeOuts());
            resetChangedOnNotNull();
        }
    }

    /**
     * Getter for <code>public.amount_of_time_outs.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.amount_of_time_outs.user_id</code>.
     */
    public AmountOfTimeOutsRecord setUserId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.amount_of_time_outs.guild_id</code>.
     */
    public String getGuildId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.amount_of_time_outs.guild_id</code>.
     */
    public AmountOfTimeOutsRecord setGuildId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.amount_of_time_outs.id</code>.
     */
    public Long getId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>public.amount_of_time_outs.id</code>.
     */
    public AmountOfTimeOutsRecord setId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.amount_of_time_outs.amount_of_time_outs</code>.
     */
    public Integer getAmountOfTimeOuts() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.amount_of_time_outs.amount_of_time_outs</code>.
     */
    public AmountOfTimeOutsRecord setAmountOfTimeOuts(Integer value) {
        set(3, value);
        return this;
    }

    @Override
    public Row4<String, String, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Long, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.GUILD_ID;
    }

    @Override
    public Field<Long> field3() {
        return AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.ID;
    }

    @Override
    public Field<Integer> field4() {
        return AmountOfTimeOuts.AMOUNT_OF_TIME_OUTS.AMOUNT_OF_TIME_OUTS_;
    }

    @Override
    public String component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getGuildId();
    }

    @Override
    public Long component3() {
        return getId();
    }

    @Override
    public Integer component4() {
        return getAmountOfTimeOuts();
    }

    @Override
    public String value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getGuildId();
    }

    @Override
    public Long value3() {
        return getId();
    }

    @Override
    public Integer value4() {
        return getAmountOfTimeOuts();
    }

    @Override
    public AmountOfTimeOutsRecord value1(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public AmountOfTimeOutsRecord value2(String value) {
        setGuildId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public AmountOfTimeOutsRecord value3(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AmountOfTimeOutsRecord value4(Integer value) {
        setAmountOfTimeOuts(value);
        return this;
    }

    @Override
    public AmountOfTimeOutsRecord values(String value1, String value2, Long value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}
