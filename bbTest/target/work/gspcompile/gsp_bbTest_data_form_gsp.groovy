import org.bb.domain.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bbTest_data_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: dataInstance, field: 'brandId', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("data.brandId.label"),'default':("Brand Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("brandId"),'required':(""),'value':(dataInstance?.brandId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'description', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("data.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("description"),'required':(""),'value':(dataInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'discontinued', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("data.discontinued.label"),'default':("Discontinued")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("discontinued"),'required':(""),'value':(dataInstance?.discontinued)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'name', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("data.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("name"),'required':(""),'value':(dataInstance?.name)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'numberSoldInLast30Days', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("data.numberSoldInLast30Days.label"),'default':("Number Sold In Last30 Days")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("numberSoldInLast30Days"),'required':(""),'value':(dataInstance?.numberSoldInLast30Days)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'productUrl', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("data.productUrl.label"),'default':("Product Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("productUrl"),'required':(""),'value':(dataInstance?.productUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: dataInstance, field: 'white70PxImgUrl', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("data.white70PxImgUrl.label"),'default':("White70 Px Img Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("white70PxImgUrl"),'required':(""),'value':(dataInstance?.white70PxImgUrl)],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418198355739L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
