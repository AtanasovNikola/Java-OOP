package interfaces.collectionHierarchy;

public class AddRemoveCollection extends Collection implements Removable{
    @Override
    public int add(String item) {
        getItems().add(0, item);
        return 0;
    }

    @Override
    public String remove() {
        return getItems().remove(getItems().size() - 1);
    }
}
