package interfaces.collectionHierarchy;

public class AddCollection extends Collection implements Addable{


    @Override
    public int add(String item) {
         super.getItems().add(item);
         return getItems().size()-1;
    }
}
