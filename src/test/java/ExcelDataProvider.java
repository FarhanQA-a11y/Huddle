import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        String filePath = "src/test/resources/testdata.xlsx";
        ExcelUtils excel = new ExcelUtils(filePath, "Sheet1");

        int rowCount = excel.getRowCount();
        Object[][] data = new Object[rowCount - 1][1];

        for (int i = 1; i < rowCount; i++) {
            data[i - 1][0] = excel.getCellData(i, 0); // email
            System.out.println(data[i - 1][0]);
        }
        return data;
    }
}