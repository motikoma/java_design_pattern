package factory_method.idcard;

import factory_method.framework.Factory;
import factory_method.framework.Product;

public class IDCardFactory extends Factory {
  @Override
  public Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  public void registerProduct(Product product) {
    System.out.println(product + "を登録しました。");
  }
}
