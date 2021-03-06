using System;

/// <summary>
/// A Object holding the price, author, and title of a book
/// </summary>
/// <remarks>
/// Modified example from https://thimble.mozilla.org/en-US/anonymous/1dbb9564-0bc8-4a2e-94e8-ba6f6690fb69/304196
/// </remarks>
public class Book {

  /// <summary>
  /// Stores the author property as a String
  /// </summary>
  private String author;

  /// <summary>
  /// Stores the title property as a String
  /// </summary>
  private String title;

  /// <summary>
  /// Stores the price property as a float
  /// </summary>
  private double price;

  /// <summary>
  /// The class constructor
  /// </summary>
  /// <param name="author"> Initial author of the book</param>
  /// <param name="title"> Initial title of the book</param>
  public Book (string author, string title){
    this.price = 5.00;
    this.author = author;
    this.title = title;
  }

  /// <summary>
  /// The class constructor
  /// </summary>
  /// <param name="author"> Initial author of the book</param>
  /// <param name="title"> Initial title of the book</param>
  public Book (string author, string title, double price){
    this.price = price;
    this.author = author;
    this.title = title;
  }

  /// <summary>
  /// Returns the author of the book
  /// </summary>
  /// <returns> The author of the book as a string </returns>
  public string getAuthor() {
    return this.author;
  }

  /// <summary>
  /// Returns the title of the book
  /// </summary>
  /// <returns> The title of the book as a string </returns>
  public string getTitle() {
    return this.title;
  }

  /// <summary>
  /// Returns the price of the book
  /// </summary>
  /// <returns> The price of the book as a double </returns>
  public double getPrice() {
    return price;
  }

  /// <summary>
  /// Attempts to increase the price of the book
  /// </summary>
  /// <param="increase"> Price to increase by </param>
  /// <returns> true if it is successful in modifying the price, false otherwise. </returns>
  public bool increasePrice(double increase) {
    //Can put in a section here to ensure success of increase.
    //Going to assume success in adding the increase to the price.

    price = price + increase;
    return true;
  }
}

class MainClass {
  public static void Main (string[] args) {
    Book bookOne = new Book("Terry Pratchett", "Guards! Guards!", 5.99);
    Book bookTwo = new Book("Robert Jordan", "The Eye of the World", 8.99);
    Console.WriteLine(bookOne.getAuthor());
    Console.WriteLine(bookOne.getPrice());
    Console.WriteLine(bookOne.getTitle());
    bookOne.increasePrice(1.00);
    Console.WriteLine(bookOne.getPrice());

    Console.WriteLine(bookTwo.getAuthor());
    Console.WriteLine(bookTwo.getPrice());
    Console.WriteLine(bookTwo.getTitle());
    bookTwo.increasePrice(-6.00);
    Console.WriteLine(bookTwo.getPrice());
  }
}