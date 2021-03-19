package io.rahul;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class ChefMenuGenerator {

	@Value("${items:closed}")
	private String[] items;

	@Value("${length:1}")
	private int fortuneLength;

	public void generate() {
		Random random = new Random();

		int wordsInSentence = 0;
		StringBuilder randomSentenceStringBuilder = new StringBuilder();

		while (fortuneLength != wordsInSentence) {
			int pos = random.nextInt(items.length);
			String item = items[pos];
			randomSentenceStringBuilder.append(item).append(" ");
			wordsInSentence++;
		}

		System.out.println(randomSentenceStringBuilder.toString());

	}

}
