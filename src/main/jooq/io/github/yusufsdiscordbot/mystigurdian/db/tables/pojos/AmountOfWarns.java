/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes", "this-escape"})
public class AmountOfWarns implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Integer amountOfWarns;
    private final String userId;
    private final String guildId;
    private final Long id;

    public AmountOfWarns(AmountOfWarns value) {
        this.amountOfWarns = value.amountOfWarns;
        this.userId = value.userId;
        this.guildId = value.guildId;
        this.id = value.id;
    }

    public AmountOfWarns(
            Integer amountOfWarns,
            String userId,
            String guildId,
            Long id
    ) {
        this.amountOfWarns = amountOfWarns;
        this.userId = userId;
        this.guildId = guildId;
        this.id = id;
    }

    /**
     * Getter for <code>public.amount_of_warns.amount_of_warns</code>.
     */
    public Integer getAmountOfWarns() {
        return this.amountOfWarns;
    }

    /**
     * Getter for <code>public.amount_of_warns.user_id</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.amount_of_warns.guild_id</code>.
     */
    public String getGuildId() {
        return this.guildId;
    }

    /**
     * Getter for <code>public.amount_of_warns.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AmountOfWarns other = (AmountOfWarns) obj;
        if (this.amountOfWarns == null) {
            if (other.amountOfWarns != null)
                return false;
        } else if (!this.amountOfWarns.equals(other.amountOfWarns))
            return false;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        } else if (!this.userId.equals(other.userId))
            return false;
        if (this.guildId == null) {
            if (other.guildId != null)
                return false;
        } else if (!this.guildId.equals(other.guildId))
            return false;
        if (this.id == null) {
            if (other.id != null)
                return false;
        } else if (!this.id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.amountOfWarns == null) ? 0 : this.amountOfWarns.hashCode());
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.guildId == null) ? 0 : this.guildId.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AmountOfWarns (");

        sb.append(amountOfWarns);
        sb.append(", ").append(userId);
        sb.append(", ").append(guildId);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
