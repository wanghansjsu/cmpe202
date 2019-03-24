public interface IComposite {

    void addChild(IComposite composite);

    void removeChild(IComposite composite);

    String getDescription();

    IComposite getChild(int index);
}
