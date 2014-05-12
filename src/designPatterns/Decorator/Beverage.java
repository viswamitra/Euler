package designPatterns.Decorator;

/**
 * Created by abhiramk on 19/01/14.
 */
public abstract class  Beverage {

    private String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
