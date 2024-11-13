package com.opps.javaInterface;

public class MainSearchable {
	public static void main(String[] args) {
		Document document = new Document("This is a sample document.");

		boolean documentContainsKeyword = document.search("sample");

		System.out.println("Document contains keyword 'sample': " + documentContainsKeyword);

		WebPage webPage = new WebPage("https://www.w3resource.com", "This is a sample webpage.");

		boolean webPageContainsKeyword = webPage.search("webpage");

		System.out.println("Webpage contains keyword 'webpage': " + webPageContainsKeyword);
	}
}
