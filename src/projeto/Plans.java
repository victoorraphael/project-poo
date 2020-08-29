package projeto;

public class Plans {
	private double price;
  private String period;
  private Boolean promocode;

  public Plans(String price, String period, Boolean promocode) {
    this.price = price;
    this.period = period;
    this.promocode = promocode;
  }
	
  public double getPrice(){
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  public String getPeriod(){
    return period;
  }

  public void setPeriod(String period){
    this.period = period;
  }

  public Boolean getPromocode(){
    return promocode;
  }

  public void setPromocode(Boolean promocode) {
    this.promocode = promocode;
  }
}