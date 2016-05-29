package com.cquoj.dao.impl;

import com.cquoj.dao.IMailDao;
import com.cquoj.dao.IProblemDao;
import com.cquoj.model.Mail;
import com.cquoj.model.Problem;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2015/11/18.
 */
@Repository("mailDao")
public class MailDao extends BaseDao<Mail> implements IMailDao {


}
