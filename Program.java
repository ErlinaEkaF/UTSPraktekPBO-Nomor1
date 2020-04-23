using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UTSPBONomor3
{
    public class RetailItem
    {
        private String description;
        private int unitsOnHand;
        private double price;

        public void setDescription(String userDescription)
        {
            description = userDescription;
        }

        public void setUnitsOnHand(int userUnitsOnHand)
        {
            unitsOnHand = userUnitsOnHand;
        }

        public void setPrice(double userPrice)
        {
            price = userPrice;
        }

        public String getDescription()
        {
            return description;
        }
        public int getUnitsOnHand()
        {
            return unitsOnHand;
        }

        public Double getPrice()
        {
            return price;
        }

        public RetailItem(String descriptionGiven, int unitsOnHandGiven, double priceGiven)
        {
            description = descriptionGiven;
            unitsOnHand = unitsOnHandGiven;
            price = priceGiven;
        }
    }
}
