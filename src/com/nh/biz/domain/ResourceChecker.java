package com.nh.biz.domain;

public class ResourceChecker {
	 /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column ResourceActor.id
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
	public ResourceChecker(Integer titleid,Integer userid){
			this.titleid = titleid;
			this.userid = userid;
	}
	
	public ResourceChecker(){
			
	}
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column ResourceActor.titleId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    private Integer titleid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column ResourceActor.userId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    private Integer userid;

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column ResourceActor.id
     *
     * @return the value of ResourceActor.id
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column ResourceActor.id
     *
     * @param id the value for ResourceActor.id
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column ResourceActor.titleId
     *
     * @return the value of ResourceActor.titleId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public Integer getTitleid() {
        return titleid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column ResourceActor.titleId
     *
     * @param titleid the value for ResourceActor.titleId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column ResourceActor.userId
     *
     * @return the value of ResourceActor.userId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column ResourceActor.userId
     *
     * @param userid the value for ResourceActor.userId
     *
     * @abatorgenerated Mon Mar 19 22:17:31 CST 2012
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
