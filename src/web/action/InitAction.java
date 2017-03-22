package web.action;

import org.apache.struts2.convention.annotation.Action;

import biz.ContactBiz;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Contact;

public class InitAction extends ActionSupport {
	private ContactBiz contactBiz;
	private Contact con;
	public Contact getCon() {
		return con;
	}

	public void setCon(Contact con) {
		this.con = con;
	}

	public ContactBiz getContactBiz() {
		return contactBiz;
	}

	public void setContactBiz(ContactBiz contactBiz) {
		this.contactBiz = contactBiz;
	}

	@Override
	public String execute() throws Exception {
		
		ActionContext.getContext().put("cs", contactBiz.findAll(null));
		
		return SUCCESS;
	}
	
	public String findLike(){
		ActionContext.getContext().put("cs", contactBiz.findAll(con));
		
		return SUCCESS;
	}
}
