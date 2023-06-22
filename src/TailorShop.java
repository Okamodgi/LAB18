
public class TailorShop {
    public void dressMen(Clothing[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothing clothing : clothes) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: " + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((MenClothing) clothing).dressMen();
        }
    }
    public void dressWomen(Clothing[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothing clothing : clothes) {
            System.out.println("Размер: " + clothing.getSize() + ", Цена: " + clothing.getCost() + ", Цвет: " + clothing.getColor());
            ((WomenClothing) clothing).dressWomen();
        }
    }
}