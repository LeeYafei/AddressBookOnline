package biz;

import java.util.List;

import entity.Contact;

public interface ContactBiz {
	public List<Contact> findAll(Contact con);
	public void add(Contact con);
	public void modify(Contact con);
}
