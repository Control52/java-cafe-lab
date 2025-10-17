public class DishCreator {

    public static Dish createRiceWithSaira() {
        return new Dish("Рис с сайрой", "Авторское блюдо от Алексея Крыгина",
                300, 2000, Dish.DishType.MAIN, 100000);
    }

    public static Dish createPastaWithSausages() {
        return new Dish("Макароны с сосисками", "Авторское блюдо от Никиты Загибалова",
                345, 1000, Dish.DishType.MAIN, 20000);

    }

    public static Dish createСhickenInOwner() {
        return new Dish("Курица в духовке", "Авторское блюдо от Анатолия Шаповалова", 
                                    777, 2010, Dish.DishType.MAIN, 1000);
    }
}
