/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables;


import io.github.yusufsdiscordbot.mystigurdian.db.Keys;
import io.github.yusufsdiscordbot.mystigurdian.db.Public;
import io.github.yusufsdiscordbot.mystigurdian.db.tables.records.UserIslamicInfoSettingsRecord;

import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class UserIslamicInfoSettings extends TableImpl<UserIslamicInfoSettingsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user_islamic_info_settings</code>
     */
    public static final UserIslamicInfoSettings USER_ISLAMIC_INFO_SETTINGS = new UserIslamicInfoSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserIslamicInfoSettingsRecord> getRecordType() {
        return UserIslamicInfoSettingsRecord.class;
    }

    /**
     * The column <code>public.user_islamic_info_settings.user_id</code>.
     */
    public final TableField<UserIslamicInfoSettingsRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>public.user_islamic_info_settings.quran_reciter_id</code>.
     */
    public final TableField<UserIslamicInfoSettingsRecord, Long> QURAN_RECITER_ID = createField(DSL.name("quran_reciter_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.user_islamic_info_settings.islamic_school</code>.
     */
    public final TableField<UserIslamicInfoSettingsRecord, String> ISLAMIC_SCHOOL = createField(DSL.name("islamic_school"), SQLDataType.VARCHAR(255).nullable(false), this, "");

    private UserIslamicInfoSettings(Name alias, Table<UserIslamicInfoSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserIslamicInfoSettings(Name alias, Table<UserIslamicInfoSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user_islamic_info_settings</code> table
     * reference
     */
    public UserIslamicInfoSettings(String alias) {
        this(DSL.name(alias), USER_ISLAMIC_INFO_SETTINGS);
    }

    /**
     * Create an aliased <code>public.user_islamic_info_settings</code> table
     * reference
     */
    public UserIslamicInfoSettings(Name alias) {
        this(alias, USER_ISLAMIC_INFO_SETTINGS);
    }

    /**
     * Create a <code>public.user_islamic_info_settings</code> table reference
     */
    public UserIslamicInfoSettings() {
        this(DSL.name("user_islamic_info_settings"), null);
    }

    public <O extends Record> UserIslamicInfoSettings(Table<O> child, ForeignKey<O, UserIslamicInfoSettingsRecord> key) {
        super(child, key, USER_ISLAMIC_INFO_SETTINGS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserIslamicInfoSettingsRecord> getPrimaryKey() {
        return Keys.USER_ISLAMIC_INFO_SETTINGS_PKEY;
    }

    @Override
    public UserIslamicInfoSettings as(String alias) {
        return new UserIslamicInfoSettings(DSL.name(alias), this);
    }

    @Override
    public UserIslamicInfoSettings as(Name alias) {
        return new UserIslamicInfoSettings(alias, this);
    }

    @Override
    public UserIslamicInfoSettings as(Table<?> alias) {
        return new UserIslamicInfoSettings(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserIslamicInfoSettings rename(String name) {
        return new UserIslamicInfoSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserIslamicInfoSettings rename(Name name) {
        return new UserIslamicInfoSettings(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserIslamicInfoSettings rename(Table<?> name) {
        return new UserIslamicInfoSettings(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
