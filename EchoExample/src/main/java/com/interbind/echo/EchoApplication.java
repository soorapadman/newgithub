package com.interbind.echo;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class EchoApplication extends WebApplication {

	@Override
	public Class<? extends Page> getHomePage() {
		return Echo.class;
	}

}
