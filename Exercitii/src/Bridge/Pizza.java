package Bridge;




public abstract class Pizza {

    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void assemble();
    public abstract void qualityCheck();

    public void setToppings(String s) {
    }

    public void setSauce(String superSecretRecipe) {
    }

    public void setCrust(String thin) {
    }
}