package biz.impl;

import java.util.List;

import dao.ContactDao;
import entity.Contact;
import biz.ContactBiz;

public class ContactBizImpl implements ContactBiz {
	private ContactDao contactDao;
	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public List<Contact> findAll(Contact con) {
		
		return contactDao.select(con);
	}

	@Override
	public void add(Contact con) {
		
		contactDao.insert(con);
	}

	@Override
	public void modify(Contact con) {
		
		contactDao.update(con);
	}

}
