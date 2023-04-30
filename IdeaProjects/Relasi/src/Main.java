import java.util.ArrayList;
import java.util.List;

class Item {
  private final String name;
  private final int price;

  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }
}

class WishList {
  private final User user;
  private final List<Item> items;

  public WishList(User user, List<Item> items) {
    this.user = user;
    this.items = items;
  }

  public User getUser() {
    return user;
  }

  public List<Item> getItems() {
    return items;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void removeItem(Item item) {
    items.remove(item);
  }
}

class User {
  private final String name;
  private final int age;
  private final String address;
  private final WishList wishList;

  public User(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
    this.wishList = new WishList(this, new ArrayList<>());
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public List<Item> getWishList() {
    return wishList.getItems();
  }

  public void addItemToWishList(Item item) {
    wishList.addItem(item);
  }

  public void removeItemFromWishList(Item item) {
    wishList.removeItem(item);
  }
}

public class Main {
  public static void main(String[] args) {
    Item[] items = {new Item("iPhone", 1000), new Item("MacBook", 2000), new Item("iPad", 500), new Item("iWatch", 300), new Item("iPod", 200)};

    User user1 = new User("John", 20, "New York");
    for (Item item : items)
      user1.addItemToWishList(item);

    System.out.println("Name: " + user1.getName());
    System.out.println("Wishlist:");

    for (Item item : user1.getWishList()) {
      System.out.println("\t" + item.getName() + " - " + item.getPrice() + " USD");
    }

    System.out.println();

    User user2 = new User("Jane", 25, "Los Angeles");
    user2.addItemToWishList(items[0]);
    user2.addItemToWishList(items[4]);

    System.out.println("Name: " + user2.getName());
    System.out.println("Wishlist:");

    for (Item item : user2.getWishList()) {
      System.out.println("\t" + item.getName() + " - " + item.getPrice() + " USD");
    }
  }
}
