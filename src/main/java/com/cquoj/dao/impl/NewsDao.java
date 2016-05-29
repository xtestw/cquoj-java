package com.cquoj.dao.impl;

import com.cquoj.dao.IMailDao;
import com.cquoj.dao.INewsDao;
import com.cquoj.model.Mail;
import com.cquoj.model.News;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("newsDao")
public class NewsDao extends BaseDao<News> implements INewsDao {


}
