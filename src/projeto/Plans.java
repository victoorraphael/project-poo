package projeto;

public class Plans {
	
	private String name;
	private double price;
	private String period;
	private int id;

    public Plans(String name, double price, String period, Boolean promocode, int id) {
      this.name = name;
      this.price = price;
      this.period = period;
      this.id = id;
    }
    
    public String getName() {
      return name;
    }
    
    public void setName(String name) {
      this.name = name;
    }

    public double getPrice() {
      return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public String getPeriod() {
      return period;
    }

    public void setPeriod(String period) {
      this.period = period;
    }

    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
}
