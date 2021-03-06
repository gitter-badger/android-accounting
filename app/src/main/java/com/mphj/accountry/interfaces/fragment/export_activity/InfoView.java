package com.mphj.accountry.interfaces.fragment.export_activity;

import com.mphj.accountry.models.db.Customer;

/**
 * Created by mphj on 11/17/17.
 */

public interface InfoView {
    int getOff();
    int getTax();
    void setTotalPriceWithOff(double totalPriceWithOff);
    void setTotalOffPrice(double totalOffPrice);
    int getTotalCustomerPrice();
    String getFactorDescription();
    Customer getCustomer();
}
