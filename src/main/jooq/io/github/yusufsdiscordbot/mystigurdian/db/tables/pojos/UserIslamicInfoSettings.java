/*
 * This file is generated by jOOQ.
 */
package io.github.yusufsdiscordbot.mystigurdian.db.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class UserIslamicInfoSettings implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Long userId;
    private final Long quranReciterId;
    private final String islamicSchool;

    public UserIslamicInfoSettings(UserIslamicInfoSettings value) {
        this.userId = value.userId;
        this.quranReciterId = value.quranReciterId;
        this.islamicSchool = value.islamicSchool;
    }

    public UserIslamicInfoSettings(
        Long userId,
        Long quranReciterId,
        String islamicSchool
    ) {
        this.userId = userId;
        this.quranReciterId = quranReciterId;
        this.islamicSchool = islamicSchool;
    }

    /**
     * Getter for <code>public.user_islamic_info_settings.user_id</code>.
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * Getter for
     * <code>public.user_islamic_info_settings.quran_reciter_id</code>.
     */
    public Long getQuranReciterId() {
        return this.quranReciterId;
    }

    /**
     * Getter for <code>public.user_islamic_info_settings.islamic_school</code>.
     */
    public String getIslamicSchool() {
        return this.islamicSchool;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final UserIslamicInfoSettings other = (UserIslamicInfoSettings) obj;
        if (this.userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!this.userId.equals(other.userId))
            return false;
        if (this.quranReciterId == null) {
            if (other.quranReciterId != null)
                return false;
        }
        else if (!this.quranReciterId.equals(other.quranReciterId))
            return false;
        if (this.islamicSchool == null) {
            if (other.islamicSchool != null)
                return false;
        }
        else if (!this.islamicSchool.equals(other.islamicSchool))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.userId == null) ? 0 : this.userId.hashCode());
        result = prime * result + ((this.quranReciterId == null) ? 0 : this.quranReciterId.hashCode());
        result = prime * result + ((this.islamicSchool == null) ? 0 : this.islamicSchool.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserIslamicInfoSettings (");

        sb.append(userId);
        sb.append(", ").append(quranReciterId);
        sb.append(", ").append(islamicSchool);

        sb.append(")");
        return sb.toString();
    }
}
