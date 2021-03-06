package stringbuilder;

public enum Title {

    MR("Mr."), MRS("Mrs."), DR("Dr."), PROF("Prof.");

    private String titleString;

    Title(String titleString) {
        this.titleString = titleString;
    }

    public String getTitleString() {
        return titleString;
    }
}
