package data;

import model.Parameters;
import org.testng.annotations.DataProvider;
import java.util.List;

public class ParametersDataProvider {

    @DataProvider(name = "paramData")
    public Object[][] accountTestData() {
        List<Parameters> parametersList = DataLoader.load();
        return parametersList.stream()
                .map(data -> new Parameters[]{data})
                .toArray(Object[][]::new);
    }
}
