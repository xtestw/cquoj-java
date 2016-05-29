package com.cquoj.dao.impl;

import com.cquoj.dao.INewsDao;
import com.cquoj.dao.IStatusDao;
import com.cquoj.model.News;
import com.cquoj.model.Status;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("statusDao")
public class StatusDao extends BaseDao<Status> implements IStatusDao {


}
