package cn.freeteam.cms.model;

import java.io.Serializable;

public class Answer implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.id
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.questionid
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private String questionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.name
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.isok
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private String isok;
    private String isselect;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.ordernum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private Integer ordernum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_answer.selectnum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    private Integer selectnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.id
     *
     * @return the value of freecms_answer.id
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.id
     *
     * @param id the value for freecms_answer.id
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.questionid
     *
     * @return the value of freecms_answer.questionid
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public String getQuestionid() {
        return questionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.questionid
     *
     * @param questionid the value for freecms_answer.questionid
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setQuestionid(String questionid) {
        this.questionid = questionid == null ? null : questionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.name
     *
     * @return the value of freecms_answer.name
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.name
     *
     * @param name the value for freecms_answer.name
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.isok
     *
     * @return the value of freecms_answer.isok
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public String getIsok() {
        return isok;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.isok
     *
     * @param isok the value for freecms_answer.isok
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.ordernum
     *
     * @return the value of freecms_answer.ordernum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.ordernum
     *
     * @param ordernum the value for freecms_answer.ordernum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_answer.selectnum
     *
     * @return the value of freecms_answer.selectnum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public Integer getSelectnum() {
        return selectnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_answer.selectnum
     *
     * @param selectnum the value for freecms_answer.selectnum
     *
     * @mbggenerated Tue Jan 22 13:12:51 CST 2013
     */
    public void setSelectnum(Integer selectnum) {
        this.selectnum = selectnum;
    }

	public String getIsselect() {
		return isselect;
	}

	public void setIsselect(String isselect) {
		this.isselect = isselect;
	}
}