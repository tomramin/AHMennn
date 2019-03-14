package tom.r.ahmennn.Model;

import java.util.List;

public class ListCharacters {
    private List<Characters> character;

    public ListCharacters(List<Characters> character) {
        this.character = character;
    }

    public List<Characters> getCharacter() {
        return character;
    }

    public void setCharacter(List<Characters> character) {
        this.character = character;
    }
}
