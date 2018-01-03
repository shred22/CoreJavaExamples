package serializationDemo;


public class CityAndState
{
   private final String cityName;
   private final String stateName;

   public CityAndState(final String newCityName, final String newStateName)
   {
      this.cityName = newCityName;
      this.stateName = newStateName;
   }

   public String getCityName()
   {
      return this.cityName;
   }

   public String getStateName()
   {
      return this.stateName;
   }

   @Override
   public String toString()
   {
      return this.cityName + ", " + this.stateName;
   }
}