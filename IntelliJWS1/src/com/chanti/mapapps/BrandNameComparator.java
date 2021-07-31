package com.chanti.mapapps;

import java.util.Comparator;

public class BrandNameComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getBrandName().compareTo(o2.getBrandName());
    }

}
