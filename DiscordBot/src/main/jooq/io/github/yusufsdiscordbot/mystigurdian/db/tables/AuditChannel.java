/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables;


import io.github.yusufsdiscordbot.mystigurdian.db.Keys;
import io.github.yusufsdiscordbot.mystigurdian.db.Public;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.AuditChannelRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
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
public class AuditChannel extends TableImpl<AuditChannelRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.audit_channel</code>
     */
    public static final AuditChannel AUDIT_CHANNEL = new AuditChannel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AuditChannelRecord> getRecordType() {
        return AuditChannelRecord.class;
    }

    /**
     * The column <code>public.audit_channel.guild_id</code>.
     */
    public final TableField<AuditChannelRecord, String> GUILD_ID = createField(DSL.name("guild_id"), SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>public.audit_channel.channel_id</code>.
     */
    public final TableField<AuditChannelRecord, String> CHANNEL_ID = createField(DSL.name("channel_id"), SQLDataType.VARCHAR(256), this, "");

    private AuditChannel(Name alias, Table<AuditChannelRecord> aliased) {
        this(alias, aliased, null);
    }

    private AuditChannel(Name alias, Table<AuditChannelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.audit_channel</code> table reference
     */
    public AuditChannel(String alias) {
        this(DSL.name(alias), AUDIT_CHANNEL);
    }

    /**
     * Create an aliased <code>public.audit_channel</code> table reference
     */
    public AuditChannel(Name alias) {
        this(alias, AUDIT_CHANNEL);
    }

    /**
     * Create a <code>public.audit_channel</code> table reference
     */
    public AuditChannel() {
        this(DSL.name("audit_channel"), null);
    }

    public <O extends Record> AuditChannel(Table<O> child, ForeignKey<O, AuditChannelRecord> key) {
        super(child, key, AUDIT_CHANNEL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<AuditChannelRecord> getPrimaryKey() {
        return Keys.PK_AUDIT_CHANNEL;
    }

    @Override
    public AuditChannel as(String alias) {
        return new AuditChannel(DSL.name(alias), this);
    }

    @Override
    public AuditChannel as(Name alias) {
        return new AuditChannel(alias, this);
    }

    @Override
    public AuditChannel as(Table<?> alias) {
        return new AuditChannel(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditChannel rename(String name) {
        return new AuditChannel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditChannel rename(Name name) {
        return new AuditChannel(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AuditChannel rename(Table<?> name) {
        return new AuditChannel(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
