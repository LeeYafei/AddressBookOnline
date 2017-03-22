package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ContactDao;
import entity.Contact;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao {

	@Override
	public List<Contact> select(Contact con) {
		String hql ="from Contact where 1 = 1";
		if(con!=null){
			if(con.getId()!=null && con.getId()>0){
				hql+=" and id=:id";
			}
			if(con.getCname()!=null && con.getCname().length()>0 && con.getCname()!=""){
				hql+="and cname like '%'||:cname||'%'";
			}
		}else{
			con = new Contact();
		}
		return super.getSession().createQuery(hql).setProperties(con).list();
	}

	@Override
	public void insert(Contact con) {
		super.getSession().save(con);
	}

	@Override
	public void update(Contact con) {
		super.getSession().update(con);
	}

}
