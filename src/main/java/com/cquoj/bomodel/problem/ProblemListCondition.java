package com.cquoj.bomodel.problem;

/**
 * Class description
 *
 *
 * @version        1.0, 16/05/09
 * @author         xuwei   
 */
public class ProblemListCondition {

    /** current page size */
    private int pageSize;

    /**  number in each page*/
    private int pageNum;

    /** which oj user selected */
    private String oj;

    /** order KEY, DEC? INC? */
    private String orderKey;

    /** Order Column */
    private String orderColumn;

    /**
     * Method description
     *
     *
     * @return
     */
    public String getOj() {
        return oj;
    }

    /**
     * Method description
     *
     *
     * @param oj
     */
    public void setOj(String oj) {
        this.oj = oj;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public String getOrderColumn() {
        return orderColumn;
    }

    /**
     * Method description
     *
     *
     * @param orderColumn
     */
    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public String getOrderKey() {
        return orderKey;
    }

    /**
     * Method description
     *
     *
     * @param orderKey
     */
    public void setOrderKey(String orderKey) {
        this.orderKey = orderKey;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Method description
     *
     *
     * @param pageNum
     */
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Method description
     *
     *
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}


