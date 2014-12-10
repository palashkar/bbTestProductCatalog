import grails.converters.JSON
import org.bb.domain.Product

class BootStrap {

    def init = { servletContext ->

        // load first set of data
        def initialLoad = System.currentTimeMillis()
        def url = new URL("http://api.bodybuilding.com/api-proxy/commerce/products")
        def product = new Product(JSON.parse(url.newReader()))

        product.data.each{
            def brandUrl = new URL("http://api.bodybuilding.com/api-proxy/commerce/brand/${it.brandId}")
            def productBrandUrl = new Product(JSON.parse(brandUrl.newReader()))
            it.brandUrl = productBrandUrl?.data?.brandUrl[0]
            it.save()
        }

        def postLoad  = System.currentTimeMillis()
        println "Time (sec) taken to parse 1st set or records : " + ((postLoad - initialLoad)/1000)


/*

        // load 2nd set of large data, takes a longer time to save so commented but once saved same as above not much performance issues as mostly server side fetch
        url = new URL("http://api.bodybuilding.com/api-proxy/commerce/products?page=0&pageSize=20000")
        initialLoad = System.currentTimeMillis()
        product = new Product(JSON.parse(url.newReader()))
        postLoad  = System.currentTimeMillis()
        println "Time (sec) taken to parse 2nd set of records : " + ((postLoad - initialLoad)/1000)
        long counter = 0;
        product.data.each{
            def brandUrl = new URL("http://api.bodybuilding.com/api-proxy/commerce/brand/${it.brandId}")
            def productBrandUrl = new Product(JSON.parse(brandUrl.newReader()))
            it.brandUrl = productBrandUrl?.data?.brandUrl[0]
            it.save()
            println("Row Count : " + counter++);
        }

        def postSave  = System.currentTimeMillis()
        println "Time (sec) taken to parse : " + ((postSave - initialLoad)/1000)
*/




    }
    def destroy = {
    }
}
