import org.bb.domain.Data
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_bbTest_dataindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/data/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'data.label', default: 'Data'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',26,['property':("brandId"),'title':(message(code: 'data.brandId.label', default: '#'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',28,['property':("brandId"),'title':(message(code: 'data.brandId.label', default: 'Product Image'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',30,['property':("name"),'title':(message(code: 'data.brandName.label', default: 'Brand'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',32,['property':("description"),'title':(message(code: 'data.name.label', default: 'Product Name'))],-1)
printHtmlPart(15)
invokeTag('sortableColumn','g',34,['property':("numberSoldInLast30Days"),'title':(message(code: 'data.description.label', default: 'Brief Description'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',36,['property':("discontinued"),'title':(message(code: 'data.numberSoldInLast30Days.label', default: 'Quantity Sold'))],-1)
printHtmlPart(16)

Integer count = Integer.valueOf(offset == null ? 0 : offset);
                     //count = Integer.valueOf(${offset ?: 0}) + Integer.valueOf(${max ?: 0});

printHtmlPart(17)
loop:{
int i = 0
for( dataInstance in (dataInstanceList) ) {
printHtmlPart(18)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(19)
expressionOut.print((count + i + 1))
printHtmlPart(20)
invokeTag('img','g',52,['uri':("http://store.bbcomcdn.com${dataInstance.white70PxImgUrl}")],-1)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: dataInstance, field: "brandName"))
})
invokeTag('link','g',54,['url':("http://www.bodybuilding.com/store${dataInstance.brandUrl}"),'id':(dataInstance.brandName)],3)
printHtmlPart(21)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: dataInstance, field: "name"))
})
invokeTag('link','g',56,['url':("http://www.bodybuilding.com/store${dataInstance.productUrl}"),'id':(dataInstance.productUrl)],3)
printHtmlPart(22)
expressionOut.print(fieldValue(bean: dataInstance, field: "description"))
printHtmlPart(20)
expressionOut.print(fieldValue(bean: dataInstance, field: "numberSoldInLast30Days"))
printHtmlPart(23)
i++
}
}
printHtmlPart(24)
invokeTag('paginate','g',68,['total':(dataInstanceCount ?: 0)],-1)
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',71,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1418208372957L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
