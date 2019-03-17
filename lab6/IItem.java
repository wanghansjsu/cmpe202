public interface IItem {
    default Double getPrice() {
        return null;
    };

    default Integer getQuantity() {
        return null;
    };

    String getDescription();
}
