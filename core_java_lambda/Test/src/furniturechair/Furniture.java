package furniturechair;


class Furniture {
 private double price;

 public Furniture(double price) {
     this.price = price;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 public void displayDetails() {
     System.out.println("Furniture price: $" + price);
 }
}

