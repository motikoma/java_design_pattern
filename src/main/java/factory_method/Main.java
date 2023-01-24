package factory_method;

import factory_method.framework.Factory;
import factory_method.framework.Product;
import factory_method.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // template methodパターンの応用
        // インスタンス生成をサブクラスにまかせる
        // インスタン生成のフレームワーク： framework
        // 肉付けを行っている側： idcard
        // ※Javaの static Factory methodは別物

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("yamada");
        Product card2 = factory.create("sakamoto");
        Product card3 = factory.create("inoue");
        card1.use();
        card2.use();
        card3.use();
    }
}
