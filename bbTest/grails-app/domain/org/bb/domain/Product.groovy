/**
 * Author: Palash Kar
 * IDE: IntelliJ 10.5.4
 * Email: Kar.Palash@gmail.com
 */

package org.bb.domain

class Product {
    //List<Data> data;
    static hasMany = [data: Data]

    String err_msg;
    String ret_code;


    static constraints = {
    }
}
