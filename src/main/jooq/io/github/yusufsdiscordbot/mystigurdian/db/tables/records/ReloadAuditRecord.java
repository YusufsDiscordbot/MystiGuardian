/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.records;


import io.github.yusufsdiscordbot.mystigurdian.db.tables.ReloadAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class ReloadAuditRecord extends TableRecordImpl<ReloadAuditRecord> implements Record4<String, String, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Create a detached ReloadAuditRecord
     */
    public ReloadAuditRecord() {
        super(ReloadAudit.RELOAD_AUDIT);
    }

    /**
     * Create a detached, initialised ReloadAuditRecord
     */
    public ReloadAuditRecord(String reason, String userId, Long id, OffsetDateTime time) {
        super(ReloadAudit.RELOAD_AUDIT);

        setReason(reason);
        setUserId(userId);
        setId(id);
        setTime(time);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ReloadAuditRecord
     */
    public ReloadAuditRecord(io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos.ReloadAudit value) {
        super(ReloadAudit.RELOAD_AUDIT);

        if (value != null) {
            setReason(value.getReason());
            setUserId(value.getUserId());
            setId(value.getId());
            setTime(value.getTime());
            resetChangedOnNotNull();
        }
    }

    /**
     * Getter for <code>public.reload_audit.reason</code>.
     */
    public String getReason() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.reload_audit.reason</code>.
     */
    public ReloadAuditRecord setReason(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.reload_audit.user_id</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.reload_audit.user_id</code>.
     */
    public ReloadAuditRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.reload_audit.id</code>.
     */
    public Long getId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * Setter for <code>public.reload_audit.id</code>.
     */
    public ReloadAuditRecord setId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.reload_audit.time</code>.
     */
    public OffsetDateTime getTime() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.reload_audit.time</code>.
     */
    public ReloadAuditRecord setTime(OffsetDateTime value) {
        set(3, value);
        return this;
    }

    @Override
    public Row4<String, String, Long, OffsetDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Long, OffsetDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ReloadAudit.RELOAD_AUDIT.REASON;
    }

    @Override
    public Field<String> field2() {
        return ReloadAudit.RELOAD_AUDIT.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return ReloadAudit.RELOAD_AUDIT.ID;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return ReloadAudit.RELOAD_AUDIT.TIME;
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
    public Long component3() {
        return getId();
    }

    @Override
    public OffsetDateTime component4() {
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
    public Long value3() {
        return getId();
    }

    @Override
    public OffsetDateTime value4() {
        return getTime();
    }

    @Override
    public ReloadAuditRecord value1(String value) {
        setReason(value);
        return this;
    }

    @Override
    public ReloadAuditRecord value2(String value) {
        setUserId(value);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    @Override
    public ReloadAuditRecord value3(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ReloadAuditRecord value4(OffsetDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public ReloadAuditRecord values(String value1, String value2, Long value3, OffsetDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }
}
