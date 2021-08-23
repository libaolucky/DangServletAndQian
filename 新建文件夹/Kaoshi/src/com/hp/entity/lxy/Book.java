package com.hp.entity.lxy;

import java.util.Date;

public class Book {
private int id;
private int cate_id;
private String book_name;
private int page_number;
private int word_number;
private double original_price;
private String cover;
private double discount_price;
private int repertory;
private String author;
private String  edit_recommend;
private String publish_company;
private Date publish_time;
private String prospectus;
private String edition;
private Date  print_time;
private String author_intro;
private String print_number;
private int isbn;
private String catalog;
private String book_size;
private String paper_type;
private String media_comment;
private String pack_type;
private int sales_volume;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCate_id() {
	return cate_id;
}
public void setCate_id(int cate_id) {
	this.cate_id = cate_id;
}
public String getBook_name() {
	return book_name;
}
public void setBook_name(String book_name) {
	this.book_name = book_name;
}
public int getPage_number() {
	return page_number;
}
public void setPage_number(int page_number) {
	this.page_number = page_number;
}
public int getWord_number() {
	return word_number;
}
public void setWord_number(int word_number) {
	this.word_number = word_number;
}
public double getOriginal_price() {
	return original_price;
}
public void setOriginal_price(double original_price) {
	this.original_price = original_price;
}
public String getCover() {
	return cover;
}
public void setCover(String cover) {
	this.cover = cover;
}
public double getDiscount_price() {
	return discount_price;
}
public void setDiscount_price(double discount_price) {
	this.discount_price = discount_price;
}
public int getRepertory() {
	return repertory;
}
public void setRepertory(int repertory) {
	this.repertory = repertory;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getEdit_recommend() {
	return edit_recommend;
}
public void setEdit_recommend(String edit_recommend) {
	this.edit_recommend = edit_recommend;
}
public String getPublish_company() {
	return publish_company;
}
public void setPublish_company(String publish_company) {
	this.publish_company = publish_company;
}
public Date getPublish_time() {
	return publish_time;
}
public void setPublish_time(Date publish_time) {
	this.publish_time = publish_time;
}
public String getProspectus() {
	return prospectus;
}
public void setProspectus(String prospectus) {
	this.prospectus = prospectus;
}
public String getEdition() {
	return edition;
}
public void setEdition(String edition) {
	this.edition = edition;
}
public Date getPrint_time() {
	return print_time;
}
public void setPrint_time(Date print_time) {
	this.print_time = print_time;
}
public String getAuthor_intro() {
	return author_intro;
}
public void setAuthor_intro(String author_intro) {
	this.author_intro = author_intro;
}
public String getPrint_number() {
	return print_number;
}
public void setPrint_number(String print_number) {
	this.print_number = print_number;
}
public int getIsbn() {
	return isbn;
}
public void setIsbn(int isbn) {
	this.isbn = isbn;
}
public String getCatalog() {
	return catalog;
}
public void setCatalog(String catalog) {
	this.catalog = catalog;
}
public String getBook_size() {
	return book_size;
}
public void setBook_size(String book_size) {
	this.book_size = book_size;
}
public String getPaper_type() {
	return paper_type;
}
public void setPaper_type(String paper_type) {
	this.paper_type = paper_type;
}
public String getMedia_comment() {
	return media_comment;
}
public void setMedia_comment(String media_comment) {
	this.media_comment = media_comment;
}
public String getPack_type() {
	return pack_type;
}
public void setPack_type(String pack_type) {
	this.pack_type = pack_type;
}
public int getSales_volume() {
	return sales_volume;
}
public void setSales_volume(int sales_volume) {
	this.sales_volume = sales_volume;
}
public Book(int id, int cate_id, String book_name, int page_number,
		int word_number, double original_price, String cover,
		double discount_price, int repertory, String author,
		String edit_recommend, String publish_company, Date publish_time,
		String prospectus, String edition, Date print_time,
		String author_intro, String print_number, int isbn, String catalog,
		String book_size, String paper_type, String media_comment,
		String pack_type, int sales_volume) {
	super();
	this.id = id;
	this.cate_id = cate_id;
	this.book_name = book_name;
	this.page_number = page_number;
	this.word_number = word_number;
	this.original_price = original_price;
	this.cover = cover;
	this.discount_price = discount_price;
	this.repertory = repertory;
	this.author = author;
	this.edit_recommend = edit_recommend;
	this.publish_company = publish_company;
	this.publish_time = publish_time;
	this.prospectus = prospectus;
	this.edition = edition;
	this.print_time = print_time;
	this.author_intro = author_intro;
	this.print_number = print_number;
	this.isbn = isbn;
	this.catalog = catalog;
	this.book_size = book_size;
	this.paper_type = paper_type;
	this.media_comment = media_comment;
	this.pack_type = pack_type;
	this.sales_volume = sales_volume;
}
public Book(int cate_id, String book_name, int page_number,
		int word_number, double original_price, String cover,
		double discount_price, int repertory, String author,
		String edit_recommend, String publish_company, Date publish_time,
		String prospectus, String edition, Date print_time,
		String author_intro, String print_number, int isbn, String catalog,
		String book_size, String paper_type, String media_comment,
		String pack_type, int sales_volume) {
	super();
	this.cate_id = cate_id;
	this.book_name = book_name;
	this.page_number = page_number;
	this.word_number = word_number;
	this.original_price = original_price;
	this.cover = cover;
	this.discount_price = discount_price;
	this.repertory = repertory;
	this.author = author;
	this.edit_recommend = edit_recommend;
	this.publish_company = publish_company;
	this.publish_time = publish_time;
	this.prospectus = prospectus;
	this.edition = edition;
	this.print_time = print_time;
	this.author_intro = author_intro;
	this.print_number = print_number;
	this.isbn = isbn;
	this.catalog = catalog;
	this.book_size = book_size;
	this.paper_type = paper_type;
	this.media_comment = media_comment;
	this.pack_type = pack_type;
	this.sales_volume = sales_volume;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [id=" + id + ", cate_id=" + cate_id + ", book_name="
			+ book_name + ", page_number=" + page_number + ", word_number="
			+ word_number + ", original_price=" + original_price + ", cover="
			+ cover + ", discount_price=" + discount_price + ", repertory="
			+ repertory + ", author=" + author + ", edit_recommend="
			+ edit_recommend + ", publish_company=" + publish_company
			+ ", publish_time=" + publish_time + ", prospectus=" + prospectus
			+ ", edition=" + edition + ", print_time=" + print_time
			+ ", author_intro=" + author_intro + ", print_number="
			+ print_number + ", isbn=" + isbn + ", catalog=" + catalog
			+ ", book_size=" + book_size + ", paper_type=" + paper_type
			+ ", media_comment=" + media_comment + ", pack_type=" + pack_type
			+ ", sales_volume=" + sales_volume + "]";
}

}
