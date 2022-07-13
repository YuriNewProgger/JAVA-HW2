package Equipment;

public class Ship extends Equipment{
    public Ship(String _title, String _description) {
        super(_title, _description);
    }

    @Override
    public void Show() {
        System.out.println(getTitle());
    }

    @Override
    public void Description() {
        System.out.println(getDescription());
    }

    @Override
    public void Sound() {
        System.out.println("Bul-bul");
    }
}
