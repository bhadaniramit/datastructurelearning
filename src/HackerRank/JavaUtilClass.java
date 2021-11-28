package HackerRank;

import java.util.Map;

public class JavaUtilClass {
    JavaSortPOJOCLass javaSortPOJOCLass;

    public String enterTestData(Map<String, String> testData) {
        javaSortPOJOCLass = new JavaSortPOJOCLass();
        javaSortPOJOCLass.setID(Integer.parseInt(testData.get("ID")));
        javaSortPOJOCLass.setName(testData.get("FirstName"));
        javaSortPOJOCLass.setCGPA(Float.parseFloat(testData.get("CGPA")));
        return javaSortPOJOCLass.toString();
    }
}
