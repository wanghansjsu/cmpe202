public class Component implements IComposite{

    private String description;
    private String[] options;

    public Component(String description) {
        this.description = description;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    /**
     * Do Nothing Here
     * @param composite The Composite to Add
     */
    public void addChild(IComposite composite) {}

    /**
     * Do Nothing Here
     * @param composite The Composite to Remove
     */
    public void removeChild(IComposite composite) {}

    public String getDescription() {
        StringBuffer sb = new StringBuffer();
        for(String o : options) {
            if(sb.length() > 0)
                sb.append(" + ");

            sb.append(o);
        }

        return sb.toString();
    }

    /**
     * Do Nothing Here
     * @param index The Index of Composite to Get
     * @return null
     */
    public IComposite getChild(int index) {
        return null;
    }

}
