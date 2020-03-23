package com.example.demo.info;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;

@Component
public class InfoContributor implements org.springframework.boot.actuate.info.InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("info_java", "detail info").build();
		
	}

}
