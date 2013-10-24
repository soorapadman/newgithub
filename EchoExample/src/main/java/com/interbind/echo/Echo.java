package com.interbind.echo;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class Echo extends WebPage {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = "Enter a message";

	public Echo() {
        PropertyModel<String> messageModel = 
        	new PropertyModel<String>(this, "message");
     
        add(new Label("msg", messageModel));

        Form<?> form = new Form("form");
        form.add(new TextField<String>("msgInput", messageModel));
        add(form);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
