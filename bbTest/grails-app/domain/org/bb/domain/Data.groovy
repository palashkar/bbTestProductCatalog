/**
 * Author: Palash Kar
 * IDE: IntelliJ 10.5.4
 * Email: Kar.Palash@gmail.com
 */

package org.bb.domain

class Data {

   // static belongsTo = [product: Product]

    Long id;
    String white70PxImgUrl;
    String name;
    String productUrl;
    String brandId;
    String brandName;
    String description;
    Integer numberSoldInLast30Days;
    boolean discontinued;
    String brandUrl;

    static constraints = {
    }

    /*static mapping = {
      autoTimestamp true
    }*/
}
