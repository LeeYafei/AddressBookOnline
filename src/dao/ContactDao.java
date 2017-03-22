package dao;

import java.util.List;

import entity.Contact;

public interface ContactDao {
	public abstract List<Contact> select(Contact con);
	
	public abstract void insert(Contact con);
	
	public abstract void update(Contact con);
}
