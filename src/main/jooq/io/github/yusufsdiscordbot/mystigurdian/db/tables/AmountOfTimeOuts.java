/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables;


import io.github.yusufsdiscordbot.mystigurdian.db.Keys;
import io.github.yusufsdiscordbot.mystigurdian.db.Public;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AmountOfTimeOutsRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmountOfTimeOuts extends TableImpl<AmountOfTimeOutsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.amount_of_time_outs</code>
     */
    public static final AmountOfTimeOuts AMOUNT_OF_TIME_OUTS = new AmountOfTimeOuts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AmountOfTimeOutsRecord> getRecordType() {
        return AmountOfTimeOutsRecord.class;
    }

    /**
     * The column <code>public.amount_of_time_outs.user_id</code>.
     */
    public final TableField<AmountOfTimeOutsRecord, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.amount_of_time_outs.guild_id</code>.
     */
    public final TableField<AmountOfTimeOutsRecord, String> GUILD_ID = createField(DSL.name("guild_id"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>public.amount_of_time_outs.id</code>.
     */
    public final TableField<AmountOfTimeOutsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.amount_of_time_outs.amount_of_time_outs</code>.
     */
    public final TableField<AmountOfTimeOutsRecord, Integer> AMOUNT_OF_TIME_OUTS_ = createField(DSL.name("amount_of_time_outs"), SQLDataType.INTEGER, this, "");

    private AmountOfTimeOuts(Name alias, Table<AmountOfTimeOutsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AmountOfTimeOuts(Name alias, Table<AmountOfTimeOutsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.amount_of_time_outs</code> table reference
     */
    public AmountOfTimeOuts(String alias) {
        this(DSL.name(alias), AMOUNT_OF_TIME_OUTS);
    }

    /**
     * Create an aliased <code>public.amount_of_time_outs</code> table reference
     */
    public AmountOfTimeOuts(Name alias) {
        this(alias, AMOUNT_OF_TIME_OUTS);
    }

    /**
     * Create a <code>public.amount_of_time_outs</code> table reference
     */
    public AmountOfTimeOuts() {
        this(DSL.name("amount_of_time_outs"), null);
    }

    public <O extends Record> AmountOfTimeOuts(Table<O> child, ForeignKey<O, AmountOfTimeOutsRecord> key) {
        super(child, key, AMOUNT_OF_TIME_OUTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<AmountOfTimeOutsRecord> getPrimaryKey() {
        return Keys.PK_AMOUNT_OF_TIME_OUTS;
    }

    @Override
    public List<UniqueKey<AmountOfTimeOutsRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UK_AMOUNT_OF_TIME_OUTS);
    }

    @Override
    public AmountOfTimeOuts as(String alias) {
        return new AmountOfTimeOuts(DSL.name(alias), this);
    }

    @Override
    public AmountOfTimeOuts as(Name alias) {
        return new AmountOfTimeOuts(alias, this);
    }

    @Override
    public AmountOfTimeOuts as(Table<?> alias) {
        return new AmountOfTimeOuts(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AmountOfTimeOuts rename(String name) {
        return new AmountOfTimeOuts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AmountOfTimeOuts rename(Name name) {
        return new AmountOfTimeOuts(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AmountOfTimeOuts rename(Table<?> name) {
        return new AmountOfTimeOuts(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super String, ? super String, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super String, ? super String, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
