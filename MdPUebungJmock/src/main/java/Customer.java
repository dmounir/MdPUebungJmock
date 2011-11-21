
public class Customer implements ICustomer {

    private String Name;
    private String Vorname;
    private String Adresse;

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String aName) {
        Name = aName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVorname() {
        return Vorname;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setVorname(String aVorname) {
        Vorname = aVorname;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getAdresse() {
        return Adresse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setAdresse(String anAdresse) {
        Adresse = anAdresse;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void storeCustomer(IDatabase aDatabase) {
      
        aDatabase.writeCustomerData(this);

    }

}
