package com.opps.javaInterface;

/*Write a Java program to create an interface Searchable with a method search(String keyword) 
 * that searches for a given keyword in a text document. Create two classes Document and WebPage 
 * that implement the Searchable interface and provide their own implementations of the search() method.
*/
public interface Searchable {
	boolean search(String keyword);
}

class Document implements Searchable {
	private String content;

	public Document(String content) {
		this.content = content;
	}

	public boolean search(String keyword) {
		return content.contains(keyword);
	}
}

class WebPage implements Searchable {
	private String url;
	private String htmlContent;

	public WebPage(String url, String htmlContent) {
		this.url = url;
		this.htmlContent = htmlContent;
	}

	public boolean search(String keyword) {
		return htmlContent.contains(keyword);
	}
}