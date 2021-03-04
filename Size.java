public enum Size
{
    SMALL(32, 36, "Pequeno", 'S'),
    MEDIUM(37, 44, "Médio", 'M'),
    LARGE(45, 52, "Grande", 'L');
    
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    private Size(int minValue, int maxValue, String description, char code)
    {
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    
    /**
      *return toString
     **/
    
    @Override
    public String toString()
    {
        return this.description;
    }
    
    /**
      *return metodo seletor getDescription
     **/
    public String getDescription()
    {
        return description;
    }
    
    /**
      *return metodo seletor getMinValue
     **/
    public int getMinValue()
    {
        return minValue;
    }
    
    /**
      *return metodo seletor getMaxValue
     **/
    public int getMaxValue()
    {
        return maxValue;
    }
    
    /**
      *return metodo seletor getCode
     **/
    public char getCode()
    {
        return code;
    }
    
}
