package Equipment;

public abstract class Equipment {
    private String title;
    private String description;

    public Equipment(String _title, String _description){
        title = _title;
        description = _description;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }

    public void Sound(){
        System.out.println("Abstract class is not sound...");
    }

    public void Show(){
        System.out.println("Abstract class is not object...");
    }

    public void Description(){
        System.out.println("Abstract class is not object...");
    }
}
