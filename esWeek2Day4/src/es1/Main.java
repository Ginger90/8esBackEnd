package es1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Prodotti> products = new ArrayList<Prodotti>() {
			{
				add(new Prodotti(1000L, "Harry Potter", "Books", 10.45));
				add(new Prodotti(1001L, "Peter Pan", "Books", 100.10));
				add(new Prodotti(1002L, "Biberon", "Baby", 10.45));
				add(new Prodotti(1003L, "Tutina", "Baby", 30.60));
				add(new Prodotti(1004L, "Game boy", "Boys", 150.70));
				add(new Prodotti(1005L, "Monopoly", "Boys", 50.89));
			}
		};
		

//		stream di Books
		Stream<Prodotti> libriStream = products.stream().filter((prodotti) -> prodotti.getCategory() == "Books").filter((prodotti) -> prodotti.getPrice()>100);
		libriStream.forEach(p -> System.out.println(p));
		
		
//		stream di Baby
		Stream<Prodotti> babyStream = products.stream().filter((prodotti)->
		prodotti.getCategory()== "Baby");
		babyStream.forEach(b -> System.out.println(b));
		
		
//		stream di Boys
		Stream<Prodotti> boyStream = products.stream().filter((prodotti) ->
		prodotti.getCategory() == "Boys");
		boyStream.forEach(b1 -> System.out.println(b1));
	}

}

class Prodotti {
	private Long id;
	private String name;
	private String category;
	private Double price;

	public Prodotti(Long a, String b, String c, Double d) {

		this.id = a;
		this.name = b;
		this.category = c;
		this.price = d;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "L'id dell'articolo è " + this.id + " Il nome dell'articolo è " + this.name + " la sua categoria è "
				+ this.category + " e il suo prezzo è " + this.price;
	}

}