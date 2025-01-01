package zingg.common.client.util.vertical;

public class VerticalDisplayTwoRowModel implements VerticalDisplayModel {
    private final String Field;
    private final String Value1;
    private final String Value2;

    public VerticalDisplayTwoRowModel(String Field, String Value1, String Value2) {
        this.Field = Field;
        this.Value1 = Value1;
        this.Value2 = Value2;
    }
}
