import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.HashSet;

public class dictionary {

    private HashMap<String,Integer> mainH;
    public dictionary() {
        System.out.println("entered constructor");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            HashMap<String, Integer> hashMap = objectMapper.readValue("words_dictionary.json", new TypeReference<HashMap<String, Integer>>() {});
            mainH = hashMap;
        }catch (JsonProcessingException j){
            System.out.println("encountered jpE" + j.getMessage());

        }
        System.out.println("left constructor after creating");
        System.out.println(mainH.get("aal"));
    }

    public HashMap<String, Integer> getHashMap() {
        return mainH;
    }
}
