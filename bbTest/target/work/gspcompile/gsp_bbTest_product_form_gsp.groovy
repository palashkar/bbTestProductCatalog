import org.bb.domain.Product
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bbTest_product_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/product/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: productInstance, field: 'data', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("product.data.label"),'default':("Data")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['name':("data"),'from':(org.bb.domain.Data.list()),'multiple':("multiple"),'optionKey':("id"),'size':("5"),'value':(productInstance?.data*.id),'class':("many-to-many")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'err_msg', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("product.err_msg.label"),'default':("Errmsg")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("err_msg"),'required':(""),'value':(productInstance?.err_msg)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: productInstance, field: 'ret_code', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("product.ret_code.label"),'default':("Retcode")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("ret_code"),'required':(""),'value':(productInstance?.ret_code)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418198368694L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
