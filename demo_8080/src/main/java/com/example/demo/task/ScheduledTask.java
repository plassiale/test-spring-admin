package com.example.demo.task;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class ScheduledTask {

	private Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
	private final Counter counter1;	
	private final Counter counter2;

	public ScheduledTask(MeterRegistry registry) {
		this.counter1 = registry.counter("hello-scheduled-counter", "specific-tag", "1");
		this.counter2 = registry.counter("hello-scheduled-counter", "specific-tag", "2");
	}

	@Scheduled(fixedDelay = 60000)
	public void sayHello() {
		this.counter1.increment();
		this.counter2.increment(2L);
		logger.info("Hello " + UUID.randomUUID());
	}

}
