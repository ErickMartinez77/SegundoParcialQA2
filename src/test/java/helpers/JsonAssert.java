package helpers;

import org.json.JSONObject;

import java.util.Iterator;

public class JsonAssert {
    public static boolean areEqualJson(String expectedResult, String actualResult) {
        boolean areEqual = true;

        JSONObject expectedResultJSON = new JSONObject(expectedResult);
        JSONObject actualResultJSON = new JSONObject(actualResult);

        Iterator<?> propertiesList = actualResultJSON.keys();

        while (propertiesList.hasNext()) {
            String attribute = (String) propertiesList.next();
            if (actualResultJSON.has(attribute)) {
                String expValue = String.valueOf(expectedResultJSON.get(attribute));
                String actValue = String.valueOf(actualResultJSON.get(attribute));
                if (expValue.equals("IGNORE")|| actValue.equals("IGNORE")) {
                    System.out.println("Ignorando atributo: " + attribute);
                } else if (!expValue.equals(actValue)) {
                    areEqual = false;
                    System.out.println("\nERROR> el atributo: " + attribute + " > actual: " + actValue + " vs el expected: +" + expValue);
                }
            } else {
                areEqual = false;
                System.out.println("\nERROR> el atributo no existe: "+attribute);
            }
        }
        return areEqual;
    }
}
