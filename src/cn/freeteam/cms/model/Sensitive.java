package cn.freeteam.cms.model;

import java.io.Serializable;

public class Sensitive implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_sensitive.id
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_sensitive.sensitiveword
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    private String sensitiveword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_sensitive.replaceto
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    private String replaceto;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_sensitive.id
     *
     * @return the value of freecms_sensitive.id
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_sensitive.id
     *
     * @param id the value for freecms_sensitive.id
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_sensitive.sensitiveword
     *
     * @return the value of freecms_sensitive.sensitiveword
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public String getSensitiveword() {
        return sensitiveword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_sensitive.sensitiveword
     *
     * @param sensitiveword the value for freecms_sensitive.sensitiveword
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void setSensitiveword(String sensitiveword) {
        this.sensitiveword = sensitiveword == null ? null : sensitiveword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_sensitive.replaceto
     *
     * @return the value of freecms_sensitive.replaceto
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public String getReplaceto() {
        return replaceto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_sensitive.replaceto
     *
     * @param replaceto the value for freecms_sensitive.replaceto
     *
     * @mbggenerated Sun Apr 28 15:41:01 CST 2013
     */
    public void setReplaceto(String replaceto) {
        this.replaceto = replaceto == null ? null : replaceto.trim();
    }
}