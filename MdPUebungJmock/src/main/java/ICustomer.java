
public interface ICustomer {
	
	/**
     * @return the name
     */
    public abstract String getName();

    /**
     * @param someName the name to set
     */
    public abstract void setName(String aName);

    /**
     * @return the vorname
     */
    public abstract String getVorname();

    /**
     * @param someVorname the vorname to set
     */
    public abstract void setVorname(String aVorname);

    /**
     * @return the adresse
     */
    public abstract String getAdresse();

    /**
     * @param someAdresse the adresse to set
     */
    public abstract void setAdresse(String anAdresse);

    /**
     * @param aDatabase the Database layer
     */
    public abstract void storeCustomer(IDatabase aDatabase);

}
