package com.versiontwo.microservices.configauration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("limit-service")
public class Configuaration {

	 private int minimun;
	 private int maximum;
}
