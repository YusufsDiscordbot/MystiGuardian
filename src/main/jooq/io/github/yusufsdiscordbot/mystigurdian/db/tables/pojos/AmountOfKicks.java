/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AmountOfKicks implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String userId;
    private final String guildId;
    private final Long id;
    private final Integer amountOfKicks;

    public AmountOfKicks(AmountOfKicks value) {
        this.userId = value.userId;
        this.guildId = value.guildId;
        this.id = value.id;
        this.amountOfKicks = value.amountOfKicks;
    }

    public AmountOfKicks(
        String userId,
        String guildId,
        Long id,
        Integer amountOfKicks
    ) {
        this.userId = userId;
        this.guildId = guildId;
        this.id = id;
        this.amountOfKicks = amountOfKicks;
    }

    /**
     * Getter for <code>public.amount_of_kicks.user_id</code>.
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Getter for <code>public.amount_of_kicks.guild_id</code>.
     */
    public String getGuildId() {
        return this.guildId;
    }

    /**
     * Getter for <code>public.amount_of_kicks.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.amount_of_kicks.amount_of_kicks</code>.
     */
    public Integer getAmountOfKicks() {
        return this.amountOfKicks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final AmountOfKicks other = (AmountOfKicks) obj;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.guildId == null) {
            if (other.guildId != null)
                return false;
        }
        else if (!this.guildId.equals(other.guildId))
            return false;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.amountOfKicks == null) {
            if (other.amountOfKicks != null)
                return false;
        }
        else if (!this.amountOfKicks.equals(other.amountOfKicks))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.guildId == null) ? 0 : this.guildId.hashCode());
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.amountOfKicks == null) ? 0 : this.amountOfKicks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AmountOfKicks (");

        sb.append(userId);
        sb.append(", ").append(guildId);
        sb.append(", ").append(id);
        sb.append(", ").append(amountOfKicks);

        sb.append(")");
        return sb.toString();
    }
}
